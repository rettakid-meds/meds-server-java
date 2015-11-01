package za.co.rettakid.meds.common.dto;

import javax.xml.bind.annotation.XmlElementWrapper;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlElement;
import java.util.ArrayList;
import java.util.List;
import java.util.Date;

@XmlRootElement(name = "filelistdto")
public class FileListDto   {

    @XmlElementWrapper(name = "files")
    @XmlElement(name = "filedto",type = FileDto.class)
    private List<FileDto> files = new ArrayList<FileDto>();

    public List<FileDto> getFileList()   {
        return this.files;
    }

    public void addFileList(List<FileDto> files)   {
        this.files.addAll(files);
    }
}