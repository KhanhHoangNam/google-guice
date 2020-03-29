package com.mycompany.app.di;

import com.mycompany.app.ioc.Injector;

import javax.management.InstanceNotFoundException;

public class DependencyInjectionPatternExample {
    public static void main(String[] args) throws InstanceNotFoundException {
        MessageService messageService = (MessageService) Injector.getInstance("messageService");
        UserController userController = new UserController(messageService);
        userController.send();
    }
}
