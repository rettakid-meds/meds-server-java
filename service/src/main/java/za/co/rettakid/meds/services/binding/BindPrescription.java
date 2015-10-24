package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindPrescription {

    public static PrescriptionEntity bindPrescription(PrescriptionDto prescriptionDto) {
        PrescriptionEntity prescriptionEntity = null;
        if (prescriptionDto != null)    {
            prescriptionEntity = new PrescriptionEntity();
            prescriptionEntity.setPrescriptionId(prescriptionDto.getPrescriptionId());
            prescriptionEntity.setAppointmentEntity(BindAppointment.bindAppointment(prescriptionDto.getAppointment()));
            prescriptionEntity.setDoctorEntity(BindDoctor.bindDoctor(prescriptionDto.getDoctor()));
            prescriptionEntity.setUserEntity(BindUser.bindUser(prescriptionDto.getUser()));
            prescriptionEntity.setFileEntity(BindFile.bindFile(prescriptionDto.getFile()));
            prescriptionEntity.setEffFrm(prescriptionDto.getEffFrm());
            prescriptionEntity.setEffTo(prescriptionDto.getEffTo());
        }
        return prescriptionEntity;
    }

    public static List<PrescriptionEntity> bindPrescriptionDtoList(List<PrescriptionDto> prescriptionDtos) {
    List<PrescriptionEntity> prescriptionEntities = new ArrayList<PrescriptionEntity>();
        for (PrescriptionDto prescriptionDto : prescriptionDtos) {
            prescriptionEntities.add(bindPrescription(prescriptionDto));
        }
        return prescriptionEntities;
    }

    public static PrescriptionDto bindPrescription(PrescriptionEntity prescriptionEntity) {
        PrescriptionDto prescriptionDto = null;
        if (prescriptionEntity != null)    {
            prescriptionDto = new PrescriptionDto();
            prescriptionDto.setPrescriptionId(prescriptionEntity.getPrescriptionId());
            prescriptionDto.setAppointment(BindAppointment.bindAppointment(prescriptionEntity.getAppointmentEntity()));
            prescriptionDto.setDoctor(BindDoctor.bindDoctor(prescriptionEntity.getDoctorEntity()));
            prescriptionDto.setUser(BindUser.bindUser(prescriptionEntity.getUserEntity()));
            prescriptionDto.setFile(BindFile.bindFile(prescriptionEntity.getFileEntity()));
            prescriptionDto.setEffFrm(prescriptionEntity.getEffFrm());
            prescriptionDto.setEffTo(prescriptionEntity.getEffTo());
        }
        return prescriptionDto;
    }

    public static List<PrescriptionDto> bindPrescriptionEntityList(List<PrescriptionEntity> prescriptionEntitys) {
        List<PrescriptionDto> prescriptionDtos = new ArrayList<PrescriptionDto>();
        for (PrescriptionEntity prescriptionEntity : prescriptionEntitys) {
            prescriptionDtos.add(bindPrescription(prescriptionEntity));
        }
        return prescriptionDtos;
    }

}
