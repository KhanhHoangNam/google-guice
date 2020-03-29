package com.mycompany.app.googleguice.firstexample;

import com.google.inject.AbstractModule;
import com.mycompany.app.di.EmailService;
import com.mycompany.app.di.MessageService;

public class FirstModule extends AbstractModule {

    @Override
    protected void configure() {
        bind(MessageService.class).to(EmailService.class);
    }
}
