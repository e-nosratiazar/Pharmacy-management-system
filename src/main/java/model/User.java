package model;

import model.enums.UserType;

public class User {
    private String firstName;
    private String lastName;
    private int age;
    private String nationalCode;
    private String userName;
    private String password;
    private UserType userType;

    public User(String firstName, String lastName, int age, String nationalCode, String userName, String password) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationalCode = nationalCode;
        this.userName = userName;
        this.password = password;
    }

    public User(String firstName, String lastName, int age, String nationalCode, String userName, String password, UserType userType) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationalCode = nationalCode;
        this.userName = userName;
        this.password = password;
        this.userType = userType;
    }

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

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getNationalCode() {
        return nationalCode;
    }

    public void setNationalCode(String nationalCode) {
        this.nationalCode = nationalCode;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public UserType getUserType() {
        return userType;
    }

    public void setUserType(UserType userType) {
        this.userType = userType;
    }
}
