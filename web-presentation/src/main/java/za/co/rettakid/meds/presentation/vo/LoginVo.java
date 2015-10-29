package za.co.rettakid.meds.presentation.vo;


import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;

/**
 * Created by Lwazi Prusent on 2015/10/20.
 */
public class LoginVo {

    @NotNull @Size(min = 1)
    private String username;
    @NotNull @Size(min = 1)
    private String password;

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
