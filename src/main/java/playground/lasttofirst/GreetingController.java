package playground.lasttofirst;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "wwwWo") String name,@RequestParam(value = "id", defaultValue = "1") long id) {
        return new Greeting(id, String.format(template, name));
    }

    @PostMapping("/greeting")
    public Greeting postGreeting()  {
        return new Greeting(1, "qqqqq");
    }

}