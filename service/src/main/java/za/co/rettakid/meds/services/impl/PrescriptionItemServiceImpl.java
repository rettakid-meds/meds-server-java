package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;
import za.co.rettakid.meds.persistence.entity.*;

@Service
@Transactional
public class PrescriptionItemServiceImpl implements PrescriptionItemService   {

    @Autowired
    private PrescriptionItemDao prescriptionItemDao;

    @Override
    public PrescriptionItemListDto getPrescriptionItems()  {
        PrescriptionItemListDto prescriptionItemListDto = new PrescriptionItemListDto();
        prescriptionItemListDto.addPrescriptionItemList(BindPrescriptionItem.bindPrescriptionItemEntityList(prescriptionItemDao.read()));
        return prescriptionItemListDto;
    }

    @Override
    public PrescriptionItemDto getPrescriptionItems(Long prescriptionItemId)  {
        return BindPrescriptionItem.bindPrescriptionItem(prescriptionItemDao.read(prescriptionItemId));
    }
    
    @Override
    public PrescriptionItemDto postPrescriptionItems(PrescriptionItemDto prescriptionItemDto)  {
        PrescriptionItemEntity prescriptionItemEntity = BindPrescriptionItem.bindPrescriptionItem(prescriptionItemDto);
        prescriptionItemDao.createOrUpdate(prescriptionItemEntity);
        return BindPrescriptionItem.bindPrescriptionItem(prescriptionItemEntity);
}

    @Override
    public void putPrescriptionItems(PrescriptionItemDto prescriptionItemDto)  {
        prescriptionItemDao.createOrUpdate(BindPrescriptionItem.bindPrescriptionItem(prescriptionItemDto));
    }

    @Override
    public void deletePrescriptionItems(Long prescriptionItemId)  {
        prescriptionItemDao.delete(prescriptionItemDao.read(prescriptionItemId));
    }

}