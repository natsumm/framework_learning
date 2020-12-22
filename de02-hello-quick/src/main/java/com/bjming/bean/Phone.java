package com.bjming.bean;

/**
 * Author: AshenOne
 * Time: 12/03/2020 10:35
 */
public class Phone {
    private String name;
    private Double price;

    @Override
    public String toString() {
        return "Phone{" +
                "name='" + name + '\'' +
                ", price=" + price +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        this.price = price;
    }
}


