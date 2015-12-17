package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import java.util.Date;

/**
 * Created by LWAZI8 on 27/11/2015.
 */
@XmlRootElement(name = "permissiondto")
public class NotificationDto {

    private String header;
    private String body;
    private Date dateSent;
    private Long userId;

    public String getHeader() {
        return header;
    }

    @XmlElement(name = "header" , required = false)
    public void setHeader(String header) {
        this.header = header;
    }

    public String getBody() {
        return body;
    }

    @XmlElement(name = "body" , required = false)
    public void setBody(String body) {
        this.body = body;
    }

    public Long getUserId() {
        return userId;
    }

    @XmlElement(name = "userId" , required = false)
    public void setUserId(Long userId) {
        this.userId = userId;
    }

    public Date getDateSent() {
        return dateSent;
    }

    @XmlElement(name = "dateSent" , required = false)
    public void setDateSent(Date dateSent) {
        this.dateSent = dateSent;
    }
}
