package com.kodilla.spring.good.patterns.allegro;

public class SmsInformation implements InformationService {

    @Override
    public void inform(User user) {
        System.out.println("Sending sms to " + user.toString());
    }
}
