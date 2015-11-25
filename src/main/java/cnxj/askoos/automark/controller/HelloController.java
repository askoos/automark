package cnxj.askoos.automark.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by Askoos on 2015/11/25.
 */
// @EnableAutoConfiguration
@RestController
@RequestMapping("/hello")
public class HelloController {

    private static Logger log = LoggerFactory.getLogger(HelloController.class);

    @RequestMapping("/sayHello/{username}")
    public String sayHello(@PathVariable("username") String username) {
        log.info("usernname: " + username);
        return "Hello " + username + "!";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class);
    }

}
