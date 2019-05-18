package assignment1;

import java.util.Date;

public class Student
{

    // Data Fields.
    private Name name;
    private Address address;
    private Date date;
    private String IDnumber;
    private String[] courseArray = new String[5];

    // Constructor.
    public Student(Name name, Address address, Date date, String IDnumber, String Courses[])
    {
        this.name = name;
        this.address = address;
        this.date = date;
        this.IDnumber = IDnumber;
        this.courseArray = Courses;
    }

    // Getters.
    public Name getName()
    {
        return name;
    }

    public Address getAddress()
    {
        return address;
    }

    public Date getDate()
    {
        return date;
    }

    public String getIDnumber()
    {
        return IDnumber;
    }

    public String getCourseArray()
    {
        // Initializing vars.        
        String arrayCounter = "";
        int arraySize = courseArray.length;

        // Adding courses to the array.
        for (int i = 0; i < arraySize; i++)
        {
            // Not including the comma when it starts.               
            if (i == 0)
            {
                arrayCounter = arrayCounter + courseArray[i];
            } else if (courseArray[i] == "")
            {
                // Not including the comma when it is blank. 
            } else
            {
                arrayCounter = arrayCounter + ", " + courseArray[i];
            }
        }

        // Return the concatenation.
        return arrayCounter;
    }

    public int addCourse(String course)
    {
        // Going throught the Array.
        for (int i = 0; i < 5; i++)
        {
            // If it is space add the course.
            if (courseArray[i].isEmpty())
            {
                courseArray[i] = course;                
                return 0;
            }
        }

        // If it not added then not found message.       
        return 1;
    }

    public int dropCourse(String course)
    { 
        // Going throught the Array.
        for (int i = 0; i < 5; i++)
        {
            // If it is found drop the course.
            if (courseArray[i].equalsIgnoreCase(course))
            {
                courseArray[i] = "";
                return 0;
            }
        }

        // If it not found then not found message.        
        return 1;
    }

    public void setIDnumber(String IDnumber)
    {
        this.IDnumber = IDnumber;
    }

    

    
}
