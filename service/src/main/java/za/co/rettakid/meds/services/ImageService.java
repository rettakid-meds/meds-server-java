package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface ImageService    {

    ImageListDto getImages();
    ImageDto getImages(Long imageId);
    ImageDto postImages(ImageDto imageDto);
    void putImages(ImageDto imageDto);
    void deleteImages(Long imageId);

}