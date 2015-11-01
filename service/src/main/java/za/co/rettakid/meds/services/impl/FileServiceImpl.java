package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.Date;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class FileServiceImpl implements FileService   {

    @Autowired
    private FileDao fileDao;

    @Override
    public FileListDto getFiles()  {
        FileListDto fileListDto = new FileListDto();
        fileListDto.addFileList(BindFile.bindFileEntityList(fileDao.read()));
        return fileListDto;
    }

    @Override
    public FileDto getFiles(Long fileId)  {
        return BindFile.bindFile(fileDao.read(fileId));
    }
    
    @Override
    public void postFiles(FileDto fileDto)  {
        fileDao.createOrUpdate(BindFile.bindFile(fileDto));
    }

    @Override
    public void putFiles(FileDto fileDto)  {
        fileDao.createOrUpdate(BindFile.bindFile(fileDto));
    }

    @Override
    public void deleteFiles(Long fileId)  {
        fileDao.delete(fileDao.read(fileId));
}

}