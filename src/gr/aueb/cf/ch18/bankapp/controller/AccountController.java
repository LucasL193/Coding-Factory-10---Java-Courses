package gr.aueb.cf.ch18.bankapp.controller;

import gr.aueb.cf.ch18.bankapp.dto.AccountInsertDTO;
import gr.aueb.cf.ch18.bankapp.dto.AccountReadOnlyDTO;
import gr.aueb.cf.ch18.bankapp.model.Account;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;

public class AccountController {

    // dummy

    private final List<Account> accounts = new ArrayList<>();

    public AccountReadOnlyDTO createNewAccount(String iban, BigDecimal balance) {
        // Data binding
        AccountInsertDTO insertDTO = new AccountInsertDTO(iban, balance);
        AccountReadOnlyDTO readOnlyDTO;

        // validation

        // Dummy
        String dtoIban = insertDTO.iban();
        BigDecimal dtoBalance = insertDTO.balance();

        // Mapping
        Account account = new Account(dtoIban, dtoBalance);
        accounts.add(account); // mapping

        readOnlyDTO = new AccountReadOnlyDTO(account.getIban(), account.getBalance());
        return readOnlyDTO;
    }
}
