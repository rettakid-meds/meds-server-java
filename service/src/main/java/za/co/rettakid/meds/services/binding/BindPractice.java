package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindPractice {

    public static PracticeEntity bindPractice(PracticeDto practiceDto) {
        PracticeEntity practiceEntity = null;
        if (practiceDto != null)    {
            practiceEntity = new PracticeEntity();
            practiceEntity.setPracticeId(practiceDto.getPracticeId());
            practiceEntity.setName(practiceDto.getName());
            practiceEntity.setEmail(practiceDto.getEmail());
            practiceEntity.setLongitude(practiceDto.getLongitude());
            practiceEntity.setLatitude(practiceDto.getLatitude());
            practiceEntity.setAddress(practiceDto.getAddress());
            practiceEntity.setTradingDay(BindTradingDay.bindTradingDay(practiceDto.getTradingDay()));
            practiceEntity.setPhone(practiceDto.getPhone());
            practiceEntity.setFee(practiceDto.getFee());
            practiceEntity.setImage(BindImage.bindImage(practiceDto.getImage()));
            practiceEntity.setBio(BindDataContent.bindDataContent(practiceDto.getBio()));
            practiceEntity.setEffFrm(practiceDto.getEffFrm());
            practiceEntity.setEffTo(practiceDto.getEffTo());
        }
        return practiceEntity;
    }

    public static PracticeEntity bindPractice(PracticeDto practiceDto,PracticeEntity practiceEntity) {
        if (practiceDto != null && practiceEntity != null)    {
            practiceEntity.setName(practiceDto.getName());
            practiceEntity.setEmail(practiceDto.getEmail());
            practiceEntity.setLongitude(practiceDto.getLongitude());
            practiceEntity.setLatitude(practiceDto.getLatitude());
            practiceEntity.setAddress(practiceDto.getAddress());
            if (practiceEntity.getTradingDay().getTradingDayId() != null) {
                practiceEntity.setTradingDay(BindTradingDay.bindTradingDay(practiceDto.getTradingDay(), practiceEntity.getTradingDay()));
            } else  {
                practiceEntity.setTradingDay(BindTradingDay.bindTradingDay(practiceDto.getTradingDay(), new TradingDayEntity()));
            }
            practiceEntity.setPhone(practiceDto.getPhone());
            practiceEntity.setFee(practiceDto.getFee());
            if (practiceEntity.getImage().getImageId() != null) {
                practiceEntity.setImage(BindImage.bindImage(practiceDto.getImage(), practiceEntity.getImage()));
            } else  {
                practiceEntity.setImage(BindImage.bindImage(practiceDto.getImage(), new ImageEntity()));
            }
            if (practiceEntity.getBio().getDataContentId() != null) {
                practiceEntity.setBio(BindDataContent.bindDataContent(practiceDto.getBio(), practiceEntity.getBio()));
            } else  {
                practiceEntity.setBio(BindDataContent.bindDataContent(practiceDto.getBio(), new DataContentEntity()));
            }
        }
        return practiceEntity;
    }

    public static List<PracticeEntity> bindPracticeDtoList(List<PracticeDto> practiceDtos) {
    List<PracticeEntity> practiceEntities = new ArrayList<PracticeEntity>();
        for (PracticeDto practiceDto : practiceDtos) {
            practiceEntities.add(bindPractice(practiceDto));
        }
        return practiceEntities;
    }

    public static PracticeDto bindPractice(PracticeEntity practiceEntity) {
        PracticeDto practiceDto = null;
        if (practiceEntity != null)    {
            practiceDto = new PracticeDto();
            practiceDto.setPracticeId(practiceEntity.getPracticeId());
            practiceDto.setName(practiceEntity.getName());
            practiceDto.setEmail(practiceEntity.getEmail());
            practiceDto.setLongitude(practiceEntity.getLongitude());
            practiceDto.setLatitude(practiceEntity.getLatitude());
            practiceDto.setAddress(practiceEntity.getAddress());
            practiceDto.setTradingDay(BindTradingDay.bindTradingDay(practiceEntity.getTradingDay()));
            practiceDto.setPhone(practiceEntity.getPhone());
            practiceDto.setFee(practiceEntity.getFee());
            practiceDto.setImage(BindImage.bindImage(practiceEntity.getImage()));
            practiceDto.setBio(BindDataContent.bindDataContent(practiceEntity.getBio()));
            practiceDto.setEffFrm(practiceEntity.getEffFrm());
            practiceDto.setEffTo(practiceEntity.getEffTo());
        }
        return practiceDto;
    }

    public static List<PracticeDto> bindPracticeEntityList(List<PracticeEntity> practiceEntitys) {
        List<PracticeDto> practiceDtos = new ArrayList<PracticeDto>();
        if (practiceEntitys != null)   {
            for (PracticeEntity practiceEntity : practiceEntitys) {
                practiceDtos.add(bindPractice(practiceEntity));
            }
        }
        return practiceDtos;
    }

}
