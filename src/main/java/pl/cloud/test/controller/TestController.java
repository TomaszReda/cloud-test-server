package pl.cloud.test.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.cloud.test.coonfig.Configuration;

@RestController
public class TestController {

    @Autowired
    private Configuration cOnfiguration;

    @GetMapping("/message")
    public String mesagage() {
        System.err.println(cOnfiguration.getMaximum());
        return "aaaaa";
    }

}
