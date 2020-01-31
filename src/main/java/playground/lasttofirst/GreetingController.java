package playground.lasttofirst;

import java.util.concurrent.atomic.AtomicLong;

import org.springframework.web.bind.annotation.*;

@RestController
public class GreetingController {

    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "wwwWo") String name, @RequestParam(value = "id", defaultValue = "1") long id) {
        return new Greeting(id, String.format(template, name));
    }

    @PostMapping("/greeting")
    public Greeting postGreeting() {
        return new Greeting(1, "qqqqq");
    }

    @PutMapping("/greeting")
    public Greeting putGreeting() {
        return new Greeting(1, "qqqqq");
    }

    @DeleteMapping("/greeting")
    public Greeting delGreeting() {
        return new Greeting(1, "qqqqq");
    }

    @PatchMapping("/greeting")
    public Greeting patchGreeting() {
        return new Greeting(1, "qqqqq");
    }
}