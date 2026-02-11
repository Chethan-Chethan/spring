package com.xworkz.bankmanagement.configuration;

import com.xworkz.bankmanagement.entity.Account;
import com.xworkz.bankmanagement.repository.AccountRepository;
import com.xworkz.bankmanagement.repository.AccountRepositoryImpl;
import com.xworkz.bankmanagement.service.AccountService;
import com.xworkz.bankmanagement.service.AccountServiceImpl;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BankConfiguration {

    @Bean
    public AccountRepository repository() {
        return new AccountRepositoryImpl();
    }
    @Bean
    public AccountService service() {
        return new AccountServiceImpl(repository());
    }
}
