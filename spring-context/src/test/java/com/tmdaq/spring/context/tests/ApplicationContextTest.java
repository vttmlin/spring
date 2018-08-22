package com.tmdaq.spring.context.tests;

import org.junit.Before;
import org.junit.Test;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import static org.junit.Assert.assertNotNull;

public class ApplicationContextTest {
    private ApplicationContext applicationContext;

    @Before
    public void before() {
        String configLocation = "/com/tmdaq/spring/context/test.xml";
        applicationContext = new ClassPathXmlApplicationContext(configLocation);
    }

    @Test
    public void test() {
        Object person = applicationContext.getBean("person");
        assertNotNull(person);
    }
}
