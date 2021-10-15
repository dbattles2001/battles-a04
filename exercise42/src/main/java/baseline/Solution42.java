package baseline;

import java.io.FileNotFoundException;

public class Solution42 {
    //main throws file not found exception
    public static void main(String[] args) throws FileNotFoundException {
        //employee d = new employee

        //scanner input = from the file
        //scratch this ^ i dont need a scanner in main

        Employee d = new Employee();

        //"last name first name salary"
        //d.writeNames

        System.out.printf("%-17s%-17s%-17s%n", "Last Name", "First Name", "Salary");
        System.out.println("----------------------------------------");
        d.writeNames();
    }
}
