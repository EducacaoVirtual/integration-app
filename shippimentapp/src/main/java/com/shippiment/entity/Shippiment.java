package com.shippiment.entity;

import jakarta.persistence.*;

@Entity
@Table(name = "shippiments")
public class Shippiment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private String shippimentId;
    private String item;
    private String shippimentAddress;
    private String recipient;

    public Shippiment() {
    }

    public Shippiment(String shippimentId, String item, String shippimentAddress, String recipient) {
        this.shippimentId = shippimentId;
        this.item = item;
        this.shippimentAddress = shippimentAddress;
        this.recipient = recipient;
    }

    public String getShippimentId() {
        return shippimentId;
    }

    public void setShippimentId(String shippimentId) {
        this.shippimentId = shippimentId;
    }

    public String getItem() {
        return item;
    }

    public void setItem(String item) {
        this.item = item;
    }

    public String getShippimentAddress() {
        return shippimentAddress;
    }

    public void setShippimentAddress(String shippimentAddress) {
        this.shippimentAddress = shippimentAddress;
    }

    public String getRecipient() {
        return recipient;
    }

    public void setRecipient(String recipient) {
        this.recipient = recipient;
    }
}

