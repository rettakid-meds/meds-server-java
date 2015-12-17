package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface PracticeFieldService    {

    PracticeFieldListDto getPracticeFields();
    PracticeFieldDto getPracticeFields(Long practiceFieldId);
    PracticeFieldDto postPracticeFields(PracticeFieldDto practiceFieldDto);
    void putPracticeFields(PracticeFieldDto practiceFieldDto);
    void deletePracticeFields(Long practiceFieldId);

}