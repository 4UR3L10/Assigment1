package assignment1;

import java.util.Date;
import java.util.Set;

public class Student {

    private Name name;
    private Address address;
    private Date date;
    private String IDnumber;
    //private String Courses;
    Set<String> courses = new courses<String>();// Array

    public Student(Name name, Address address, Date date, String IDnumber, String Courses) {
        this.name = name;
        this.address = address;
        this.date = date;
        this.IDnumber = IDnumber;
        this.Courses = Courses;
    }

    public Name getName() {
        return name;
    }

    public Address getAddress() {
        return address;
    }

    public Date getDate() {
        return date;
    }

    public String getIDnumber() {
        return IDnumber;
    }

    public String getCourses() { //-------------
        return Courses;
    }

    public void addCourse() {  //---------------

    }

    public void dropCourse() { //---------------

    }
}
