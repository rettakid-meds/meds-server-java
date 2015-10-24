package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "devicestypelistdto")
public class DevicesTypeListDto   {

    @XmlElement(name = "devicestypes",type = DevicesTypeDto.class)
    private List<DevicesTypeDto> devicesTypes = new ArrayList<DevicesTypeDto>();

    public List<DevicesTypeDto> getDevicesTypeList()   {
        return this.devicesTypes;
    }

    public void addDevicesTypeList(List<DevicesTypeDto> devicesTypes)   {
        this.devicesTypes.addAll(devicesTypes);
    }
}