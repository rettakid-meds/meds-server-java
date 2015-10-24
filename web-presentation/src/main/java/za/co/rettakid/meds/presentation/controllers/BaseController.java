package za.co.rettakid.meds.presentation.controllers;

/**
 * Created by Lwazi Prusent on 2015/10/20.
 */
public class BaseController {

    protected static final String HOME_PAGE = "home";
    protected static final String LOGIN_PAGE = "login";
    protected static final String DASHBOARD_PAGE = "dashboard";

    protected String doRedirect(String page)   {
        return String.format("redirect:/%s",page);
    }

}
