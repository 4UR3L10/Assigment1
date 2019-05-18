package assignment1;

import java.text.DateFormat;
import java.util.ArrayList;
import java.util.Date;
import javax.swing.JOptionPane;       
import javax.swing.JPanel; // ?
import javax.swing.JScrollPane;
import javax.swing.JTextArea;


public class Assignment1
{

    public static void main(String[] args)
    {
        // Var to control while loop.
        boolean keepLoop = true;
        
        // Creating a date object using right format.
        DateFormat dateFormat = DateFormat.getDateInstance(DateFormat.LONG);
        Date date = new Date();
        
        // Creating Admission object.
        Admissions admiss = new Admissions();   
        
        
       
                
        /*        
        stud1.addCourse("ASS4050");
        stud1.addCourse("BOY4545");
        //stud1.dropCourse("ASS4050");
        // stud1.addCourse("CUL9090");        
        */
        
        
        // Welcome message.
        JOptionPane.showMessageDialog(null, "Welcome to the admission software!" + "\nClick 'OK' to continue.");
        
        // While loop to keep the software working until user wants it.
        while (keepLoop)
        {
            // Info message.
            int choice = getData.getInt("\tAdmission Department\n" + dateFormat.format(date) + "\n" + 
                      "\nEnter a number:\n"
                    + "[1] Show Students\n"
                    + "[2] Add Student\n"
                    + "[3] Drop Student\n"
                    + "[4] Search Student\n"
                    + "[5] Add Course\n"
                    + "[6] Remove Course\n"
                    + "[7] Exit");
       
            switch (choice)
            {
                // Show Students.
                case 1:
                    // JOptionPane.showMessageDialog(null, "Not yet developed");
                    ArrayList list = admiss.getList();
                    
                    int i = 0;
                    int length = list.size();
                   
                    String studentString = "";
                    
                    while (i < length)
                    {
                     // Commenttttttttttttttttttttttttttttttttttttttttttttttttttttttttttttt
                     Student studTest = (Student)list.get(i);
                   
                      studentString = studentString + "Id number: " + studTest.getIDnumber() + "\nName: " + studTest.getName().getFirstName() + ", "
                      + studTest.getName().getLastName() + "\n"
                      + "Address: " + studTest.getAddress().getStreet() + ", " + studTest.getAddress().getCity() + ", "
                      + studTest.getAddress().getState() + " " + studTest.getAddress().getZip() + "\nDate: " + studTest.getDate()
                      + "\nCourses: " + studTest.getCourseArray() + "\n\n";
                      
                      //JOptionPane.showMessageDialog(null, studentString);
                      i++;                       
                    }
                    
                    //JOptionPane.showMessageDialog(null, studentString);
                     show(studentString, "Active Students", JOptionPane.INFORMATION_MESSAGE);
                    
                    
                    break;
                
                // Add Students.
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
                    admiss.add(stud);          
                    
                    break;
                
                // Drop Student.
                case 3:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                    
                // Search Student.    
                case 4:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                    
                // Add Course.    
                case 5:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                
                // Remove Course.    
                case 6:
                    JOptionPane.showMessageDialog(null, "Not yet developed");
                    break;
                  
                // Exit Program.    
                case 7:    
                    keepLoop = false;    
                    break;
                    
                default:
                    JOptionPane.showMessageDialog(null, "Enter a valid option");
            }
        }
    }
    
    static void show(String resultString, String heading, int MESSAGE_TYPE)
    {
        JTextArea textAreaObject = new JTextArea(resultString, 20, 30);
        JScrollPane scrollPaneObject = new JScrollPane(textAreaObject);
        JOptionPane.showMessageDialog(null, scrollPaneObject, heading, MESSAGE_TYPE);
    }

}
