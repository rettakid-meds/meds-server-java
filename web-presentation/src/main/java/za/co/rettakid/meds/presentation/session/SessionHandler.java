package za.co.rettakid.meds.presentation.session;

import org.springframework.security.core.context.SecurityContextHolder;
import org.springframework.stereotype.Service;
import za.co.rettakid.meds.common.dto.UserDto;

import javax.enterprise.context.ApplicationScoped;

/**
 * Created by LWAZI8 on 29/11/2015.
 */
@ApplicationScoped
public class SessionHandler {

    public Long getUserId()    {
        return ((UserDto) SecurityContextHolder.getContext().getAuthentication().getPrincipal()).getUserId();
    }

    public UserDto getUser()    {
        return ((UserDto) SecurityContextHolder.getContext().getAuthentication().getPrincipal());
    }

}
