package com.example.springJunitTestProp.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.core.env.Environment;
import org.springframework.stereotype.Service;

@Service
public class PropertiesHandlerService {

    //    autowiring Spring environment (available only in our app context)
    @Autowired
    Environment environment;


    //    whille app running, it will read the property from application.properties
    //    on one of the unit tests (test profile) we will overwrite that property
    public String getSpringEnvProperty() {
        return environment.getProperty("myEnvironmentProperty"); // so, it should be "env-property-prod" here
    }

    public void setSystemProperty() {
        System.setProperty("mySystemProperty", "system-property-prod");
    }

    public String getSystemProperty() {
        return System.getProperty("mySystemProperty"); // so, it should be "system-property-prod" here
    }

    public String setAndGetProdSystemProperty(){
        setSystemProperty();
        return getSystemProperty();
    }

}
