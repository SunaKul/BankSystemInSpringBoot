package com.example.BankSystem.domain;

import org.springframework.boot.autoconfigure.domain.EntityScan;

/*import org.springframework.stereotype.Component;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.Table;

@Entity
@Table(name = "banks")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected String name;

    public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public abstract void deposit(User user, double amount);

    // getter setter ekle
}


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
*/

import org.springframework.stereotype.Component;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Inheritance;
import jakarta.persistence.InheritanceType;
import jakarta.persistence.Table;



@EntityScan
@Table(name = "banks")
@Inheritance(strategy = InheritanceType.SINGLE_TABLE)
public abstract class Bank {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    protected String name;

    
    public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public Bank() {
    }

    public Bank(String name) {
        this.name = name;
    }

    public abstract void deposit(User user, double amount);

    
}





