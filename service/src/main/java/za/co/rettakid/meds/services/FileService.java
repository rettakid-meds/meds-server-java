package za.co.rettakid.meds.services;

import java.util.Date;
import za.co.rettakid.meds.common.dto.*;

public interface FileService    {

    FileListDto getFiles();
    FileDto getFiles(Long fileId);
    void postFiles(FileDto fileDto);
    void putFiles(FileDto fileDto);
    void deleteFiles(Long fileId);

}