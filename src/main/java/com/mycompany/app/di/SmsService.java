package com.mycompany.app.di;

public class SmsService implements MessageService {
    @Override
    public void sendMessage(String message) {
        System.out.println("SmsService: " + message);
    }
}
