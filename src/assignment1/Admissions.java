package assignment1;

import java.util.ArrayList;

public class Admissions
{
    private ArrayList<Student> list;
    private Student stud;
    private int index;
    private boolean found;

    public Admissions()
    {
        list = new ArrayList<Student>();
    }
    
    public void add(Student std)
    {
        list.add(std);
    }
    
    
}
