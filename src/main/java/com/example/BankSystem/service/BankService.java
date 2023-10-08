package com.example.BankSystem.service;

import org.springframework.stereotype.Service;

import com.example.BankSystem.domain.User;

public interface BankService {
    void deposit(String bankName, User user, double amount);
}



