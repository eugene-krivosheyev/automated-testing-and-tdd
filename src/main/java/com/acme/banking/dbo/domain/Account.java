package com.acme.banking.dbo.domain;

import java.util.UUID;

public interface Account {
    Integer getId();
    Integer getClientId(); //TODO reference integrity
}
