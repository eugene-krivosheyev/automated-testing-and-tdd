package com.acme.banking.dbo.service;

import com.acme.banking.dbo.dao.AccountNotFoundException;
import com.acme.banking.dbo.dao.AccountRepository;
import com.acme.banking.dbo.domain.Account;
import com.acme.banking.dbo.domain.Branch;

public class Reporting {
    private AccountRepository accounts;

    //Constructor DI
    public Reporting(AccountRepository accounts) {
        this.accounts = accounts;
    }

    //Setter DI
    public void setAccounts(AccountRepository accounts) {
        this.accounts = accounts;
    }

    /**
     * @return Markdown report for all branches, clients, accounts
     */
    public String getReport(Branch rootBranch) {
        return null;
    }

    public String getReport(Account account) throws AccountNotFoundException {
        final Account foundAccount = accounts.findById(account.getId());
        return "## " + foundAccount.getId() + " " + foundAccount.getClientId();
    }
}
