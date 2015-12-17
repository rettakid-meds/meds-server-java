package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindDataContent {

    public static DataContentEntity bindDataContent(DataContentDto dataContentDto) {
        DataContentEntity dataContentEntity = null;
        if (dataContentDto != null)    {
            dataContentEntity = new DataContentEntity();
            dataContentEntity.setDataContentId(dataContentDto.getDataContentId());
            dataContentEntity.setData(dataContentDto.getData());
        }
        return dataContentEntity;
    }

    public static DataContentEntity bindDataContent(DataContentDto dataContentDto,DataContentEntity dataContentEntity) {
        if (dataContentDto != null && dataContentEntity != null)    {
            dataContentEntity.setData(dataContentDto.getData());
        }
        return dataContentEntity;
    }

    public static List<DataContentEntity> bindDataContentDtoList(List<DataContentDto> dataContentDtos) {
    List<DataContentEntity> dataContentEntities = new ArrayList<DataContentEntity>();
        for (DataContentDto dataContentDto : dataContentDtos) {
            dataContentEntities.add(bindDataContent(dataContentDto));
        }
        return dataContentEntities;
    }

    public static DataContentDto bindDataContent(DataContentEntity dataContentEntity) {
        DataContentDto dataContentDto = null;
        if (dataContentEntity != null)    {
            dataContentDto = new DataContentDto();
            dataContentDto.setDataContentId(dataContentEntity.getDataContentId());
            dataContentDto.setData(dataContentEntity.getData());
        }
        return dataContentDto;
    }

    public static List<DataContentDto> bindDataContentEntityList(List<DataContentEntity> dataContentEntitys) {
        List<DataContentDto> dataContentDtos = new ArrayList<DataContentDto>();
        if (dataContentEntitys != null)   {
            for (DataContentEntity dataContentEntity : dataContentEntitys) {
                dataContentDtos.add(bindDataContent(dataContentEntity));
            }
        }
        return dataContentDtos;
    }

}
