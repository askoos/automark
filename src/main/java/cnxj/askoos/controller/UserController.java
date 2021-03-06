package cnxj.askoos.controller;

import cnxj.askoos.model.User;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

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

    @RequestMapping("/findAll")
    @ResponseBody
    public List findAll() {
        List<User> list = new ArrayList<User>();
        list.add(new User(11L, "Askoos", 36));
        list.add(new User(12L, "Keith", 35));
        list.add(new User(13L, "Aikmin", 34));
        return list;
    }

    public static void main(String[] args) {
        SpringApplication.run(UserController.class);
    }

}
