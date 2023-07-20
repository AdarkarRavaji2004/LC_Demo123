package com.example.LC_Demo.Entity;

import jakarta.persistence.*;

@Entity
public class Admission
{
    @Id
    @SequenceGenerator(name = "admission_seq")
    @GeneratedValue(strategy = GenerationType.SEQUENCE,generator = "admission_seq")
    Integer id;
    String stuclass;
    String fname;
    String mname;
    String lname;
    String motherName;
    String dob;
    String lastschoolName;
    String emailid;
    String mobileno;
    String country;
    String state;
    String district;
    String taluka;
    String pincode;
    String gender;
    String extension;
    String hobbies;
    String currentadderss;
    String pnumber;
    String status;

    public Admission() {
    }

    public Admission(String stuclass, String fname, String mname, String lname, String motherName, String dob, String lastschoolName, String emailid, String mobileno, String country, String state, String district, String taluka, String pincode, String gender, String extension, String hobbies, String currentadderss, String pnumber, String status) {
        this.stuclass = stuclass;
        this.fname = fname;
        this.mname = mname;
        this.lname = lname;
        this.motherName = motherName;
        this.dob = dob;
        this.lastschoolName = lastschoolName;
        this.emailid = emailid;
        this.mobileno = mobileno;
        this.country = country;
        this.state = state;
        this.district = district;
        this.taluka = taluka;
        this.pincode = pincode;
        this.gender = gender;
        this.extension = extension;
        this.hobbies = hobbies;
        this.currentadderss = currentadderss;
        this.pnumber = pnumber;
        this.status = status;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getStuclass() {
        return stuclass;
    }

    public void setStuclass(String stuclass) {
        this.stuclass = stuclass;
    }

    public String getFname() {
        return fname;
    }

    public void setFname(String fname) {
        this.fname = fname;
    }

    public String getMname() {
        return mname;
    }

    public void setMname(String mname) {
        this.mname = mname;
    }

    public String getLname() {
        return lname;
    }

    public void setLname(String lname) {
        this.lname = lname;
    }

    public String getMotherName() {
        return motherName;
    }

    public void setMotherName(String motherName) {
        this.motherName = motherName;
    }

    public String getDob() {
        return dob;
    }

    public void setDob(String dob) {
        this.dob = dob;
    }

    public String getLastschoolName() {
        return lastschoolName;
    }

    public void setLastschoolName(String lastschoolName) {
        this.lastschoolName = lastschoolName;
    }

    public String getEmailid() {
        return emailid;
    }

    public void setEmailid(String emailid) {
        this.emailid = emailid;
    }

    public String getMobileno() {
        return mobileno;
    }

    public void setMobileno(String mobileno) {
        this.mobileno = mobileno;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public String getState() {
        return state;
    }

    public void setState(String state) {
        this.state = state;
    }

    public String getDistrict() {
        return district;
    }

    public void setDistrict(String district) {
        this.district = district;
    }

    public String getTaluka() {
        return taluka;
    }

    public void setTaluka(String taluka) {
        this.taluka = taluka;
    }

    public String getPincode() {
        return pincode;
    }

    public void setPincode(String pincode) {
        this.pincode = pincode;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getExtension() {
        return extension;
    }

    public void setExtension(String extension) {
        this.extension = extension;
    }

    public String getHobbies() {
        return hobbies;
    }

    public void setHobbies(String hobbies) {
        this.hobbies = hobbies;
    }

    public String getCurrentadderss() {
        return currentadderss;
    }

    public void setCurrentadderss(String currentadderss) {
        this.currentadderss = currentadderss;
    }

    public String getPnumber() {
        return pnumber;
    }

    public void setPnumber(String pnumber) {
        this.pnumber = pnumber;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String toString() {
        return "Admission{" +
                "id=" + id +
                ", stuclass='" + stuclass + '\'' +
                ", fname='" + fname + '\'' +
                ", mname='" + mname + '\'' +
                ", lname='" + lname + '\'' +
                ", motherName='" + motherName + '\'' +
                ", dob='" + dob + '\'' +
                ", lastschoolName='" + lastschoolName + '\'' +
                ", emailid='" + emailid + '\'' +
                ", mobileno='" + mobileno + '\'' +
                ", country='" + country + '\'' +
                ", state='" + state + '\'' +
                ", district='" + district + '\'' +
                ", taluka='" + taluka + '\'' +
                ", pincode='" + pincode + '\'' +
                ", gender='" + gender + '\'' +
                ", extension='" + extension + '\'' +
                ", hobbies='" + hobbies + '\'' +
                ", currentadderss='" + currentadderss + '\'' +
                ", pnumber='" + pnumber + '\'' +
                ", status='" + status + '\'' +
                '}';
    }
}
