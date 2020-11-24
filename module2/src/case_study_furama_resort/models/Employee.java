package case_study_furama_resort.models;

public class Employee {
    //Họ tên ,tuổi , địa chỉ và phương thức toString().
    private String nameEmployee;
    private String ageEmployee;
    private String addressEmployee;

    public Employee() {
    }

    public Employee(String nameEmployee, String ageEmployee, String addressEmployee) {
        this.nameEmployee = nameEmployee;
        this.ageEmployee = ageEmployee;
        this.addressEmployee = addressEmployee;
    }

    public String getNameEmployee() {
        return nameEmployee;
    }

    public void setNameEmployee(String nameEmployee) {
        this.nameEmployee = nameEmployee;
    }

    public String getAgeEmployee() {
        return ageEmployee;
    }

    public void setAgeEmployee(String ageEmployee) {
        this.ageEmployee = ageEmployee;
    }

    public String getAddressEmployee() {
        return addressEmployee;
    }

    public void setAddressEmployee(String addressEmployee) {
        this.addressEmployee = addressEmployee;
    }

    @Override
    public String toString() {
        return nameEmployee + ", " + ageEmployee + ", " + addressEmployee;
    }
}
