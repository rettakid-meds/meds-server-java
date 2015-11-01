package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name = "prescriptionlistdto")
public class PrescriptionListDto   {

    @XmlElementWrapper(name = "prescriptions")
    @XmlElement(name = "prescriptiondto",type = PrescriptionDto.class)
    private List<PrescriptionDto> prescriptions = new ArrayList<PrescriptionDto>();

    public List<PrescriptionDto> getPrescriptionList()   {
        return this.prescriptions;
    }

    public void addPrescriptionList(List<PrescriptionDto> prescriptions)   {
        this.prescriptions.addAll(prescriptions);
    }
}