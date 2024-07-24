package org.example;

//customer sınıfı
//müşteri bilgileri tanımlarnır
class Customer {
    private String customerId;
    private String name;

    //constructor
    public Customer(String customerId, String name) {
        this.customerId = customerId;
        this.name = name;
    }

    public String getCustomerId() {
        return customerId;
    }

    public String getName() {
        return name;
    }
}
