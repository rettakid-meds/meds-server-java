package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.PracticeDto;
import za.co.rettakid.meds.common.dto.PracticeListDto;

import java.io.IOException;

public interface PracticeService    {

    PracticeListDto getPractices();
    PracticeDto getPractices(Long practiceId);
    PracticeDto postPractices(PracticeDto practiceDto, byte[] imageFile) throws IOException;
    void putPractices(PracticeDto practiceDto, byte[] imageFile) throws IOException;
    void deletePractices(Long practiceId);

}