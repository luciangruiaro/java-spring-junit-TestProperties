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
public class TestSystemPropertyProd {

    @Autowired
    PropertiesHandlerService propertiesHandlerService;


    @Test
    public void testSysPropertyProd() {
        Assert.assertEquals("system-property-prod", propertiesHandlerService.setAndGetProdSystemProperty()); // this will take variable sys property from spring context
    }
}
