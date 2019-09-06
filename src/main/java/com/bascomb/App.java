package com.bascomb;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Hello world!
 *
 */
@SpringBootApplication
public class App 
{
    public static void main( String[] args )
    {
        //ApplicationContext context = SpringApplication.run(App.class, args);
        SpringApplicationBuilder sb = new SpringApplicationBuilder(App.class);
        sb.web(WebApplicationType.NONE);
        ConfigurableApplicationContext context = sb.run(args);
        printArguments(context);
    }

    @Autowired
    private static void printArguments(ConfigurableApplicationContext context) {
        ApplicationArguments args = context.getBean(ApplicationArguments.class);
        System.out.println(args.getSourceArgs()[0]);
    }
}
