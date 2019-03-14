package com.landregistrysystem.app.model;

import java.text.SimpleDateFormat;
import java.util.Date;

/**
 * email:joablisa@gmail.com
 * name:joab lisa.
 */

public class Residence {
    private int id;
    private String residencename;
    private String residenceaddress;
    private String regnumber;
    private String daycreated;
    private int age=0;
    private String category;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getResidencename() {
        return residencename;
    }

    public void setResidencename(String residencename) {
        this.residencename = residencename;
    }

    public String getResidenceaddress() {
        return residenceaddress;
    }

    public void setResidenceaddress(String residenceaddress) {
        this.residenceaddress = residenceaddress;
    }

    public String getRegnumber() {
        return regnumber;
    }

    public void setRegnumber(String regnumber) {
        this.regnumber = regnumber;
    }

    public String getDaycreated() {
        SimpleDateFormat df=new SimpleDateFormat("dd-mm-YYYY");
        return daycreated=df.format(new Date());
    }

    public void setDaycreated(String daycreated) {
        this.daycreated = daycreated;
    }

    public int getAge() {
        if(age<12 ){
            category="child" ;
        }else if (age>=13) {
            category="Youth";
        } else if(age>=18){
            category="Adult";
        }
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }
}
