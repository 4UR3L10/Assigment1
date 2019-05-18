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
        Admissions admiss = new Admissions();   // Database.
        
        String tempID = "";
        int tempChoice = 0;
       
                
        
        
        
        // Welcome message.
        JOptionPane.showMessageDialog(null, "Welcome to the admission software!" + "\nClick 'OK' to continue.");
        
        // While loop to keep the software working until user wants it.
        while (keepLoop)
        {
            // Info message.
            tempChoice = getData.getInt("\tAdmission Department\n" + dateFormat.format(date) + "\n" + 
                      "\nEnter a number:\n"
                    + "[1] Show Students\n"
                    + "[2] Add Student\n"
                    + "[3] Drop Student\n"
                    + "[4] Update Student Info\n"
                    + "[5] Add Course\n"
                    + "[6] Remove Course\n"
                    + "[7] Exit");
       
            switch (tempChoice)
            {
                // Show Students.  // implementationnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnnn
                case 1:
                    // Get the List from the class and store in this new list.
                    ArrayList list = admiss.getList();
                    
                    // Var declaration for the loop.
                    int i = 0;
                    int length = list.size();                   
                    String studentString = "";
                    
                    // Going as many times as the length of the list.
                    while (i < length)
                    {
                     // Create object student of the list.
                     Student studObjList = (Student)list.get(i);
                     
                     // Setting up the whole string of the student info.
                      studentString = studentString + "Id number: " + studObjList.getIDnumber() + "\nName: " + studObjList.getName().getFirstName() + ", "
                      + studObjList.getName().getLastName() + "\n"
                      + "Address: " + studObjList.getAddress().getStreet() + ", " + studObjList.getAddress().getCity() + ", "
                      + studObjList.getAddress().getState() + " " + studObjList.getAddress().getZip() + "\nDate: " + dateFormat.format(date)
                      + "\nCourses: " + studObjList.getCourseArray() + "\n\n";
                                            
                      i++;                       
                    }
                    
                    // Calling a method to display the info of the student in a scroll pane.
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
                    
                    // Getting the student ID.
                    tempID = getData.getWord("Enter the student ID:");
                    
                    // Creating the student object.
                    Student stud = new Student(name, address, date, tempID, courseArray);
                    
                    // Adding the student object to the arrayList.                    
                    admiss.add(stud);          
                    
                    break;
                
                // Drop Student.
                case 3:
                    // Getting the student ID.                    
                    tempID = getData.getWord("[Drop] Enter the student ID:");
                    
                    // Search ID on admission list.
                    admiss.searchStudent(tempID);
                    
                    // If was not in the list then not found.
                    if (!admiss.inList())
                    {
                        JOptionPane.showMessageDialog(null, "Student not found.");
                    }
                    else 
                    {
                        // If student was found drop the student and display feedback.
                        Student studentObj = admiss.getStud();
                        int index = admiss.getIndex();
                        admiss.drop(index);
                        JOptionPane.showMessageDialog(null, "The student [" + tempID + "] ("+ admiss.getStud().getName().getFirstName() + " " + admiss.getStud().getName().getLastName() + ") have been dropped.");
                    }
                    
                    break;
                    
                // Update Student Info.    
                case 4:
                    // JOptionPane.showMessageDialog(null, "Not yet developed");

                    // Getting the student ID.
                    tempID = getData.getWord("[Search] Enter the student ID:");

                    // Search ID on admission list.
                    admiss.searchStudent(tempID);

                    // If was not in the list then not found.
                    if (!admiss.inList())
                    {
                        JOptionPane.showMessageDialog(null, "Student not found.");
                    } 
                    else
                    {
                        // Display Menu options and getting input.
                        tempChoice = getData.getInt("Select the information that you want to update:\n [1] ID number \n [2] Name \n [3] Address");
                        
                       
                        switch (tempChoice)
                        {
                            // ID.
                            case 1:
                                // Getting the NEW student ID.
                                tempID = getData.getWord("Enter the new student ID:");

                                // Change the student ID and display feedback.
                                Student studentObj = admiss.getStud();
                                int index = admiss.getIndex();
                                studentObj.setIDnumber(tempID);
                                JOptionPane.showMessageDialog(null, "The new student ID " + tempID + " was added succesfully.");

                                break;
                                
                            // Name.
                            case 2:
                                // Display menu and getting input.
                                tempChoice = getData.getInt("Select the information that you want to update:\n [1] Full name \n [2] Firstname \n [3] Lastname");
                                
                                switch (tempChoice)
                                {
                                    // Fullname.
                                    case 1:
                                        // Geeting data.
                                        studentObj = admiss.getStud();
                                        index = admiss.getIndex();
                                        
                                        // Getting and setting the NEW student Fullname.
                                        tempID = getData.getWord("Enter the new student firstname:");
                                        studentObj.getName().setFirstName(tempID);
                                        tempID = getData.getWord("Enter the new student lastname:");
                                        studentObj.getName().setLastName(tempID);
                                        
                                        // Display feedback.                                     
                                        JOptionPane.showMessageDialog(null, "The new student fullname " + (tempID = studentObj.getName().getFirstName() + ", " + studentObj.getName().getLastName())  + " was added succesfully.");
                                        
                                        break;
                                        
                                    // First name.   
                                    case 2:
                                        // Geeting data.
                                        studentObj = admiss.getStud();
                                        index = admiss.getIndex();
                                        
                                        // Getting and setting the NEW student firstname.
                                        tempID = getData.getWord("Enter the new student firstname:");
                                        studentObj.getName().setFirstName(tempID);
                                      
                                        // Display feedback.                                     
                                        JOptionPane.showMessageDialog(null, "The new student fistname " + (tempID = studentObj.getName().getFirstName()) + " was added succesfully.");
                                        
                                        break;
                                        
                                    // Last name.  
                                    case 3:
                                        // Geeting data.
                                        studentObj = admiss.getStud();
                                        index = admiss.getIndex();

                                        // Getting and setting the NEW student Lastname.
                                        tempID = getData.getWord("Enter the new student lastname:");
                                        studentObj.getName().setLastName(tempID);

                                        // Display feedback.                                     
                                        JOptionPane.showMessageDialog(null, "The new student lastname " + (tempID = studentObj.getName().getLastName()) + " was added succesfully.");

                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Enter a valid option");    
                                }
                                break;
                             
                            // Address.    
                            case 3:
                                // Display menu and getting input.
                                tempChoice = getData.getInt("Select the information that you want to update:\n [1] Full address \n [2] Street \n [3] City \n [4] State \n [5] ZipCode");

                                switch (tempChoice)
                                {
                                    // Full address.
                                    case 1:
                                        // Geeting data.
                                        studentObj = admiss.getStud();
                                        index = admiss.getIndex();

                                        // Getting and setting the NEW student Full address.
                                        tempID = getData.getWord("Enter the new student street:");
                                        studentObj.getAddress().setStreet(tempID);
                                        tempID = getData.getWord("Enter the new student city:");
                                        studentObj.getAddress().setCity(tempID);
                                        tempID = getData.getWord("Enter the new student state:");
                                        studentObj.getAddress().setState(tempID);
                                        tempID = getData.getWord("Enter the new student zip code:");
                                        studentObj.getAddress().setZip(tempID);

                                        // Display feedback.                                     
                                        JOptionPane.showMessageDialog(null, "The new student address " + (tempID = studentObj.getAddress().getStreet() + ", " + studentObj.getAddress().getCity() + ", " + studentObj.getAddress().getState() + " " + studentObj.getAddress().getZip()) + " was added succesfully.");

                                        break;

                                    // Street.   
                                    case 2:
                                        // Geeting data.
                                        studentObj = admiss.getStud();
                                        index = admiss.getIndex();

                                        // Getting and setting the NEW student street.
                                        tempID = getData.getWord("Enter the new student street:");
                                        studentObj.getAddress().setStreet(tempID);
                                        
                                        // Display feedback.                                     
                                        JOptionPane.showMessageDialog(null, "The new student street " + (tempID = studentObj.getAddress().getStreet()) + " was added succesfully.");

                                        break;

                                    // City.  
                                    case 3:
                                       // Geeting data.
                                        studentObj = admiss.getStud();
                                        index = admiss.getIndex();

                                        // Getting and setting the NEW student city.                                        
                                        tempID = getData.getWord("Enter the new student city:");
                                        studentObj.getAddress().setCity(tempID);                                        

                                        // Display feedback.                                     
                                        JOptionPane.showMessageDialog(null, "The new student city " + (tempID = studentObj.getAddress().getCity()) + " was added succesfully.");

                                        break;
                                        
                                    // State.  
                                    case 4:
                                       // Geeting data.
                                        studentObj = admiss.getStud();
                                        index = admiss.getIndex();

                                        // Getting and setting the NEW student state.                                        
                                        tempID = getData.getWord("Enter the new student state:");
                                        studentObj.getAddress().setState(tempID);                                        

                                        // Display feedback.                                     
                                        JOptionPane.showMessageDialog(null, "The new student state " + (tempID = studentObj.getAddress().getState()) + " was added succesfully.");

                                        break;   
                                        
                                    // Zip code.  
                                    case 5:
                                       // Geeting data.
                                        studentObj = admiss.getStud();
                                        index = admiss.getIndex();

                                        // Getting and setting the NEW student state.                                        
                                        tempID = getData.getWord("Enter the new student zip code:");
                                        studentObj.getAddress().setZip(tempID);                                        

                                        // Display feedback.                                     
                                        JOptionPane.showMessageDialog(null, "The new student zip code " + (tempID = studentObj.getAddress().getZip()) + " was added succesfully.");

                                        break;

                                    default:
                                        JOptionPane.showMessageDialog(null, "Enter a valid option");
                                }

                            //default:
                              //  JOptionPane.showMessageDialog(null, "Enter a valid option");

                        }
                        break;
                    }
                    
                // Add Course.    
                case 5:                                       
                    // Getting the student ID.
                    tempID = getData.getWord("[Search] Enter the student ID:");
                    
                    // Search ID on admission list.
                    admiss.searchStudent(tempID);
                    
                    // Getting name of the ocurse.
                    String newCourse = getData.getWord("Enter the course:");
                    
                    // If was not in the list then not found.
                    if (!admiss.inList())
                    {
                        JOptionPane.showMessageDialog(null, "Student not found.");
                    }
                    else 
                    {
                        // If student was found try to add course to the student and display feedback.
                        Student studentObj = admiss.getStud();
                        int index = admiss.getIndex();
                        
                        // If there is space in the course array add the course.
                        if (admiss.getStud().addCourse(newCourse) == 0)
                        {
                            JOptionPane.showMessageDialog(null, "The course " + newCourse + "  have been added to student [" + tempID + "] (" + admiss.getStud().getName().getFirstName() + " " + admiss.getStud().getName().getLastName() + ").");
                            JOptionPane.showMessageDialog(null, admiss.getStud().getCourseArray());
                        }
                        else // If there is no space in the course array display feedback that it could not be added.
                        {
                            JOptionPane.showMessageDialog(null, "Course " + newCourse + " was not added\n This student has all courses.");
                        }                        
                    }
                    break;
                
                // Remove Course.    
                case 6:
                    // Getting the student ID.
                    tempID = getData.getWord("[Search] Enter the student ID:");
                    
                    // Search ID on admission list.
                    admiss.searchStudent(tempID);
                    
                    // Getting name of the ocurse.
                    String course = getData.getWord("Enter the course:");
                    
                    // If was not in the list then not found.
                    if (!admiss.inList())
                    {
                        JOptionPane.showMessageDialog(null, "Student not found.");
                    }
                    else 
                    {
                        // If student was found try to drop the course for the student and display feedback.
                        Student studentObj = admiss.getStud();
                        int index = admiss.getIndex();
                        
                        // If there is space in the course array add the course.
                        if (admiss.getStud().dropCourse(course) == 0)
                        {
                            JOptionPane.showMessageDialog(null, "The course " + course + "  have been dropped for student [" + tempID + "] (" + admiss.getStud().getName().getFirstName() + " " + admiss.getStud().getName().getLastName() + ").");
                            JOptionPane.showMessageDialog(null, admiss.getStud().getCourseArray());
                        }
                        else // If there is no space in the course array display feedback that it could not be added.
                        {
                            JOptionPane.showMessageDialog(null, "Course " + course + " was not dropped\n This student is not taking this course.");
                        }                        
                    }
                    
                    
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
        JTextArea textAreaObject = new JTextArea(resultString, 20, 50);
        JScrollPane scrollPaneObject = new JScrollPane(textAreaObject);
        JOptionPane.showMessageDialog(null, scrollPaneObject, heading, MESSAGE_TYPE);
    }

}
