package com.acme.banking.dbo;

import com.acme.banking.dbo.domain.Client;
import com.acme.banking.dbo.domain.SavingAccount;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;

import java.util.UUID;

import static org.assertj.core.api.Assertions.assertThatThrownBy;
import static org.hamcrest.CoreMatchers.*;
import static org.hamcrest.beans.HasPropertyWithValue.hasProperty;
import static org.junit.Assert.assertThat;

public class SavingAccountTest {
    public static final UUID ID_STUB = UUID.fromString("8fe9595d-de6e-4d07-bc56-dacdad16f5c2");
    public static final Client CLIENT_STUB = new Client(ID_STUB,"dummy client name");
    public static final double AMOUNT_STUB = 10000;
    public SavingAccount sut;
    public SavingAcountBuilder builderSut = new SavingAcountBuilder();

    @Before
    void SavingAccount(){

    }

    @Rule
    public ExpectedException thrown = ExpectedException.none();

    @Test
    public void shouldStorePropertiesWhenCreated(){

        sut = builderSut.UUID(ID_STUB).client(CLIENT_STUB).amount(AMOUNT_STUB).build();
        assertThat(sut,
                allOf(
                        hasProperty("id", notNullValue()),
                        hasProperty("id", equalTo(ID_STUB)),
                        hasProperty("client", equalTo(CLIENT_STUB)),
                        hasProperty("amount", equalTo(AMOUNT_STUB))
                ));
    }

    @Test
    public void shouldGettExceptionWhenUUIDIsNull() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("id must be not null");

        sut = builderSut.UUID(null).client(CLIENT_STUB).amount(AMOUNT_STUB).build();
   }

    @Test
    public void shouldGetExceptionWhenClientIsNull() {
        assertThatThrownBy(() -> {
            SavingAccount sut = new SavingAccount(ID_STUB, null, AMOUNT_STUB);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("client must be not null");
    }

    @Test
    public void shouldGetExceptionWhenAmountIsNegative() {
        assertThatThrownBy(() -> {
            SavingAccount sut = new SavingAccount(ID_STUB, CLIENT_STUB, -1);
        }).isInstanceOf(IllegalArgumentException.class)
                .hasMessageContaining("amount must be > 0");
    }

    @Test
    public void shouldGetExceptionWhenAmountIsZero() {
        thrown.expect(IllegalArgumentException.class);
        thrown.expectMessage("amount must be > 0");
        SavingAccount sut = new SavingAccount(ID_STUB, CLIENT_STUB, 0);
    }
}
