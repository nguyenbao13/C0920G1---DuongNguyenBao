package validate_form_dang_ky.model;

import javax.validation.constraints.Min;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Pattern;
import javax.validation.constraints.Size;

public class User {
    @NotNull
    @Size(min = 5, max = 45)
    private String firstName;

    @NotNull
    @Size(min = 5, max = 45)
    private String lastName;

    @NotNull
    @Pattern(regexp = "^(0|\\+84)[1-9][0-9]{8}$")
    private String phoneNumber;

    @Min(18)
    private int age;

    @NotNull
    @Pattern(regexp = "^\\w+@\\w+(\\.\\w+)+$")
    private String email;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getPhoneNumber() {
        return phoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        this.phoneNumber = phoneNumber;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }
}
