package pl.cloud.test.controller;

import org.hibernate.validator.internal.metadata.raw.BeanConfiguration;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.cloud.context.config.annotation.RefreshScope;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import pl.cloud.test.coonfig.Configuration;

@RestController
@RefreshScope
public class TestController {

    @Autowired
    private Configuration cOnfiguration;

    @Value("${valores.valor_fijo}")
    private String valores;

    @GetMapping("/message")
    public String mesagage() {
        System.err.println(cOnfiguration);
        System.err.println(valores);
        return "aaaaa";
    }


}
