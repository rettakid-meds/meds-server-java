package za.co.rettakid.meds.services.binding;

import za.co.rettakid.meds.common.dto.FileDto;
import za.co.rettakid.meds.persistence.entity.FileEntity;

import java.util.ArrayList;
import java.util.List;

public class BindFile {

    public static FileEntity bindFile(FileDto fileDto) {
        FileEntity fileEntity = null;
        if (fileDto != null)    {
            fileEntity = new FileEntity();
            fileEntity.setFileId(fileDto.getFileId());
            fileEntity.setGuid(fileDto.getGuid());
            fileEntity.setName(fileDto.getName());
            fileEntity.setEffFrm(fileDto.getEffFrm());
        }
        return fileEntity;
    }

    public static FileEntity bindFile(FileDto fileDto,FileEntity fileEntity) {
        if (fileDto != null && fileEntity != null)    {
            fileEntity.setGuid(fileDto.getGuid());
            fileEntity.setName(fileDto.getName());
            fileEntity.setEffFrm(fileDto.getEffFrm());
        }
        return fileEntity;
    }

    public static List<FileEntity> bindFileDtoList(List<FileDto> fileDtos) {
    List<FileEntity> fileEntities = new ArrayList<FileEntity>();
        for (FileDto fileDto : fileDtos) {
            fileEntities.add(bindFile(fileDto));
        }
        return fileEntities;
    }

    public static FileDto bindFile(FileEntity fileEntity) {
        FileDto fileDto = null;
        if (fileEntity != null)    {
            fileDto = new FileDto();
            fileDto.setFileId(fileEntity.getFileId());
            fileDto.setGuid(fileEntity.getGuid());
            fileDto.setName(fileEntity.getName());
            fileDto.setEffFrm(fileEntity.getEffFrm());
        }
        return fileDto;
    }

    public static List<FileDto> bindFileEntityList(List<FileEntity> fileEntitys) {
        List<FileDto> fileDtos = new ArrayList<FileDto>();
        if (fileEntitys != null)   {
            for (FileEntity fileEntity : fileEntitys) {
                fileDtos.add(bindFile(fileEntity));
            }
        }
        return fileDtos;
    }

}
