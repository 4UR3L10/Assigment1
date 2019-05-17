package assignment1;

import java.text.DateFormat;
import java.util.Date;
import javax.swing.JOptionPane;       // Testtttttttttttttttttttttttttttttt

public class Assignment1
{

    public static void main(String[] args)
    {
        boolean keepLoop = true;
        // Creating a date object.
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        Date date = new Date();
        
        
        /*
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
        */
        
        
        /* WORKINGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG
        // Creating an Student.
        // Creating a name object.
        String firstName = getData.getWord("Enter First Name:");
        String lastName = getData.getWord("Enter Last Name:");
        Name name = new Name(firstName, lastName);
        
        // Creating an address object.
        String street = getData.getWord("Enter your street:");
        String city = getData.getWord("Enter your city:");
        String state = getData.getWord("Enter your state:");
        String zipCode = getData.getWord("Enter your zip code:");
        Address address = new Address(street, city, state, zipCode);
        
        // Creating a date object.
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        Date date = new Date();
        
        // Creating the courses.      Implementationnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn   ADDDDDDDD DROPPPPPPPPP
        String courseOne = getData.getWord("Enter course one:");
        String courseTwo = getData.getWord("Enter course two:");
        String courseThird = getData.getWord("Enter course third:");
        String courseFourth = getData.getWord("Enter course fourth:");
        String courseFive = getData.getWord("Enter course five:");
        String[] courseArray = {courseOne, courseTwo, courseThird, courseFourth, courseFive};
        
        
        
        
        
        
        
       // Testttttttttttttttttttttttttttttttttttttttttttttttttttt
        // Creating the studentID
        String studID = getData.getWord("Enter the student ID:");
        // Creating the student.        
        Student stud = new Student(name, address, date, studID, courseArray);
        // Output in a panel
        JOptionPane.showMessageDialog(null,  
                  "Id number: " + stud.getIDnumber() + "\n" 
                + "Name: \t" + stud.getName().getFirstName() + ", " + stud.getName().getLastName() + "\n"
                + "Address: \t" + stud.getAddress().getStreet() + ", " + stud.getAddress().getCity() + ", " + stud.getAddress().getState() + " " + stud.getAddress().getZip() + "\n"
                + "Date: \t" + dateFormat.format(date) + "\n" 
                + "Courses: \t" + stud.getCourseArray());
        
        // 
        Admissions admiss = new Admissions();
        admiss.add(stud);
        
        JOptionPane.showMessageDialog(null, admiss);
        WORKINGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGGG*/
        
        JOptionPane.showMessageDialog(null, "Welcome to the admission software!" + "\nClick 'OK' to continue.");
        
        while (keepLoop)
        {
            int choice = getData.getInt("\tAdmission Department\n" + dateFormat.format(date) + "\n" + "\nEnter a number:" + 
                    "\n[1] Show Students\n[2] Add Student\n[3] Drop Student\n[4] Search Student\n[5] Add Course\n[6] Remove Course\n[7] Exit"); 
                    
            switch (choice)
            {
                case 1:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                    
                case 2:
                    // Creating an Student.
                    
                    // Creating a name object.
                    String firstName = getData.getWord("Enter First Name:");
                    String lastName = getData.getWord("Enter Last Name:");
                    Name name = new Name(firstName, lastName);
                    
                    // Creating an address object.
                    String street = getData.getWord("Enter your street:");
                    String city = getData.getWord("Enter your city:");
                    String state = getData.getWord("Enter your state:");
                    String zipCode = getData.getWord("Enter your zip code:");
                    Address address = new Address(street, city, state, zipCode);
                    
                    // Creating the courses.      Implementationnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn   ADDDDDDDD DROPPPPPPPPP
                    String courseOne = getData.getWord("Enter course one:");
                    String courseTwo = getData.getWord("Enter course two:");
                    String courseThird = getData.getWord("Enter course third:");
                    String courseFourth = getData.getWord("Enter course fourth:");
                    String courseFive = getData.getWord("Enter course five:");
                    String[] courseArray = {courseOne, courseTwo, courseThird, courseFourth, courseFive};
                    
                    // Creating the studentID object.
                    String studID = getData.getWord("Enter the student ID:");
                    
                    // Creating the student object.        
                    Student stud = new Student(name, address, date, studID, courseArray);
                    
                    // Adding the student object to the arrayList.
                    Admissions admiss = new Admissions();
                    admiss.add(stud);
                    JOptionPane.showMessageDialog(null, admiss.getList());                                        
                    break;
                
                case 3:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                    
                case 4:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                    
                case 5:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                    
                case 6:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                  
                case 7:    
                    keepLoop = false;    
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid option");
            }
        }
        
       
    }

}
