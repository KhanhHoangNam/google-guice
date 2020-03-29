package com.mycompany.app.googleguice.firstexample;

import com.google.inject.Guice;
import com.google.inject.Injector;
import com.mycompany.app.di.UserController;

public class Client {
    public static void main(String[] args) {
        Injector injector = Guice.createInjector(new FirstModule());

        UserController userController = injector.getInstance(UserController.class);

        userController.send();
    }
}
