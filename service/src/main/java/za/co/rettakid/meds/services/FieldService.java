package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface FieldService    {

    FieldListDto getFields();
    FieldDto getFields(Long fieldId);
    void postFields(FieldDto fieldDto);
    void putFields(FieldDto fieldDto);
    void deleteFields(Long fieldId);

}