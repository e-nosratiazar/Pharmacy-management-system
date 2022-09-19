package model;

import model.enums.UserType;

import java.util.Date;
import java.util.List;

public class Prescription {
    private String doctorFirstName;
    private String doctorLastName;
    private Date date;
    private User patient; //todo:mikham begam user inja az type patiente vali nemidoonam chejoori |:
    private List<Medicine> medicines;
    private double totalPrice;

    public Prescription(String doctorFirstName, String doctorLastName, Date date, User patient, List<Medicine> medicines) {
        this.doctorFirstName = doctorFirstName;
        this.doctorLastName = doctorLastName;
        this.date = date;
        this.patient = patient;
        this.medicines = medicines;
    }

    public String getDoctorFirstName() {
        return doctorFirstName;
    }

    public void setDoctorFirstName(String doctorFirstName) {
        this.doctorFirstName = doctorFirstName;
    }

    public String getDoctorLastName() {
        return doctorLastName;
    }

    public void setDoctorLastName(String doctorLastName) {
        this.doctorLastName = doctorLastName;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public User getPatient() {
        return patient;
    }

    public void setPatient(User patient) {
        patient.setUserType(UserType.PATIENT);
        this.patient = patient;
    }

    public List<Medicine> getMedicines() {
        return medicines;
    }

    public void setMedicines(List<Medicine> medicines) {
        this.medicines = medicines;
    }

    public double getTotalPrice() {
        return totalPrice;
    }

    public void setTotalPrice(double totalPrice) {
        this.totalPrice = totalPrice;
    }
}
