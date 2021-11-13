package dev.daqiang.ficusvirens.root.api.v1;

import dev.daqiang.ficusvirens.root.domain.entity.Greeting;
import org.springframework.web.bind.annotation.*;

import java.util.concurrent.atomic.AtomicLong;

/**
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/11/8
 * Package dev.daqiang.ficusvirens.root.api.v1 in ficus-virens
 */
@RestController
//@CrossOrigin(origins = "http://localhost:4200")
@RequestMapping("/api/v1")
public class UserController {
    private static final String template = "Hello, %s!";
    private final AtomicLong counter = new AtomicLong();

    @GetMapping("/greeting")
    public Greeting greeting(@RequestParam(value = "name", defaultValue = "world") String name) {
        return new Greeting(counter.incrementAndGet(), String.format(template, name));
    }
}
