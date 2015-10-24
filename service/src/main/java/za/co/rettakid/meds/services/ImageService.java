package za.co.rettakid.meds.services;

import za.co.rettakid.meds.common.dto.*;

public interface ImageService    {

    ImageListDto getImages();
    ImageDto getImages(Long imageId);
    void postImages(ImageDto imageDto);
    void postImages(ImageListDto imageListDto);
    void putImages(ImageDto imageDto);
    void deleteImages(Long imageId);

}