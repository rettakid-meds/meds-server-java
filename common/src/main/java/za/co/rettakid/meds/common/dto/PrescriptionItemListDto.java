package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;

@XmlRootElement(name = "prescriptionitemlistdto")
public class PrescriptionItemListDto   {

    @XmlElementWrapper(name = "prescriptionitems")
    @XmlElement(name = "prescriptionitemdto",type = PrescriptionItemDto.class)
    private List<PrescriptionItemDto> prescriptionItems = new ArrayList<PrescriptionItemDto>();

    public List<PrescriptionItemDto> getPrescriptionItemList()   {
        return this.prescriptionItems;
    }

    public void addPrescriptionItemList(List<PrescriptionItemDto> prescriptionItems)   {
        this.prescriptionItems.addAll(prescriptionItems);
    }
}