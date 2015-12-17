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
            prescriptionEntity.setAppointment(BindAppointment.bindAppointment(prescriptionDto.getAppointment()));
            prescriptionEntity.setDoctor(BindDoctor.bindDoctor(prescriptionDto.getDoctor()));
            prescriptionEntity.setUser(BindUser.bindUser(prescriptionDto.getUser()));
            prescriptionEntity.setFile(BindFile.bindFile(prescriptionDto.getFile()));
            prescriptionEntity.setEffFrm(prescriptionDto.getEffFrm());
            prescriptionEntity.setEffTo(prescriptionDto.getEffTo());
        }
        return prescriptionEntity;
    }

    public static PrescriptionEntity bindPrescription(PrescriptionDto prescriptionDto,PrescriptionEntity prescriptionEntity) {
        if (prescriptionDto != null && prescriptionEntity != null)    {
            if (prescriptionEntity.getAppointment().getAppointmentId() != null) {
                prescriptionEntity.setAppointment(BindAppointment.bindAppointment(prescriptionDto.getAppointment(), prescriptionEntity.getAppointment()));
            } else  {
                prescriptionEntity.setAppointment(BindAppointment.bindAppointment(prescriptionDto.getAppointment(), new AppointmentEntity()));
            }
            if (prescriptionEntity.getDoctor().getDoctorId() != null) {
                prescriptionEntity.setDoctor(BindDoctor.bindDoctor(prescriptionDto.getDoctor(), prescriptionEntity.getDoctor()));
            } else  {
                prescriptionEntity.setDoctor(BindDoctor.bindDoctor(prescriptionDto.getDoctor(), new DoctorEntity()));
            }
            if (prescriptionEntity.getUser().getUserId() != null) {
                prescriptionEntity.setUser(BindUser.bindUser(prescriptionDto.getUser(), prescriptionEntity.getUser()));
            } else  {
                prescriptionEntity.setUser(BindUser.bindUser(prescriptionDto.getUser(), new UserEntity()));
            }
            if (prescriptionEntity.getFile().getFileId() != null) {
                prescriptionEntity.setFile(BindFile.bindFile(prescriptionDto.getFile(), prescriptionEntity.getFile()));
            } else  {
                prescriptionEntity.setFile(BindFile.bindFile(prescriptionDto.getFile(), new FileEntity()));
            }
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
            prescriptionDto.setAppointment(BindAppointment.bindAppointment(prescriptionEntity.getAppointment()));
            prescriptionDto.setDoctor(BindDoctor.bindDoctor(prescriptionEntity.getDoctor()));
            prescriptionDto.setUser(BindUser.bindUser(prescriptionEntity.getUser()));
            prescriptionDto.setFile(BindFile.bindFile(prescriptionEntity.getFile()));
            prescriptionDto.setEffFrm(prescriptionEntity.getEffFrm());
            prescriptionDto.setEffTo(prescriptionEntity.getEffTo());
        }
        return prescriptionDto;
    }

    public static List<PrescriptionDto> bindPrescriptionEntityList(List<PrescriptionEntity> prescriptionEntitys) {
        List<PrescriptionDto> prescriptionDtos = new ArrayList<PrescriptionDto>();
        if (prescriptionEntitys != null)   {
            for (PrescriptionEntity prescriptionEntity : prescriptionEntitys) {
                prescriptionDtos.add(bindPrescription(prescriptionEntity));
            }
        }
        return prescriptionDtos;
    }

}
