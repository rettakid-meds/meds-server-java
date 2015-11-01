package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindDataContent {

    public static DataContentVo bindDataContent(DataContentDto dataContentDto) {
        DataContentVo dataContentVo = null;
        if (dataContentDto != null)    {
            dataContentVo = new DataContentVo();
            dataContentVo.setDataContentId(dataContentDto.getDataContentId());
            dataContentVo.setData(dataContentDto.getData());
        }
        return dataContentVo;
    }

    public static List<DataContentVo> bindDataContentDtoList(List<DataContentDto> dataContentDtos) {
    List<DataContentVo> dataContentEntities = new ArrayList<DataContentVo>();
        for (DataContentDto dataContentDto : dataContentDtos) {
            dataContentEntities.add(bindDataContent(dataContentDto));
        }
        return dataContentEntities;
    }

    public static DataContentDto bindDataContent(DataContentVo dataContentVo) {
        DataContentDto dataContentDto = null;
        if (dataContentVo != null)    {
            dataContentDto = new DataContentDto();
            dataContentDto.setDataContentId(dataContentVo.getDataContentId());
            dataContentDto.setData(dataContentVo.getData());
        }
        return dataContentDto;
    }

    public static List<DataContentDto> bindDataContentVoList(List<DataContentVo> dataContentVos) {
        List<DataContentDto> dataContentDtos = new ArrayList<DataContentDto>();
        for (DataContentVo dataContentVo : dataContentVos) {
            dataContentDtos.add(bindDataContent(dataContentVo));
        }
        return dataContentDtos;
    }

}
