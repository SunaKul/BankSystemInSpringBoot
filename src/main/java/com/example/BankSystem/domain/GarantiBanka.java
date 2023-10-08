package com.example.BankSystem.domain;

import org.springframework.stereotype.Component;

@Component
public class GarantiBanka extends Bank {
    public GarantiBanka() {
        super("Garanti Bank");
    }

    @Override
    public void deposit(User user, double amount) {
        System.out.println(user.getName() + " deposited " + amount + " TL into " + getName());
    }
}
