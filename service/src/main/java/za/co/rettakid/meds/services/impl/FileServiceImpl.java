package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import za.co.rettakid.meds.common.dto.FileDto;
import za.co.rettakid.meds.common.dto.FileListDto;
import za.co.rettakid.meds.persistence.dao.FileDao;
import za.co.rettakid.meds.persistence.entity.FileEntity;
import za.co.rettakid.meds.services.FileService;
import za.co.rettakid.meds.services.binding.BindFile;

@Service
@Transactional
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
    public FileDto postFiles(FileDto fileDto)  {
        FileEntity fileEntity = BindFile.bindFile(fileDto);
        fileDao.createOrUpdate(fileEntity);
        return BindFile.bindFile(fileEntity);
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