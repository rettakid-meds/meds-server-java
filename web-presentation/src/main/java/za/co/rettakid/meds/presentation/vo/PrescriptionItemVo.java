package za.co.rettakid.meds.presentation.vo;

import org.hibernate.validator.constraints.*;
import javax.validation.constraints.*;
import javax.validation.Valid;

public class PrescriptionItemVo    {

    private Long prescriptionItemId;
    @Valid
    @NotBlank @NotNull
    private PrescriptionVo prescription;
    @NotBlank @NotNull
    private String name;

    public Long getPrescriptionItemId()   {
        return this.prescriptionItemId;
    }

    public void setPrescriptionItemId(Long prescriptionItemId)   {
        this.prescriptionItemId = prescriptionItemId;
    }

    public PrescriptionVo getPrescription()   {
        return this.prescription;
    }

    public void setPrescription(PrescriptionVo prescription)   {
        this.prescription = prescription;
    }

    public String getName()   {
        return this.name;
    }

    public void setName(String name)   {
        this.name = name;
    }

}