package com.acme.banking.dbo.domain;

import org.junit.jupiter.api.Disabled;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.params.ParameterizedTest;
import org.junit.jupiter.params.provider.MethodSource;

import java.util.stream.Stream;

import static org.assertj.core.api.Assertions.assertThat;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertThrows;
import static org.mockito.Mockito.mock;
import static org.mockito.Mockito.verify;

public class SavingAccountUnitTest {

    final static int ACCOUNT_ID = 1;
    final static double AMOUNT = 1000;
    final static int CLIENT_ID = 1;
    final static String CLIENT_NAME = "dummy client name";
    Client DUMMY_CLIENT = mock(Client.class);

    @Test
    public void shouldStorePropertiesWhenCreate(){
        SavingAccount sut = new SavingAccount(ACCOUNT_ID, DUMMY_CLIENT, AMOUNT);
        assertEquals(ACCOUNT_ID, sut.getId());
        assertEquals(AMOUNT, sut.getAmount());
        assertEquals(DUMMY_CLIENT, sut.getClient());
    }

    @ParameterizedTest
    @MethodSource("exceptionsTestData")
    public void shouldThrowExceptionWhenIdIsNegative(SavingAccountTest.AccountTestData data){
        assertThrows(IllegalArgumentException.class, () -> new SavingAccount(data.getAccountId(),
                data.getClient(), data.getAmount()), data.getExceptionText());
    }

    static Stream<SavingAccountTest.AccountTestData> exceptionsTestData(){
        Client DUMMY_CLIENT = mock(Client.class);
        return Stream.of(new SavingAccountTest.AccountTestData(-1, AMOUNT, DUMMY_CLIENT, "id should be positive"),
                new SavingAccountTest.AccountTestData(ACCOUNT_ID, -1, DUMMY_CLIENT, "amount should be positive"),
                new SavingAccountTest.AccountTestData(ACCOUNT_ID, AMOUNT, null, "client should not be null"));
    }

    static class AccountTestData{
        private int accountId;
        private double amount;
        private Client client;
        private String exceptionText;


        AccountTestData(int accountId, double amount, Client client, String exceptionText){
            this.accountId = accountId;
            this.amount = amount;
            this.client = client;
            this.exceptionText = exceptionText;
        }

        public int getAccountId() {
            return accountId;
        }

        public double getAmount() {
            return amount;
        }

        public Client getClient() {
            return client;
        }

        public String getExceptionText() {
            return exceptionText;
        }

        @Override
        public String toString() {
            return "AccountTestData{" +
                    "accountId=" + accountId +
                    ", amount=" + amount +
                    ", client=" + client +
                    ", exceptionText='" + exceptionText + '\'' +
                    '}';
        }
    }

    @Disabled
    @Test
    public void clientAccountsShouldHaveSameClientIntegration(){
        final Client client = new Client(CLIENT_ID, CLIENT_NAME);
        final SavingAccount sut = new SavingAccount(ACCOUNT_ID, client, AMOUNT);
        assertThat(client.getAccounts()).contains(sut);
    }

    @Test
    public void shoudInvokeAddAccountMethod(){
        final Client mockClient = mock(Client.class);
        final SavingAccount sut = new SavingAccount(ACCOUNT_ID, mockClient, AMOUNT);
        verify(mockClient).addAccount(sut);
    }
}
