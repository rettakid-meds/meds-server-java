package za.co.rettakid.meds.presentation.controllers;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.MediaType;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import za.co.rettakid.meds.presentation.common.PageDirectory;
import za.co.rettakid.meds.services.FieldService;

import javax.imageio.ImageIO;
import java.awt.*;
import java.awt.image.BufferedImage;
import java.io.ByteArrayOutputStream;
import java.io.IOException;

/**
 * Created by Lwazi Prusent on 2015/10/26.
 */
@Controller
@RequestMapping("/fields")
public class FieldController extends BaseController {

    private static final Logger LOGGER = Logger.getLogger(DashboardController.class);

    @Autowired
    private FieldService fieldService;

    @RequestMapping
    public String getFieldPage(Model model) {
        LOGGER.debug("accessed field page");
        model.addAttribute("fields",fieldService.getFields().getFieldList());
        return PageDirectory.FIELDS;
    }

    @ResponseBody
    @RequestMapping(value = "/{fieldId}/image", produces = MediaType.IMAGE_PNG_VALUE)
    public byte[] getFieldImage(@PathVariable("fieldId") Long fieldId) throws IOException {
        Integer imageSize = 30;
        BufferedImage image = new BufferedImage(imageSize,imageSize,BufferedImage.TYPE_INT_ARGB);
        Graphics2D graphics2D = image.createGraphics();
        graphics2D.setComposite(AlphaComposite.Clear);
        graphics2D.fillRect(0, 0, imageSize, imageSize);
        graphics2D.setComposite(AlphaComposite.Src);
        Paint paint = Color.decode("#" + fieldService.getFields(fieldId).getMapColor());
        graphics2D.setPaint(paint);
        graphics2D.fillOval(0,0,imageSize,imageSize);
        graphics2D.setRenderingHint(RenderingHints.KEY_ANTIALIASING, RenderingHints.VALUE_ANTIALIAS_ON);
        ByteArrayOutputStream baos = new ByteArrayOutputStream();
        ImageIO.write(image,"png", baos);
        return baos.toByteArray();
    }

}
