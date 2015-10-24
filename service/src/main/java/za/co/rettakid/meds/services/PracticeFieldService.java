package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface PracticeFieldService    {

    PracticeFieldListDto getPracticeFields();
    PracticeFieldDto getPracticeFields(Long practiceFieldId);
    void postPracticeFields(PracticeFieldDto practiceFieldDto);
    void postPracticeFields(PracticeFieldListDto practiceFieldListDto);
    void putPracticeFields(PracticeFieldDto practiceFieldDto);
    void deletePracticeFields(Long practiceFieldId);

}