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
                arrayCounter = arrayCounter + "," + courseArray[i];
            }
        }

        // Return the concatenation.
        return arrayCounter;
    }

    public void addCourse(String course)
    {
        // Going throught the Array.
        for (int i = 0; i < 5; i++)
        {
            // If it is space add the course.
            if (courseArray[i] == "")
            {
                courseArray[i] = course;
                return;
            }
        }

        // If it not added then not found message.
        System.out.println("*This student has all courses.*\n");
    }

    public void dropCourse(String course)
    { 
        // Going throught the Array.
        for (int i = 0; i < 5; i++)
        {
            // If it is found drop the course.
            if (courseArray[i] == course)
            {
                courseArray[i] = "";
                return;
            }
        }

        // If it not found then not found message.
        System.out.println("*The course was not found.*\n");
    }

}
