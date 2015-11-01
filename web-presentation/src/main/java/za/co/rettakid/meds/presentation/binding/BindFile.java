package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindFile {

    public static FileVo bindFile(FileDto fileDto) {
        FileVo fileVo = null;
        if (fileDto != null)    {
            fileVo = new FileVo();
            fileVo.setFileId(fileDto.getFileId());
            fileVo.setGuid(fileDto.getGuid());
            fileVo.setName(fileDto.getName());
            fileVo.setEffFrm(fileDto.getEffFrm());
        }
        return fileVo;
    }

    public static List<FileVo> bindFileDtoList(List<FileDto> fileDtos) {
    List<FileVo> fileEntities = new ArrayList<FileVo>();
        for (FileDto fileDto : fileDtos) {
            fileEntities.add(bindFile(fileDto));
        }
        return fileEntities;
    }

    public static FileDto bindFile(FileVo fileVo) {
        FileDto fileDto = null;
        if (fileVo != null)    {
            fileDto = new FileDto();
            fileDto.setFileId(fileVo.getFileId());
            fileDto.setGuid(fileVo.getGuid());
            fileDto.setName(fileVo.getName());
            fileDto.setEffFrm(fileVo.getEffFrm());
        }
        return fileDto;
    }

    public static List<FileDto> bindFileVoList(List<FileVo> fileVos) {
        List<FileDto> fileDtos = new ArrayList<FileDto>();
        for (FileVo fileVo : fileVos) {
            fileDtos.add(bindFile(fileVo));
        }
        return fileDtos;
    }

}
