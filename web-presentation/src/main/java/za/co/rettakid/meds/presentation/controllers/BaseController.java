package za.co.rettakid.meds.presentation.controllers;

import java.util.List;

/**
 * Created by Lwazi Prusent on 2015/10/20.
 */
public class BaseController {

    protected String FILE_DIR = "C:\\images\\";
    protected String MAPS_API_KEY = "AIzaSyAhibwMQzQFt92wgjriJs_Y9deAfmcMOAg";

    protected String doRedirect(String page)   {
        return String.format("redirect:/%s",page);
    }

}
