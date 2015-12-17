package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.rettakid.meds.common.dto.FileDto;
import za.co.rettakid.meds.services.FileService;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Lwazi Prusent on 2015/10/27.
 */
@Controller
@RequestMapping("/files")
public class FileController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(FileController.class);

    @Autowired
    private FileService fileService;


    @ResponseBody
    @RequestMapping(value = "/{fileId}" , produces = MediaType.ALL_VALUE)
    public byte[] getFile(@PathVariable("fileId") Long fileId) throws IOException {
        LOGGER.info("get file");
        FileDto fileDto = fileService.getFiles(fileId);
        Path path = Paths.get(FILE_DIR + fileDto.getGuid());
        return Files.readAllBytes(path);
    }

}
