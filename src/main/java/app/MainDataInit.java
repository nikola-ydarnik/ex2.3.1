package app;

import app.model.User;
import app.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import javax.annotation.PostConstruct;
@Component
public class MainDataInit {

    @Autowired
    private UserService userService;

    @PostConstruct
    public void init() {
        userService.addUser(new User("Nick", "Tikhonov", 27));
        userService.addUser(new User("Mari", "Tikhonova", 26));
        userService.addUser(new User("Igor", "Ratev", 34));
    }
}
