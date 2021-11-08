package ru.yakunin.hellonameforotp;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class HelloNameController {
    @RequestMapping("/hello")
    public String hello (@RequestParam (value = "name") String name) {
        return "Hello " + name + "!";
    }
}
