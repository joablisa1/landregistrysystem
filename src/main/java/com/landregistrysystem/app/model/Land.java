package com.landregistrysystem.app.model;
/**
 * email:joablisa@gmail.com
 * name:joab lisa.
 */

public class Land {
    private int id;
    private int regid;
    private String location;
    private String size;
    private String landusage;


    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getRegid() {
        return regid;
    }

    public void setRegid(int regid) {
        this.regid = regid;
    }

    public String getLocation() {
        return location;
    }

    public void setLocation(String location) {
        this.location = location;
    }

    public String getSize() {
        return size;
    }

    public void setSize(String size) {
        this.size = size;
    }

    public String getLandusage() {
        return landusage;
    }

    public void setLandusage(String landusage) {
        this.landusage = landusage;
    }
}
