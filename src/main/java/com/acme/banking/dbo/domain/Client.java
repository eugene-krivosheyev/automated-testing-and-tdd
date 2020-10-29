package com.acme.banking.dbo.domain;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

public class Client {
    private final UUID id;
    private final String name;
    private final Collection<Account> accounts;

    public Client(UUID id, String name, Collection<? extends Account> accounts) {
        if (id == null) throw new IllegalArgumentException("id is null");
        if (name == null) throw new IllegalArgumentException("name is null");
        if (name.isEmpty()) throw new IllegalArgumentException("name is empty");
        if (accounts == null) throw new IllegalArgumentException("accounts is null");
        if (accounts.isEmpty()) throw new IllegalArgumentException("accounts is empty");

        this.id = id;
        this.name = name;
        this.accounts = new ArrayList<>(accounts);
    }

    public UUID getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public Collection<Account> getAccounts() {
        return accounts;
    }
}
