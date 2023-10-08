package com.example.BankSystem.controller;

import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.BankSystem.domain.DepositRequest;
import com.example.BankSystem.domain.User;
import com.example.BankSystem.service.BankService;

@RestController
@RequestMapping("/banks")
public class BankController {
    private final BankService bankService;

    public BankController(BankService bankService) {
        this.bankService = bankService;
    }

    @PostMapping("/{bankName}/deposit")
    public ResponseEntity<String> deposit(@PathVariable("bankName") String bankName, @RequestBody DepositRequest request) {
        DepositRequest request1 = null;
    	User user = new User();
    	//User user = new User(request1.getUserName()); burdaki gibi olması lazım neden yorumdakini kabul etmiyor??
        bankService.deposit(bankName, user, request1.getAmount()); // bu yüzden null hatası verebilir
        return ResponseEntity.ok(request1.getUserName() + " deposited " + request1.getAmount() + " TL into " + bankName);
    }
}


