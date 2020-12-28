package model;

public class Customer {
    private String id;
    private String cusType;
    private String cusName;
    private String cusDob;
    private String cusGender;
    private String cusIdNum;
    private String cusPhone;
    private String cusEmail;
    private String cusAddress;

    public Customer() {
    }

    public Customer(String id, String cusType, String cusName, String cusDob, String cusGender, String cusIdNum, String cusPhone, String cusEmail, String cusAddress) {
        this.id = id;
        this.cusType = cusType;
        this.cusName = cusName;
        this.cusDob = cusDob;
        this.cusGender = cusGender;
        this.cusIdNum = cusIdNum;
        this.cusPhone = cusPhone;
        this.cusEmail = cusEmail;
        this.cusAddress = cusAddress;
    }

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getCusName() {
        return cusName;
    }

    public void setCusName(String cusName) {
        this.cusName = cusName;
    }

    public String getCusDob() {
        return cusDob;
    }

    public void setCusDob(String cusDob) {
        this.cusDob = cusDob;
    }

    public String getCusGender() {
        return cusGender;
    }

    public void setCusGender(String cusGender) {
        this.cusGender = cusGender;
    }

    public String getCusIdNum() {
        return cusIdNum;
    }

    public void setCusIdNum(String cusIdNum) {
        this.cusIdNum = cusIdNum;
    }

    public String getCusPhone() {
        return cusPhone;
    }

    public void setCusPhone(String cusPhone) {
        this.cusPhone = cusPhone;
    }

    public String getCusEmail() {
        return cusEmail;
    }

    public void setCusEmail(String cusEmail) {
        this.cusEmail = cusEmail;
    }

    public String getCusType() {
        return cusType;
    }

    public void setCusType(String cusType) {
        this.cusType = cusType;
    }

    public String getCusAddress() {
        return cusAddress;
    }

    public void setCusAddress(String cusAddress) {
        this.cusAddress = cusAddress;
    }
}
