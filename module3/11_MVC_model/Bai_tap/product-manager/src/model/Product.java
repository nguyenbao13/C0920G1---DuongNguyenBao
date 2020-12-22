package model;

public class Product {
    private int id;
    private String name;
    private String expiryDate;
    private int amount;

    public Product() {
    }

    public Product(int id, String name, String expiryDate, int amount) {
        this.id = id;
        this.name = name;
        this.expiryDate = expiryDate;
        this.amount = amount;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getExpiryDate() {
        return expiryDate;
    }

    public void setExpiryDate(String expiryDate) {
        this.expiryDate = expiryDate;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }
}
