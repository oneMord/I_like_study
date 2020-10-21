package com.li.pojo;

public class Course {
    private String cId;

    private String cName;

    private String tId;

    public Course(String cId, String cName, String tId) {
        this.cId = cId;
        this.cName = cName;
        this.tId = tId;
    }

    public Course() {
        super();
    }

    public String getcId() {
        return cId;
    }

    public void setcId(String cId) {
        this.cId = cId == null ? null : cId.trim();
    }

    public String getcName() {
        return cName;
    }

    public void setcName(String cName) {
        this.cName = cName == null ? null : cName.trim();
    }

    public String gettId() {
        return tId;
    }

    public void settId(String tId) {
        this.tId = tId == null ? null : tId.trim();
    }
}