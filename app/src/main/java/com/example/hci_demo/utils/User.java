package com.example.hci_demo.utils;

public class User {
    private String email;
    private String password;
    private UserType type;

    private String name;
    private String description;
    private int minPrice;
    private int topPrice;
    private supplierType supType;
    private float supplierRating;

    public User(String email, String password, UserType type) {
        this.email = email;
        this.password = password;
        this.type = type;
    }

    public User (String name, String description, int minPrice,int topPrice,supplierType type, float rate){
        this.name = name;
        this.description = description;
        this.minPrice = minPrice;
        this.topPrice = topPrice;
        this.supType = type;
        this.supplierRating = rate;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public float getSupplierRating() {
        return supplierRating;
    }

    public void setSupplierRating(float supplierRating) {
        this.supplierRating = supplierRating;
    }

    public int getMinPrice() {
        return minPrice;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public int getTopPrice() {
        return topPrice;
    }

    public void setTopPrice(int topPrice) {
        this.topPrice = topPrice;
    }

    public supplierType getSupType() {
        return supType;
    }

    public void setSupType(supplierType supType) {
        this.supType = supType;
    }
    public void setSupType(String str) {
        supplierType suppType = supplierType.Catering;
        switch (str){
            case " Catering" :
                suppType = supplierType.Catering;
                break;
            case  "Flowers" :
                suppType = supplierType.Flowers;
                break;
            case  "DJ" :
                suppType = supplierType.DJ;
                break;
            case  "Decoration" :
                suppType = supplierType.Decoration;
                break;
            case  "Candies":
                suppType = supplierType.Candies;
                break;
        }
        this.supType = suppType;
    }

    public void setMinPrice(int minPrice) {
        this.minPrice = minPrice;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public UserType getType() {
        return type;
    }

    @Override
    public String toString() {
        return "User{" +
                "email='" + email + '\'' +
                ", type=" + type +
                '}';
    }

}
