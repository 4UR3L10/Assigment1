package assignment1;

import java.util.Date;

public class Assignment1
{

    public static void main(String[] args)
    {
        Name name1 = new Name("Aurelio", "Martinez");
        Address address1 = new Address("9281 SW 221 ST", "Miami", "FL", "33190");
        Date date1 = new Date();
        String[] courseArray =
        {
            "COP3337", "ENC3245", "SEN8976", "", ""
        };

        Student stud1 = new Student(name1, address1, date1, "1001461532", courseArray);

        stud1.addCourse("ASS4050");
        stud1.addCourse("BOY4545");
        //stud1.dropCourse("ASS4050");
        // stud1.addCourse("CUL9090");

        System.out.println("The information added is:\n" + "Name: " + stud1.getName().getFirstName() + " " + stud1.getName().getLastName() + "\n"
                + "Address: " + stud1.getAddress().getStreet() + " " + stud1.getAddress().getCity() + " " + stud1.getAddress().getState() + " " + stud1.getAddress().getZip() + "\n"
                + "Date: " + stud1.getDate().toString() + "\n" + "ID: " + stud1.getIDnumber() + "\n" + "Courses: " + stud1.getCourseArray());

    }

}
