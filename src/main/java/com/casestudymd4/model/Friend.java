package com.casestudymd4.model;

import javax.persistence.*;

@Entity
public class Friend {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @ManyToOne
    private Account id_account;

    @ManyToOne
    private Account id_friend;

    private Boolean status;

    public Friend() {
    }

    public Friend(Long id, Account id_account, Account id_friend, Boolean status) {
        this.id = id;
        this.id_account = id_account;
        this.id_friend = id_friend;
        this.status = status;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Account getId_account() {
        return id_account;
    }

    public void setId_account(Account id_account) {
        this.id_account = id_account;
    }

    public Account getId_friend() {
        return id_friend;
    }

    public void setId_friend(Account id_friend) {
        this.id_friend = id_friend;
    }

    public Boolean getStatus() {
        return status;
    }

    public void setStatus(Boolean status) {
        this.status = status;
    }
}
