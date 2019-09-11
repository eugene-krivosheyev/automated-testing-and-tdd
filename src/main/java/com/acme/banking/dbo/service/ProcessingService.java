package com.acme.banking.dbo.service;

import com.acme.banking.dbo.dto.AccountDto;
import com.acme.banking.dbo.dto.ClientDto;
import com.acme.banking.dbo.error.AccountNotEnoughException;
import com.acme.banking.dbo.error.NotFoundException;

import java.util.List;
import java.util.UUID;

public interface ProcessingService {
    ClientDto createClient(String name);
    List<AccountDto> getAccountsByClientId(UUID clientId) throws NotFoundException;
    UUID transfer(double amount, UUID fromAccountId, UUID toAccountId) throws AccountNotEnoughException;
    void cash(double amount, UUID fromAccountId);
}
