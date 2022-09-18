package model;

public class Patient {
    private String firstName;
    private String lastName;
    private int age;
    private String nationalCode;

    public Patient(String firstName, String lastName, int age, String nationalCode) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.age = age;
        this.nationalCode = nationalCode;
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
}
