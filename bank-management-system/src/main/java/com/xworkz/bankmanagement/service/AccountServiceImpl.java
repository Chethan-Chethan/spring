package com.xworkz.bankmanagement.service;

import com.xworkz.bankmanagement.entity.Account;
import com.xworkz.bankmanagement.repository.AccountRepository;
import org.springframework.stereotype.Service;

@Service
public class AccountServiceImpl implements AccountService{

    public AccountRepository repository;

    public AccountServiceImpl(AccountRepository repository) {
        this.repository = repository;
    }
    @Override
    public Account validateAndSaveAccountInfo(Account entity) {
        Account isSaveValid = null;

        if (entity!=null) {
            isSaveValid = repository.saveAccountInfo(entity);
        } else {
            System.out.println("Failed to save");
        }
        return isSaveValid;
    }
}
