package com.als.sfgdi.controller;

import com.als.sfgdi.services.ConstructorInjectedGreetingService;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;

class SetterInjectedControllerTest {
    SetterInjectedController controller;

    @BeforeEach
    void setUp() {
        controller=new SetterInjectedController();
        controller.setGreetingService(new ConstructorInjectedGreetingService());
    }

    @Test
    void getGreeting() {
        assertEquals("Hello world!",controller.getGreeting());
    }
}