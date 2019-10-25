package pl.cloud.test.controller;

import org.hibernate.validator.internal.metadata.raw.BeanConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.cloud.test.coonfig.Configuration;

@RestController
public class TestController {

    @Autowired
    private Configuration cOnfiguration;


    @Value("${valores.valor_fijo}")
    String valorFijo;

    @GetMapping("/message")
    public String mesagage() {
        System.err.println(cOnfiguration.getMaximum());
        return "aaaaa";
    }



}
