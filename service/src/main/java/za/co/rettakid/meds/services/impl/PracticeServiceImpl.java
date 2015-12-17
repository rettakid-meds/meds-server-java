package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;
import za.co.rettakid.meds.services.PracticeService;
import za.co.rettakid.meds.services.binding.BindDoctor;
import za.co.rettakid.meds.services.binding.BindField;
import za.co.rettakid.meds.services.binding.BindPractice;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.ByteArrayInputStream;
import java.io.File;
import java.io.IOException;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

@Service
@Transactional
public class PracticeServiceImpl implements PracticeService {

    @Autowired
    private PracticeDao practiceDao;
    @Autowired
    private FileDao fileDao;
    @Autowired
    private ImageDao imageDao;
    @Autowired
    private DataContentDao dataContentDao;
    @Autowired
    private TradingHourDao tradingHourDao;
    @Autowired
    private TradingDayDao tradingDayDao;

    @Override
    public PracticeListDto getPractices() {
        PracticeListDto practiceListDto = new PracticeListDto();
        practiceListDto.addPracticeList(BindPractice.bindPracticeEntityList(practiceDao.read()));
        return practiceListDto;
    }

    @Override
    public PracticeDto getPractices(Long practiceId) {
        PracticeEntity practiceEntity = practiceDao.read(practiceId);
        PracticeDto practiceDto = BindPractice.bindPractice(practiceEntity);
        practiceDto.setDoctorPracticePractices(linkDoctors(practiceEntity.getDoctorPracticePractices()));
        return practiceDto;
    }

    private DoctorPracticeListDto linkDoctors(List<DoctorPracticeEntity> doctorPracticeEntities)   {
        DoctorPracticeListDto doctorPracticeListDto = new DoctorPracticeListDto();
        List<DoctorPracticeDto> doctorPracticeDtos = new ArrayList<>();
        for (DoctorPracticeEntity doctorPracticeEntity : doctorPracticeEntities) {
            DoctorPracticeDto doctorPracticeDto = new DoctorPracticeDto();
            doctorPracticeDto.setMedsDoctorPracticeId(doctorPracticeEntity.getMedsDoctorPracticeId());
            DoctorDto doctorDto = BindDoctor.bindDoctor(doctorPracticeEntity.getDoctor());
            doctorDto.setDoctorFieldDoctors(linkFieldsToDoctor(doctorPracticeEntity.getDoctor().getDoctorFieldDoctors()));
            doctorPracticeDto.setDoctor(doctorDto);
            doctorPracticeDtos.add(doctorPracticeDto);
        }
        doctorPracticeListDto.addDoctorPracticeList(doctorPracticeDtos);
        return doctorPracticeListDto;
    }

    private DoctorFieldListDto linkFieldsToDoctor(List<DoctorFieldEntity> doctorFieldEntities)  {
        DoctorFieldListDto doctorFieldListDto = new DoctorFieldListDto();
        List<DoctorFieldDto> doctorFieldDtos = new ArrayList<>();
        for (DoctorFieldEntity doctorFieldEntity : doctorFieldEntities) {
            DoctorFieldDto doctorFieldDto = new DoctorFieldDto();
            doctorFieldDto.setDoctorFieldId(doctorFieldEntity.getDoctorFieldId());
            doctorFieldDto.setField(BindField.bindField(doctorFieldEntity.getField()));
            doctorFieldDtos.add(doctorFieldDto);
        }
        doctorFieldListDto.addDoctorFieldList(doctorFieldDtos);
        return doctorFieldListDto;
    }

    @Override
    public PracticeDto postPractices(PracticeDto practiceDto, byte[] imageFile) throws IOException {
        PracticeEntity practiceEntity = BindPractice.bindPractice(practiceDto, new PracticeEntity());
        practiceEntity.setImage(saveImage(imageFile, "practice" + practiceDto.getPracticeId() + ".png"));
        dataContentDao.createOrUpdate(practiceEntity.getBio());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getMonday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getTuesday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getWednesday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getThursday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getFriday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getSaturday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getSunday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getPubicHoliday());
        tradingDayDao.createOrUpdate(practiceEntity.getTradingDay());
        practiceDao.createOrUpdate(practiceEntity);
        return BindPractice.bindPractice(practiceEntity);
    }

    private ImageEntity saveImage(byte[] imageFile, String imgName) throws IOException {
        FileEntity fileEntity = new FileEntity();
        fileEntity.setName(imgName);
        fileEntity.setGuid(java.util.UUID.randomUUID().toString());
        fileEntity.setEffFrm(new Date());
        fileDao.createOrUpdate(fileEntity);
        ImageEntity imageEntity = new ImageEntity();
        imageEntity.setFile(fileEntity);
        imageEntity.setHeight(200);
        imageEntity.setWidth(200);
        imageDao.createOrUpdate(imageEntity);
        InputStream in = new ByteArrayInputStream(imageFile);
        BufferedImage bufferedImage = ImageIO.read(in);
        ImageIO.write(bufferedImage, "png", new File("C:\\images\\" + fileEntity.getGuid()));
        return imageEntity;
    }

    @Override
    public void putPractices(PracticeDto practiceDto, byte[] imageFile) throws IOException {
        PracticeEntity practiceEntity = BindPractice.bindPractice(practiceDto, practiceDao.read(practiceDto.getPracticeId()));
        if (imageFile != null) {
            practiceEntity.setImage(saveImage(imageFile, "practice" + practiceDto.getPracticeId() + ".png"));
        }
        dataContentDao.createOrUpdate(practiceEntity.getBio());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getMonday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getTuesday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getWednesday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getThursday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getFriday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getSaturday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getSunday());
        tradingHourDao.createOrUpdate(practiceEntity.getTradingDay().getPubicHoliday());
        tradingDayDao.createOrUpdate(practiceEntity.getTradingDay());
        practiceDao.createOrUpdate(practiceEntity);
    }

    @Override
    public void deletePractices(Long practiceId) {
        practiceDao.delete(practiceDao.read(practiceId));
    }

}