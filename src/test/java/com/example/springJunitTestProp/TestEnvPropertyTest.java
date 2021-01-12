package com.example.springJunitTestProp;

import com.example.springJunitTestProp.service.PropertiesHandlerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.core.env.Environment;
import org.springframework.test.context.ActiveProfiles;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
@ActiveProfiles("test") // this will activate application-test.properties properties
public class TestEnvPropertyTest {

    @Autowired
    PropertiesHandlerService propertiesHandlerService;

    @Autowired
    Environment env;

    @Test
    public void testEnvPropertyTest() {
        String envProp = env.getProperty("myEnvironmentProperty");
        System.out.println(envProp);
        Assert.assertEquals("env-property-test", envProp); // will return test env property
    }

}
