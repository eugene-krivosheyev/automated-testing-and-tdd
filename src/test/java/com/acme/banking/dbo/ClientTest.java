package com.acme.banking.dbo;

import com.acme.banking.dbo.domain.Client;
import org.junit.Test;

import java.util.UUID;

import static org.hamcrest.CoreMatchers.allOf;
import static org.hamcrest.CoreMatchers.equalTo;
import static org.hamcrest.CoreMatchers.notNullValue;
import static org.junit.Assert.*;

public class ClientTest {
    @Test
    public void shouldSavePropertiesWhenCreated() {
        //region given
        UUID stubId = UUID.randomUUID();
        //endregion

        //region when
        Client sut = new Client(stubId, "dummy client name");
        //endregion

        //region then
        assertThat(sut.getId(),
                allOf(
                        equalTo(stubId),
                        notNullValue()
                ));
        //endregion
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNameIsNull() {
        //region given
        UUID stubId = UUID.randomUUID();
        Client sut = null;
        String name = null;
        //endregion

        try {
            //region when
            sut = new Client(stubId, name);
            //endregion

        //region then
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        } finally {
            assertNull(sut);
        }
        //endregion
    }
    @Test
    public void shouldThrowIllegalArgumentExceptionWhenIdIsNull() {
        //region given
        UUID stubId = null;
        Client sut = null;
        String name = "dummy client name";
        //endregion

        try {
            //region when
            sut = new Client(stubId, name);
            //endregion

            //region then
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        } finally {
            assertNull(sut);
        }
        //endregion
    }

    @Test
    public void shouldThrowIllegalArgumentExceptionWhenNameIsEmpty() {
        //region given
        UUID stubId = UUID.randomUUID();
        Client sut = null;
        String name = "";
        //endregion

        try {
            //region when
            sut = new Client(stubId, name);
            //endregion

            //region then
        } catch (IllegalArgumentException e) {
            assertTrue(true);
        } catch (Exception e) {
            fail(e.getLocalizedMessage());
        } finally {
            assertNull(sut);
        }
        //endregion
    }
}
