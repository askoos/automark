package cnxj.askoos.automark.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

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

    @RequestMapping("/say")
    public String say(Map<String, Object> model) {
        List<String> list = new ArrayList();
        list.add("Hello Askoo!");
        list.add("Hello Keith!");
        list.add("Hello Aikmin!");
        // 将数据存放map里面，可以直接在velocity页面，使用key访问
        model.put("data", list);
        return "hello";
    }

    public static void main(String[] args) {
        SpringApplication.run(HelloController.class);
    }

}
