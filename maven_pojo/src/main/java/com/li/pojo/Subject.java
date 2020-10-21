package com.li.pojo;

public class Subject {
    private Integer subjectid;

    private String subjectname;

    private Integer subjecthours;

    public Subject(Integer subjectid, String subjectname, Integer subjecthours) {
        this.subjectid = subjectid;
        this.subjectname = subjectname;
        this.subjecthours = subjecthours;
    }

    public Subject() {
        super();
    }

    public Integer getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(Integer subjectid) {
        this.subjectid = subjectid;
    }

    public String getSubjectname() {
        return subjectname;
    }

    public void setSubjectname(String subjectname) {
        this.subjectname = subjectname == null ? null : subjectname.trim();
    }

    public Integer getSubjecthours() {
        return subjecthours;
    }

    public void setSubjecthours(Integer subjecthours) {
        this.subjecthours = subjecthours;
    }
}