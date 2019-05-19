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

    public ArrayList<Student> getList()
    {
        return list;
    }

    public Student getStud()
    {
        return stud;
    }

    public void searchStudent(String ID)
    {
        // Vars initalization.
        found = false;
        int i = 0;
        int listSize = list.size();

        // Loop that keeps going until found or end of the list.
        while (!found && i < listSize)
        {
            //Student stud = list.get(i);
            Student studObjList = list.get(i);

            if (studObjList.getIDnumber().equalsIgnoreCase(ID))
            {
                stud = studObjList;
                found = true;
                index = i;
            } else
            {
                i++;
            }
        }
    }

    public boolean inList()
    {
        return found;
    }

    public int getIndex()
    {
        return index;
    }

    public Student drop(int i)
    {
        return list.remove(i);
    }

}
