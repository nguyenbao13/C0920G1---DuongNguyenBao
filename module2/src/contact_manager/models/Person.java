package contact_manager.models;

public class Person {
    private int id;
    private String name;
    private String gender;
    private String group;
    private String phoneNumber;
    private String address;

    public Person() {
    }

    public Person(int id, String name, String gender, String group, String phoneNumber, String address) {
        this.id = id;
        this.name = name;
        this.gender = gender;
        this.group = group;
        this.phoneNumber = phoneNumber;
        this.address = address;
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

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getGroup() {
        return group;
    }

    public void setGroup(String group) {
        this.group = group;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", gender='" + gender + '\'' +
                ", group='" + group + '\'' +
                ", phoneNumber='" + phoneNumber + '\'' +
                ", address='" + address + '\'' +
                '}';
    }
    public String showInformation() {
        return id + ", " + name + ", " + gender + ", " + group + ", " + phoneNumber + ", " + address;
    }
}
