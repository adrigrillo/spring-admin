package es.adrigrillo.sampleservice;

import org.springframework.stereotype.Component;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestService {
    @RequestMapping(value = "/helloactuator", method = RequestMethod.GET)
    public String helloActuator() {
        return "Hello Spring Boot Actuator";
    }
}
