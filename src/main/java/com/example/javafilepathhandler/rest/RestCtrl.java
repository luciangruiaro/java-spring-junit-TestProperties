package com.example.javafilepathhandler.rest;

import com.example.javafilepathhandler.service.PropertiesHandlerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class RestCtrl {

    @Autowired
    Environment env;

    @Autowired
    PropertiesHandlerService propertiesHandlerService;


    @GetMapping("restStatus")
    public String health() {
        return "Rest API is working fine!";
    }

    @GetMapping("envProperty")
    public String getEnvProperty() {
        return "Value of our spring env property set in application.properties: ".concat(propertiesHandlerService.getSpringEnvProperty());
    }

    @GetMapping("sysProperty")
    public String getSysProperty() {
        return "Value of our system property which is living in the jvm: ".concat(propertiesHandlerService.getSystemProperty());
    }
}
