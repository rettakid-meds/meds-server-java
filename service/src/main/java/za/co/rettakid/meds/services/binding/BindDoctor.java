package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindDoctor {

    public static DoctorEntity bindDoctor(DoctorDto doctorDto) {
        DoctorEntity doctorEntity = null;
        if (doctorDto != null)    {
            doctorEntity = new DoctorEntity();
            doctorEntity.setDoctorId(doctorDto.getDoctorId());
            doctorEntity.setUser(BindUser.bindUser(doctorDto.getUser()));
            doctorEntity.setIcon(BindImage.bindImage(doctorDto.getIcon()));
            doctorEntity.setImage(BindImage.bindImage(doctorDto.getImage()));
            doctorEntity.setTradingDay(BindTradingDay.bindTradingDay(doctorDto.getTradingDay()));
            doctorEntity.setBio(BindDataContent.bindDataContent(doctorDto.getBio()));
            doctorEntity.setEffFrm(doctorDto.getEffFrm());
            doctorEntity.setEffTo(doctorDto.getEffTo());
        }
        return doctorEntity;
    }

    public static DoctorEntity bindDoctor(DoctorDto doctorDto,DoctorEntity doctorEntity) {
        if (doctorDto != null && doctorEntity != null)    {
            if (doctorEntity.getUser().getUserId() != null) {
                doctorEntity.setUser(BindUser.bindUser(doctorDto.getUser(), doctorEntity.getUser()));
            } else  {
                doctorEntity.setUser(BindUser.bindUser(doctorDto.getUser(), new UserEntity()));
            }
            if (doctorEntity.getIcon().getImageId() != null) {
                doctorEntity.setIcon(BindImage.bindImage(doctorDto.getIcon(), doctorEntity.getIcon()));
            } else  {
                doctorEntity.setIcon(BindImage.bindImage(doctorDto.getIcon(), new ImageEntity()));
            }
            if (doctorEntity.getImage().getImageId() != null) {
                doctorEntity.setImage(BindImage.bindImage(doctorDto.getImage(), doctorEntity.getImage()));
            } else  {
                doctorEntity.setImage(BindImage.bindImage(doctorDto.getImage(), new ImageEntity()));
            }
            if (doctorEntity.getTradingDay().getTradingDayId() != null) {
                doctorEntity.setTradingDay(BindTradingDay.bindTradingDay(doctorDto.getTradingDay(), doctorEntity.getTradingDay()));
            } else  {
                doctorEntity.setTradingDay(BindTradingDay.bindTradingDay(doctorDto.getTradingDay(), new TradingDayEntity()));
            }
            if (doctorEntity.getBio().getDataContentId() != null) {
                doctorEntity.setBio(BindDataContent.bindDataContent(doctorDto.getBio(), doctorEntity.getBio()));
            } else  {
                doctorEntity.setBio(BindDataContent.bindDataContent(doctorDto.getBio(), new DataContentEntity()));
            }
            doctorEntity.setEffFrm(doctorDto.getEffFrm());
            doctorEntity.setEffTo(doctorDto.getEffTo());
        }
        return doctorEntity;
    }

    public static List<DoctorEntity> bindDoctorDtoList(List<DoctorDto> doctorDtos) {
    List<DoctorEntity> doctorEntities = new ArrayList<DoctorEntity>();
        for (DoctorDto doctorDto : doctorDtos) {
            doctorEntities.add(bindDoctor(doctorDto));
        }
        return doctorEntities;
    }

    public static DoctorDto bindDoctor(DoctorEntity doctorEntity) {
        DoctorDto doctorDto = null;
        if (doctorEntity != null)    {
            doctorDto = new DoctorDto();
            doctorDto.setDoctorId(doctorEntity.getDoctorId());
            doctorDto.setUser(BindUser.bindUser(doctorEntity.getUser()));
            doctorDto.setIcon(BindImage.bindImage(doctorEntity.getIcon()));
            doctorDto.setImage(BindImage.bindImage(doctorEntity.getImage()));
            doctorDto.setTradingDay(BindTradingDay.bindTradingDay(doctorEntity.getTradingDay()));
            doctorDto.setBio(BindDataContent.bindDataContent(doctorEntity.getBio()));
            doctorDto.setEffFrm(doctorEntity.getEffFrm());
            doctorDto.setEffTo(doctorEntity.getEffTo());
        }
        return doctorDto;
    }

    public static List<DoctorDto> bindDoctorEntityList(List<DoctorEntity> doctorEntitys) {
        List<DoctorDto> doctorDtos = new ArrayList<DoctorDto>();
        if (doctorEntitys != null)   {
            for (DoctorEntity doctorEntity : doctorEntitys) {
                doctorDtos.add(bindDoctor(doctorEntity));
            }
        }
        return doctorDtos;
    }

}
