package case_study_furama_resort.models;

public class Customer {
    //Họ tên , Ngày sinh, Giới tính, Số CMND,
    // Số ĐT, Email, Loại khách, Địa chỉ và
    // thuộc tính sử dụng dịch vụ có kiểu đối tượng là Services.
    private String nameCustomer;
    private String birthday;
    private String gender;
    private String idCardNumber;
    private String phoneNumber;
    private String email;
    private String typeOfCustomer;
    private String address;
    private Services usingService;

    public Customer() {
    }

    public Customer(String nameCustomer, String birthday, String gender, String idCardNumber,
                    String phoneNumber, String email, String typeOfCustomer, String address) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
    }

    public Customer(String nameCustomer, String birthday, String gender, String idCardNumber, String phoneNumber,
                    String email, String typeOfCustomer, String address, Services usingService) {
        this.nameCustomer = nameCustomer;
        this.birthday = birthday;
        this.gender = gender;
        this.idCardNumber = idCardNumber;
        this.phoneNumber = phoneNumber;
        this.email = email;
        this.typeOfCustomer = typeOfCustomer;
        this.address = address;
        this.usingService = usingService;
    }

    public String getNameCustomer() {
        return nameCustomer;
    }

    public void setNameCustomer(String nameCustomer) {
        this.nameCustomer = nameCustomer;
    }

    public String getBirthday() {
        return birthday;
    }

    public void setBirthday(String birthday) {
        this.birthday = birthday;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getIdCardNumber() {
        return idCardNumber;
    }

    public void setIdCardNumber(String idCardNumber) {
        this.idCardNumber = idCardNumber;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getTypeOfCustomer() {
        return typeOfCustomer;
    }

    public void setTypeOfCustomer(String typeOfCustomer) {
        this.typeOfCustomer = typeOfCustomer;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public Services getUsingService() {
        return usingService;
    }

    public void setUsingService(Services usingService) {
        this.usingService = usingService;
    }

    @Override
    public String toString() {
        return nameCustomer + ", " + birthday + ", " + gender + ", " +
                idCardNumber + ", " + phoneNumber + ", " + email + ", " +
                typeOfCustomer + ", " + address + ", " + usingService;
    }
}
