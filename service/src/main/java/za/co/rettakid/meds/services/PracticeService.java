package za.co.rettakid.meds.services;

import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.common.dto.*;

import java.io.IOException;

public interface PracticeService    {

    PracticeListDto getPractices();
    PracticeDto getPractices(Long practiceId);
    void postPractices(PracticeDto practiceDto);
    @Transactional
    void putPractices(PracticeDto practiceDto, byte[] imageFile) throws IOException;
    void deletePractices(Long practiceId);

}