package com.example.BankSystem.service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

import org.springframework.stereotype.Service;

import com.example.BankSystem.domain.Bank;
import com.example.BankSystem.domain.User;

@Service
public class BankServiceImp implements BankService {
    private Map<String, Bank> banks;

    public BankServiceImp(List<Bank> bankList) {
        banks = new HashMap<>();

        for (Bank bank : bankList) {
            banks.put(bank.getName(), bank);
        }
    }

    @Override
    public void deposit(String bankName, User user, double amount) {
        Bank bank = banks.get(bankName);
        if (bank != null) {
            bank.deposit(user, amount);
        } else {
            throw new IllegalArgumentException("Bank not found: " + bankName);
        }
    }
}