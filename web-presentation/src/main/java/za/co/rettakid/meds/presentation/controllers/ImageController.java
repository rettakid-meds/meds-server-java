package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.rettakid.meds.common.dto.FileDto;
import za.co.rettakid.meds.common.dto.ImageDto;
import za.co.rettakid.meds.services.FileService;
import za.co.rettakid.meds.services.ImageService;

import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;

/**
 * Created by Lwazi Prusent on 2015/10/28.
 */
@Controller
@RequestMapping("/images")
public class ImageController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(ImageController.class);

    @Autowired
    private ImageService imageService;

    @ResponseBody
    @RequestMapping(value = "/{imageId}" , produces = MediaType.IMAGE_JPEG_VALUE)
    public byte[] getFile(@PathVariable("imageId") Long imageId) throws IOException {
        LOGGER.info("get image");
        ImageDto imageDto = imageService.getImages(imageId);
        FileDto fileDto = imageDto.getFile();
        Path path = Paths.get(FILE_DIR + fileDto.getGuid());
        return Files.readAllBytes(path);
    }

}
