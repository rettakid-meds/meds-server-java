package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.persistence.entity.FileEntity;
import za.co.rettakid.meds.persistence.entity.ImageEntity;
import za.co.rettakid.meds.persistence.entity.PracticeEntity;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

import javax.imageio.ImageIO;
import java.awt.image.BufferedImage;
import java.io.*;
import java.util.Date;

@Service
public class PracticeServiceImpl implements PracticeService   {

    @Autowired
    private PracticeDao practiceDao;
    @Autowired
    private FileDao fileDao;
    @Autowired
    private ImageDao imageDao;

    @Override
    public PracticeListDto getPractices()  {
        PracticeListDto practiceListDto = new PracticeListDto();
        practiceListDto.addPracticeList(BindPractice.bindPracticeEntityList(practiceDao.read()));
        return practiceListDto;
    }

    @Override
    public PracticeDto getPractices(Long practiceId)  {
        return BindPractice.bindPractice(practiceDao.read(practiceId));
    }
    
    @Override
    public void postPractices(PracticeDto practiceDto)  {
        practiceDao.createOrUpdate(BindPractice.bindPractice(practiceDto));
    }

    @Transactional
    @Override
    public void putPractices(PracticeDto practiceDto, byte[] imageFile) throws IOException {
        PracticeEntity practiceEntity = practiceDao.read(practiceDto.getPracticeId());
        practiceEntity.setName(practiceDto.getName());
        practiceEntity.setPhone(practiceDto.getPhone());
        practiceEntity.setAddress(practiceDto.getAddress());
        practiceEntity.setEmail(practiceDto.getEmail());
        practiceEntity.setFee(practiceDto.getFee());
        if (imageFile != null)  {
            FileEntity fileEntity = new FileEntity();
            fileEntity.setName("practice" + practiceDto.getPracticeId() + ".png");
            fileEntity.setGuid(java.util.UUID.randomUUID().toString());
            fileEntity.setEffFrm(new Date());
            fileDao.createOrUpdate(fileEntity);
            ImageEntity imageEntity = new ImageEntity();
            imageEntity.setFile(fileEntity);
            imageEntity.setHeight(200);
            imageEntity.setWidth(200);
            imageDao.createOrUpdate(imageEntity);
            practiceEntity.setImage(imageEntity);
            /*OutputStream out = new BufferedOutputStream(new FileOutputStream("C:\\images\\" + fileEntity.getGuid()));
            out.write(imageFile);
            out.close();*/
            InputStream in = new ByteArrayInputStream(imageFile);
            BufferedImage bufferedImage = ImageIO.read(in);
            ImageIO.write(bufferedImage, "png", new File("C:\\images\\" + fileEntity.getGuid()));
        }
        //practiceEntity.setBio();
        //practiceEntity.setLatitude();
        //practiceEntity.setLongitude();
        //practiceEntity.setTradingDay();
        practiceDao.createOrUpdate(practiceEntity);
    }

    @Override
    public void deletePractices(Long practiceId)  {
        practiceDao.delete(practiceDao.read(practiceId));
}

}