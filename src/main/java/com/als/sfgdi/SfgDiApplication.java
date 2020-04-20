package com.als.sfgdi;

import com.als.sfgdi.controller.ConstructorInjectedController;
import com.als.sfgdi.controller.MyController;
import com.als.sfgdi.controller.PropertyInjectedController;
import com.als.sfgdi.controller.SetterInjectedController;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;

import java.util.logging.Logger;

@SpringBootApplication
public class SfgDiApplication {

    public static void main(String[] args) {
        ApplicationContext ctx = SpringApplication.run(SfgDiApplication.class, args);

        final Logger logger = Logger.getLogger(SfgDiApplication.class.getName());

        logger.info("-----------------Property");
        PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
        logger.info(propertyInjectedController.getGreeting());

        logger.info("-----------------Setter");
        SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
        logger.info(setterInjectedController.getGreeting());

        logger.info("-----------------Constructor");
        ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
        logger.info(constructorInjectedController.getGreeting());

        logger.info("-----------------PrimaryBean");
        MyController myController = (MyController) ctx.getBean("myController");
        logger.info(myController.sayHello());

    }

}
