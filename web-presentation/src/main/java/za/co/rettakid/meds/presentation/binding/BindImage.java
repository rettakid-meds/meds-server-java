package za.co.rettakid.meds.presentation.binding;

import java.util.ArrayList;
import java.util.List;
import za.co.rettakid.meds.common.dto.*;
import za.co.rettakid.meds.presentation.vo.*;

public class BindImage {

    public static ImageVo bindImage(ImageDto imageDto) {
        ImageVo imageVo = null;
        if (imageDto != null)    {
            imageVo = new ImageVo();
            imageVo.setImageId(imageDto.getImageId());
            imageVo.setFile(BindFile.bindFile(imageDto.getFile()));
            imageVo.setWidth(imageDto.getWidth());
            imageVo.setHeight(imageDto.getHeight());
        }
        return imageVo;
    }

    public static List<ImageVo> bindImageDtoList(List<ImageDto> imageDtos) {
    List<ImageVo> imageEntities = new ArrayList<ImageVo>();
        for (ImageDto imageDto : imageDtos) {
            imageEntities.add(bindImage(imageDto));
        }
        return imageEntities;
    }

    public static ImageDto bindImage(ImageVo imageVo) {
        ImageDto imageDto = null;
        if (imageVo != null)    {
            imageDto = new ImageDto();
            imageDto.setImageId(imageVo.getImageId());
            imageDto.setFile(BindFile.bindFile(imageVo.getFile()));
            imageDto.setWidth(imageVo.getWidth());
            imageDto.setHeight(imageVo.getHeight());
        }
        return imageDto;
    }

    public static List<ImageDto> bindImageVoList(List<ImageVo> imageVos) {
        List<ImageDto> imageDtos = new ArrayList<ImageDto>();
        for (ImageVo imageVo : imageVos) {
            imageDtos.add(bindImage(imageVo));
        }
        return imageDtos;
    }

}
