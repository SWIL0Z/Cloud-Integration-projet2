package com.RichemeVyas.App;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

@SpringBootApplication
public class Main {
    public static void main(String[] args) throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        Class.forName("com.RichemeVyas.Domain.Users").newInstance();
        Class.forName("com.RichemeVyas.Domain.Addresses").newInstance();

        ApplicationContext ctx = new ClassPathXmlApplicationContext("config.xml");
    }
}
