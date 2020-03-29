package com.mycompany.app.di;

public class EmailService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("Email Message: " + message);
    }
}
