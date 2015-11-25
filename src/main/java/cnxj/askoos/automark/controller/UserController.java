package cnxj.askoos.automark.controller;

import cnxj.askoos.automark.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Askoos on 2015/11/25.
 */
// @EnableAutoConfiguration
@RestController
@RequestMapping("/user")
public class UserController {

    private static Logger log = LoggerFactory.getLogger(UserController.class);

    @RequestMapping("/{id}")
    public User view(@PathVariable("id") Long id) {
        User user = new User();
        user.setId(id);
        user.setUsername("Askoos");
        user.setAge(35);
        log.info(user.toString());
        return user;
    }

    @RequestMapping("/showUser")
    @ResponseBody
    public User showUser() {
        return new User(11L, "Askoos", 36);
    }

    public static void main(String[] args) {
        SpringApplication.run(UserController.class);
    }

}
