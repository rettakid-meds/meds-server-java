package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface PracticeService    {

    PracticeListDto getPractices();
    PracticeDto getPractices(Long practiceId);
    void postPractices(PracticeDto practiceDto);
    void postPractices(PracticeListDto practiceListDto);
    void putPractices(PracticeDto practiceDto);
    void deletePractices(Long practiceId);

}