package com.acme.banking.dbo;

import com.acme.banking.dbo.domain.Client;
import com.acme.banking.dbo.domain.SavingAccount;
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;
import static org.junit.jupiter.api.Assumptions.*;
import static org.hamcrest.MatcherAssert.assertThat;
import static org.hamcrest.Matchers.*;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import org.junit.jupiter.api.Assertions;

@DisplayName("Test Client")
public class ClientTest {
    @Test
    @DisplayName("Test shouldStorePropertiesWhenCreated")
    public void shouldStorePropertiesWhenCreated() {
        //region given
        final int clientId = 1;
        final String clientName = "dummy client name";
        //endregion

        //region when
        Client sut = new Client(clientId, clientName);
        assumeTrue(sut != null);
        //endregion

        //region then
        //Junit5:
        assertAll("Client store its properties",
                () -> assertEquals(clientId, sut.getId()),
                () -> assertEquals(clientName, sut.getName())
        );

        //Hamcrest:
        assertThat(sut,
            allOf(
                hasProperty("id", notNullValue()),
                hasProperty("id", equalTo(clientId)),
                hasProperty("name", is(clientName))
        ));

        //AssertJ:
        org.assertj.core.api.Assertions.assertThat(sut)
                .hasFieldOrPropertyWithValue("id", clientId)
                .hasFieldOrPropertyWithValue("name", clientName);
        //endregion
    }

    @Test
    @DisplayName("Test shouldThrowExceptionWhenIdNegative")
    public void shouldThrowExceptionWhenIdNegative() {

        final int clientId = -1;
        final String clientName = "dummy client name";

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Client(clientId, clientName));
    }

    @Test
    @DisplayName("Test shouldThrowExceptionWhenNameIsEmpty")
    public void shouldThrowExceptionWhenNameIsEmpty() {

        final int clientId = 1;
        final String clientName = "";

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Client(clientId, clientName));

    }

    @Test
    @DisplayName("Test shouldThrowExceptionWhenNameIsNull")
    public void shouldThrowExceptionWhenNameIsNull() {

        final int clientId = 1;
        final String clientName = null;

        Assertions.assertThrows(IllegalArgumentException.class, () -> new Client(clientId, clientName));

    }

    @Test
    @DisplayName("Test shouldReturnTrueWhenAccountAccountAdded")
    public void shouldReturnTrueWhenAccountAccountAdded() {

        final int clientId = 1;
        final String clientName = "Client";
        final int SavingAccountId = 1;
        final double amount = 1;

        Client sut = new Client(clientId, clientName);
        SavingAccount dummyAccount = new SavingAccount(SavingAccountId, sut, amount );

        assertFalse(sut.getAccounts().isEmpty());
    }

}
