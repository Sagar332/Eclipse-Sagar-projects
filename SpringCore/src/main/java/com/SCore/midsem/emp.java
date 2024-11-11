package com.SCore.midsem;

public class emp {
    private String id;
    private String name;
    private String address;

    // Constructor with parameters
    public emp(String id, String name, String address) {
        this.id = id;
        this.name = name;
        this.address = address;
    }

    // Default no-argument constructor
    public emp() {}

    // Getters and Setters
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Emp [id=" + id + ", name=" + name + ", address=" + address + "]";
    }
}
