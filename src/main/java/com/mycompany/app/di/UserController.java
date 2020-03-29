package com.mycompany.app.di;

import com.google.inject.Inject;

public class UserController {

    private MessageService messageService;

    @Inject
    public UserController(MessageService messageService) {
        this.messageService = messageService;
    }

    public void send() {
        messageService.sendMessage("Hello Dependency injection pattern");
    }
}
