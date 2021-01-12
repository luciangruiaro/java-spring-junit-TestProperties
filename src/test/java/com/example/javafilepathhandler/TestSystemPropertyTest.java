package com.example.javafilepathhandler;

import com.example.javafilepathhandler.service.PropertiesHandlerService;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class TestSystemPropertyTest {

    @Autowired
    PropertiesHandlerService propertiesHandlerService;


    @Test
    public void testSysPropertyTest() {
        System.setProperty("mySystemProperty", "system-property-test"); // this will set our sys property from here and will be visible in spring context
        Assert.assertEquals("system-property-test", propertiesHandlerService.getSystemProperty());
    }

}
