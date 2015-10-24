package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface DataContentService    {

    DataContentListDto getDataContents();
    DataContentDto getDataContents(Long dataContentId);
    void postDataContents(DataContentDto dataContentDto);
    void postDataContents(DataContentListDto dataContentListDto);
    void putDataContents(DataContentDto dataContentDto);
    void deleteDataContents(Long dataContentId);

}