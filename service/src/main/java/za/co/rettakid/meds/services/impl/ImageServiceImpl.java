package za.co.rettakid.meds.services.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.services.binding.*;
import za.co.rettakid.meds.services.*;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.dao.*;

@Service
public class ImageServiceImpl implements ImageService   {

    @Autowired
    private ImageDao imageDao;

    @Override
    public ImageListDto getImages()  {
        ImageListDto imageListDto = new ImageListDto();
        imageListDto.addImageList(BindImage.bindImageEntityList(imageDao.read()));
        return imageListDto;
    }
    
    @Override
    public ImageDto getImages(Long imageId)  {
        return BindImage.bindImage(imageDao.read(imageId));
    }
    
    @Override
        public void postImages(ImageDto imageDto)  {
        imageDao.createOrUpdate(BindImage.bindImage(imageDto));
    }

    @Override
    public void postImages(ImageListDto imageListDto)  {
        for (ImageDto imageDto : imageListDto.getImageList()) {
            imageDao.createOrUpdate(BindImage.bindImage(imageDto));
        }
    }

    @Override
    public void putImages(ImageDto imageDto)  {
        imageDao.createOrUpdate(BindImage.bindImage(imageDto));
    }

    @Override
    public void deleteImages(Long imageId)  {
        imageDao.delete(imageDao.read(imageId));
}

}