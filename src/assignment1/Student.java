package assignment1;

import java.util.Date;



public class Student {
    // Data Fields.
    private Name name;
    private Address address;
    private Date date;
    private String IDnumber;
    //private String Courses;????????????????????
    private String[] courseArray = new String[5];
    
    
    
    
    
    // Constructor.
    public Student(Name name, Address address, Date date, String IDnumber, String Courses[]) {
        this.name = name;
        this.address = address;
        this.date = date;
        this.IDnumber = IDnumber;
        // this.courseArray = Courses;
        this.courseArray = Courses;
        
    }
    
    // Getters.
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
    
    
    // 
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
        
        //System.out.println(courseArray[4]);
        
        //for (int j = 0; j < 5; j++) {
        //        System.out.println(courseArray[j]);
        //}
        
        return arrayCounter;
    }
    

    public void addCourse(String course) {  //---------------
        // Get Size -> Check if there are no in use -> add it -> 
        //-> esle no espace
        int arraySize = courseArray.length;
        
//        if (arraySize == 5) {
//            System.out.println("Sorry the student has already the maximum of courses");
//        } else {
            for (int i = 0; i < 5; i++) {
                if (courseArray[i] == "") {
                    courseArray[i] = course; 
                    
                    i = 5;
                }
                
            }
//        }
    }

    public void dropCourse() { //---------------

    }
   
}
