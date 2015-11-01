package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "datacontentlistdto")
public class DataContentListDto   {

    @XmlElementWrapper(name = "datacontents")
    @XmlElement(name = "datacontentdto",type = DataContentDto.class)
    private List<DataContentDto> dataContents = new ArrayList<DataContentDto>();

    public List<DataContentDto> getDataContentList()   {
        return this.dataContents;
    }

    public void addDataContentList(List<DataContentDto> dataContents)   {
        this.dataContents.addAll(dataContents);
    }
}