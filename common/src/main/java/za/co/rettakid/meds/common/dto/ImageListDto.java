package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "imagelistdto")
public class ImageListDto   {

    @XmlElement(name = "images",type = ImageDto.class)
    private List<ImageDto> images = new ArrayList<ImageDto>();

    public List<ImageDto> getImageList()   {
        return this.images;
    }

    public void addImageList(List<ImageDto> images)   {
        this.images.addAll(images);
    }
}