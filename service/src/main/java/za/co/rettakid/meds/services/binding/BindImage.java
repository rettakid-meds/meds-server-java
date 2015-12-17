package za.co.rettakid.meds.services.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.persistence.entity.*;

public class BindImage {

    public static ImageEntity bindImage(ImageDto imageDto) {
        ImageEntity imageEntity = null;
        if (imageDto != null)    {
            imageEntity = new ImageEntity();
            imageEntity.setImageId(imageDto.getImageId());
            imageEntity.setFile(BindFile.bindFile(imageDto.getFile()));
            imageEntity.setWidth(imageDto.getWidth());
            imageEntity.setHeight(imageDto.getHeight());
        }
        return imageEntity;
    }

    public static ImageEntity bindImage(ImageDto imageDto,ImageEntity imageEntity) {
        if (imageDto != null && imageEntity != null)    {
            if (imageEntity.getFile().getFileId() != null) {
                imageEntity.setFile(BindFile.bindFile(imageDto.getFile(), imageEntity.getFile()));
            } else  {
                imageEntity.setFile(BindFile.bindFile(imageDto.getFile(), new FileEntity()));
            }
            imageEntity.setWidth(imageDto.getWidth());
            imageEntity.setHeight(imageDto.getHeight());
        }
        return imageEntity;
    }

    public static List<ImageEntity> bindImageDtoList(List<ImageDto> imageDtos) {
    List<ImageEntity> imageEntities = new ArrayList<ImageEntity>();
        for (ImageDto imageDto : imageDtos) {
            imageEntities.add(bindImage(imageDto));
        }
        return imageEntities;
    }

    public static ImageDto bindImage(ImageEntity imageEntity) {
        ImageDto imageDto = null;
        if (imageEntity != null)    {
            imageDto = new ImageDto();
            imageDto.setImageId(imageEntity.getImageId());
            imageDto.setFile(BindFile.bindFile(imageEntity.getFile()));
            imageDto.setWidth(imageEntity.getWidth());
            imageDto.setHeight(imageEntity.getHeight());
        }
        return imageDto;
    }

    public static List<ImageDto> bindImageEntityList(List<ImageEntity> imageEntitys) {
        List<ImageDto> imageDtos = new ArrayList<ImageDto>();
        if (imageEntitys != null)   {
            for (ImageEntity imageEntity : imageEntitys) {
                imageDtos.add(bindImage(imageEntity));
            }
        }
        return imageDtos;
    }

}
