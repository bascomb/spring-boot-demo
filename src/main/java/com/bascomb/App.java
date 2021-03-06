package com.bascomb;

import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.WebApplicationType;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.context.ConfigurableApplicationContext;

/**
 * Demo Spring Features by
 * Print Messages from varied sources.
 */
@SpringBootApplication
public class App {
    public static void main(String[] args) {
        //ApplicationContext context = SpringApplication.run(App.class, args);
        SpringApplicationBuilder sb = new SpringApplicationBuilder(App.class);
        sb.web(WebApplicationType.NONE);
        ConfigurableApplicationContext context = sb.run(args);
        printArguments(context);
    }

    private static void printArguments(ConfigurableApplicationContext context) {
        ApplicationArguments args = context.getBean(ApplicationArguments.class);
        System.out.println("Print from Application Args : " + args.getSourceArgs()[0]);

        Properties properties = context.getBean(Properties.class);

        System.out.println("Print from application.properties : Env = " + properties.getEnv());

    }
}
