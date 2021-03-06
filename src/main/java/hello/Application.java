package hello;


import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
// exercise from: https://spring.io/guides/gs/spring-boot-docker/
@SpringBootApplication
@RestController
public class Application {

    @RequestMapping("/")
    public String home() {
        return "Hello Docker World";
    }
    @RequestMapping ("/1")
    public String one() {
        return "One One One";
    }
    public static void main(String[] args) {
        SpringApplication.run(Application.class, args);
    }

}
