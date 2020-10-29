import org.springframework.boot.*;
import org.springframework.boot.autoconfigure.*;
import org.springframework.web.bind.annotation.*;

@RestController
@EnableAutoConfiguration
public class Example {

    @RequestMapping("/")
    String home() {
        return "Created without the help of IDE-specific tools";
    }

    public static void main(String[] args) {
        SpringApplication.run(Example.class, args);
    }

}
