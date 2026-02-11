package com.xworkz.bankmanagement.runner;

import com.xworkz.bankmanagement.configuration.BankConfiguration;
import com.xworkz.bankmanagement.entity.Account;
import com.xworkz.bankmanagement.service.AccountService;
import com.xworkz.bankmanagement.service.AccountServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import org.springframework.context.annotation.Bean;

public class AccountRunner {

    public static void main(String[] args) {

        ApplicationContext context = new AnnotationConfigApplicationContext(BankConfiguration.class);
        AccountService service = context.getBean(AccountService.class);

        Account account = new Account();
        account.setName("Chethan");
        account.setBalance(500);
        account.setAccountType("Savings");
        account.setStatus("Active");
        account.setCreatedDate("2026-02-9");

        Account saved = service.validateAndSaveAccountInfo(account);
        System.out.println(saved);
    }
}
