package assignment1;

import java.util.Date;


public class Student {

    private Name name;
    private Address address;
    private Date date;
    private String IDnumber;
    //private String Courses;
    //private String[] courseArray = new String[5]; 

    public Student(Name name, Address address, Date date, String IDnumber/*, String Courses[]*/) {
        this.name = name;
        this.address = address;
        this.date = date;
        this.IDnumber = IDnumber;
        //this.courseArray = Courses;
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

  //  public String[] getCourseArray() {
       // return courseArray;
   // }
    

    public void addCourse() {  //---------------
        
    }

    public void dropCourse() { //---------------

    }

    @Override
    public String toString() {
        return "Student{" + "name=" + name + ", address=" + address + ", date=" + date + ", IDnumber=" + IDnumber/* + ", courseArray=" + courseArray + '}'*/;
    }
    
    
}
