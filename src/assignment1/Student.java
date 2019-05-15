package assignment1;

import java.util.Date;


public class Student {

    private Name name;
    private Address address;
    private Date date;
    private String IDnumber;
    //private String Courses;
    private String[] courseArray = new String[5]; 

    public Student(Name name, Address address, Date date, String IDnumber, String Courses[]) {
        this.name = name;
        this.address = address;
        this.date = date;
        this.IDnumber = IDnumber;
        this.courseArray = Courses;
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

    public String getCourseArray() {
        // return courseArray;
        
        String arrayCounter = "";
        int arraySize = courseArray.length;
        
        
        for (int i = 0; i < arraySize; i++) {
            
            if(i == arraySize - 1) {
               arrayCounter = arrayCounter + courseArray[i];
            }
            else {
                arrayCounter = arrayCounter + courseArray[i] + ",";
            }
            // 0 1 2 
            
            
        }
        
        arrayCounter = arrayCounter + ".";  
        
        
        return arrayCounter;
    }
    

    public void addCourse() {  //---------------
        
    }

    public void dropCourse() { //---------------

    }
   
}
