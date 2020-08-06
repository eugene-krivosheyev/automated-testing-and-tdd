package com.acme.banking.dbo.service;

import com.acme.banking.dbo.domain.Account;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ProcessingTest {

    @Test
    public void shouldWithdrawAndDepositWhenTransfer() {
        final Processing processing = new Processing();
        final Account fromAccountMock = mock(Account.class);
        final Account toAccountMock = mock(Account.class);

        processing.transfer(1., fromAccountMock, toAccountMock);

        verify(fromAccountMock, times(1)).withDraw(1.);
        verify(toAccountMock, atLeastOnce()).deposit(1.);
    }
}