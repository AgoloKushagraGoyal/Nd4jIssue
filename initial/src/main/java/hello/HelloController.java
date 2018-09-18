package hello;

import org.nd4j.linalg.factory.Nd4j;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.RequestMapping;

@RestController
public class HelloController {
    
    @RequestMapping("/")
    public String index() {
        Nd4j.create(300);
        return "Greetings from Spring Boot!";
    }
    
}
