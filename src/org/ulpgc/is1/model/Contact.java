package org.ulpgc.is1.model;

public abstract class Contact {
    public String telephone;
    public String email;

    public Contact(String telephone, String email) {
        this.telephone = telephone;
        this.email = email;
    }

    public abstract String getName();
}
