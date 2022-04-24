package com.thesis.pcbuilder.model;

import javax.persistence.*;

@MappedSuperclass
public class Hardware {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;

    private String name;
    private String manufacturer;
    private long lowestPrice;
    private long averagePrice;

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public Hardware(String name, String manufacturer, long lowestPrice, long averagePrice) {
        this.name = name;
        this.manufacturer = manufacturer;
        this.lowestPrice = lowestPrice;
        this.averagePrice = averagePrice;
    }

    public Hardware() {

    }

    public long getAveragePrice() {
        return averagePrice;
    }

    public void setAveragePrice(long averagePrice) {
        this.averagePrice = averagePrice;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getManufacturer() {
        return manufacturer;
    }

    public void setManufacturer(String manufacturer) {
        this.manufacturer = manufacturer;
    }

    public long getLowestPrice() {
        return lowestPrice;
    }

    public void setLowestPrice(long price) {
        this.lowestPrice = price;
    }
}
