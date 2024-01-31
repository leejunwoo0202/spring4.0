package org.example;

import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.GenericApplicationContext;
import org.springframework.context.support.GenericXmlApplicationContext;
import org.springframework.core.env.ConfigurableEnvironment;
import org.springframework.core.env.MutablePropertySources;
import org.springframework.core.io.support.ResourcePropertySource;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import java.io.IOException;

@ExtendWith(SpringExtension.class)
public class PropertyTest {

    @Test
    public void propertyTest() throws IOException {

        String classpath = "classpath:/db.properties";

        ConfigurableApplicationContext context = new GenericXmlApplicationContext();
        
        ConfigurableEnvironment env = context.getEnvironment();
        MutablePropertySources propertySources = env.getPropertySources();
        propertySources.addLast(new ResourcePropertySource(classpath));
        System.out.println("propertySources = " + propertySources);

        //Assertions.assertThat(propertySources.)
    }
}
