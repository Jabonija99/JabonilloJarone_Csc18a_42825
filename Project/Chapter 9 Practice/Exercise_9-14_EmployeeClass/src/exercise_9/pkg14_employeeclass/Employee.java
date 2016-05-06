
package exercise_9.pkg14_employeeclass;

public class Employee {
    private final String eFName; //Employee First Name
    private final String eLName; //Employee Last Name
    private final String eSSN; //Employee Social Security Number
   
    //Constructor (firstname, lastname, social number)
    Employee(String fName, String lName, String ssn){
        eFName = fName; //Assigns first name
        eLName = lName; //Assigns last name
        eSSN = ssn; //Assigns social number
    }
    
    public String getFName(){
        return eFName; //Returns first name
    }
    
    public String getLName(){
        return eLName; //Returns last name
    }
    
    public String getSSN(){
        return eSSN; //Returns social security number
    }
    
    @Override
    public String toString(){
        return String.format("%s: %s\n %s: %s\n %s: %s\n", "First Name:",
                getFName(), "Last Name:", getLName(), "SSN:", getSSN());
    }
}
