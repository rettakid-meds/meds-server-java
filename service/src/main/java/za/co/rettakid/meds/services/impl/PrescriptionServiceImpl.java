package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import java.util.Date;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
@Transactional
public class PrescriptionServiceImpl implements PrescriptionService   {

    @Autowired
    private PrescriptionDao prescriptionDao;

    @Override
    public PrescriptionListDto getPrescriptions()  {
        PrescriptionListDto prescriptionListDto = new PrescriptionListDto();
        prescriptionListDto.addPrescriptionList(BindPrescription.bindPrescriptionEntityList(prescriptionDao.read()));
        return prescriptionListDto;
    }

    @Override
    public PrescriptionDto getPrescriptions(Long prescriptionId)  {
        return BindPrescription.bindPrescription(prescriptionDao.read(prescriptionId));
    }
    
    @Override
    public PrescriptionDto postPrescriptions(PrescriptionDto prescriptionDto)  {
        PrescriptionEntity prescriptionEntity = BindPrescription.bindPrescription(prescriptionDto);
        prescriptionDao.createOrUpdate(prescriptionEntity);
        return BindPrescription.bindPrescription(prescriptionEntity);
}

    @Override
    public void putPrescriptions(PrescriptionDto prescriptionDto)  {
        prescriptionDao.createOrUpdate(BindPrescription.bindPrescription(prescriptionDto));
    }

    @Override
    public void deletePrescriptions(Long prescriptionId)  {
        prescriptionDao.delete(prescriptionDao.read(prescriptionId));
    }

}