package dev.daqiang.ficusvirens.root.api;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author Vista Yih
 * @version 0.1.0
 * <p>
 * Created on 2020/11/8
 * Package dev.daqiang.ficusvirens.root.api in ficus-virens
 */
@RestController
public class IndexController {

    @GetMapping("/")
    public String index() {
        return "Application is running";
    }

    @GetMapping("/admin")
    public String admin() {
        return "This is Admin page!";
    }

    @GetMapping("/user")
    public String user() {
        return "This is User page!";
    }

}

