package com.example.BankSystem.domain;

 

//package com.example.BankSystem.domain;

import org.springframework.stereotype.Component;

@Component
public class Ziraatbank extends Bank {
    public Ziraatbank() {
        super("Ziraat Bank");
    }

    @Override
    public void deposit(User user, double amount) {
        System.out.println(user.getName() + " deposited " + amount + " TL into " + getName());}

	
}

