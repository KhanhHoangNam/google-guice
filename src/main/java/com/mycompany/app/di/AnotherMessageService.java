package com.mycompany.app.di;

public class AnotherMessageService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("AnotherMessageService: " + message);
    }
}
