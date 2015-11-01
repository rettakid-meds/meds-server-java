package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindPractice {

    public static PracticeVo bindPractice(PracticeDto practiceDto) {
        PracticeVo practiceVo = null;
        if (practiceDto != null)    {
            practiceVo = new PracticeVo();
            practiceVo.setPracticeId(practiceDto.getPracticeId());
            practiceVo.setName(practiceDto.getName());
            practiceVo.setEmail(practiceDto.getEmail());
            practiceVo.setLongitude(practiceDto.getLongitude());
            practiceVo.setLatitude(practiceDto.getLatitude());
            practiceVo.setAddress(practiceDto.getAddress());
            practiceVo.setTradingDay(BindTradingDay.bindTradingDay(practiceDto.getTradingDay()));
            practiceVo.setPhone(practiceDto.getPhone());
            practiceVo.setFee(practiceDto.getFee());
            practiceVo.setImage(BindImage.bindImage(practiceDto.getImage()));
            practiceVo.setBio(BindDataContent.bindDataContent(practiceDto.getBio()));
        }
        return practiceVo;
    }

    public static List<PracticeVo> bindPracticeDtoList(List<PracticeDto> practiceDtos) {
    List<PracticeVo> practiceEntities = new ArrayList<PracticeVo>();
        for (PracticeDto practiceDto : practiceDtos) {
            practiceEntities.add(bindPractice(practiceDto));
        }
        return practiceEntities;
    }

    public static PracticeDto bindPractice(PracticeVo practiceVo) {
        PracticeDto practiceDto = null;
        if (practiceVo != null)    {
            practiceDto = new PracticeDto();
            practiceDto.setPracticeId(practiceVo.getPracticeId());
            practiceDto.setName(practiceVo.getName());
            practiceDto.setEmail(practiceVo.getEmail());
            practiceDto.setLongitude(practiceVo.getLongitude());
            practiceDto.setLatitude(practiceVo.getLatitude());
            practiceDto.setAddress(practiceVo.getAddress());
            practiceDto.setTradingDay(BindTradingDay.bindTradingDay(practiceVo.getTradingDay()));
            practiceDto.setPhone(practiceVo.getPhone());
            practiceDto.setFee(practiceVo.getFee());
            practiceDto.setImage(BindImage.bindImage(practiceVo.getImage()));
            practiceDto.setBio(BindDataContent.bindDataContent(practiceVo.getBio()));
        }
        return practiceDto;
    }

    public static List<PracticeDto> bindPracticeVoList(List<PracticeVo> practiceVos) {
        List<PracticeDto> practiceDtos = new ArrayList<PracticeDto>();
        for (PracticeVo practiceVo : practiceVos) {
            practiceDtos.add(bindPractice(practiceVo));
        }
        return practiceDtos;
    }

}
