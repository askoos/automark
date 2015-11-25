package cnxj.askoos.automark;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.EnableAutoConfiguration;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@SpringBootApplication
@Configuration// 配置控制
@ComponentScan// 组件扫描
@EnableAutoConfiguration// 启用自动配置
public class AutoMarkApplication {

    private static Logger log = LoggerFactory.getLogger(AutoMarkApplication.class);

    public static void main(String[] args) {
        // 启动Spring Boot项目的唯一入口
        SpringApplication.run(AutoMarkApplication.class, args);
        log.info("启动AutoMark项目");
    }

}
