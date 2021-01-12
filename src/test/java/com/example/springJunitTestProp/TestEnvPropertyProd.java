package com.example.springJunitTestProp;

import com.example.springJunitTestProp.service.PropertiesHandlerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class TestEnvPropertyProd {


    @Autowired
    PropertiesHandlerService propertiesHandlerService;

    @Autowired
    Environment env;

    @Test
    public void testEnvPropertyProd() {
        String envProp = env.getProperty("myEnvironmentProperty");
        System.out.println(envProp);
        Assert.assertEquals("env-property-prod", envProp); // will return test env property
    }
}
