package com.landregistrysystem.app.form;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * email:joablisa@gmail.com
 * name:joab lisa.
 */

public class EmployeForm {
    private int id;
    private String firstname;
    private String lastname;
    private String datecreated;
    private String email;
    private String phone;
    private String socialsecuritynumber;
    private int idnumber;
    private double salary;
    private String income;
    private String occupation;



    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getLastname() {
        return lastname;
    }

    public void setLastname(String lastname) {
        this.lastname = lastname;
    }

    public String getDatecreated() {
        SimpleDateFormat df=new SimpleDateFormat("dd-mm-YYYY");
        return datecreated=df.format(new Date());
    }

    public void setDatecreated(String datecreated) {
        this.datecreated = datecreated;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPhone() {
        return phone;
    }

    public void setPhone(String phone) {
        this.phone = phone;
    }

    public String getSocialsecuritynumber() {
        return socialsecuritynumber;
    }

    public void setSocialsecuritynumber(String socialsecuritynumber) {
        this.socialsecuritynumber = socialsecuritynumber;
    }

    public int getIdnumber() {
        return idnumber;
    }

    public void setIdnumber(int idnumber) {
        this.idnumber = idnumber;
    }

    public double getSalary() {
        if(salary<25000 ){
            income="low";
        }else if(salary>=55000){
            income="middle";
        }else if(salary>150000) {
            income="upper";
        }
        return salary;
    }

    public void setSalary(double salary) {

        this.salary = salary;
    }

    public String getIncome() {
        return income;
    }

    public void setIncome(String income) {
        this.income = income;
    }

    public String getOccupation() {
        return occupation;
    }

    public void setOccupation(String occupation) {
        this.occupation = occupation;
    }
}
