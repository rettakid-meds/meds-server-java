package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;

@XmlRootElement(name = "prescriptionitemdto")
public class PrescriptionItemDto    {

    private Long prescriptionItemId;
    private PrescriptionDto prescription;
    private String name;

    public Long getPrescriptionItemId()   {
        return this.prescriptionItemId;
    }

    @XmlElement(name = "prescriptionitemid" , required = false)
    public void setPrescriptionItemId(Long prescriptionItemId)   {
        this.prescriptionItemId = prescriptionItemId;
    }

    public PrescriptionDto getPrescription()   {
        return this.prescription;
    }

    @XmlElement(name = "prescriptiondto")
    public void setPrescription(PrescriptionDto prescription)   {
        this.prescription = prescription;
    }

    public String getName()   {
        return this.name;
    }

    @XmlElement(name = "name")
    public void setName(String name)   {
        this.name = name;
    }

}