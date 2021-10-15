package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Employee {

    //void writeNames(filename)
    void writeNames(){
        //try and open the file with a scanner
        try{
            File file = new File("exercise42_input.txt");
            Scanner input = new Scanner(file);

            //while hasnextline
            while(input.hasNextLine()){
                //String temp = nextLine
                //split temp by "," saving to a string array size 3 for fn ln salary
                //print

                String temp = input.nextLine();
                String[] bigTemp = temp.split(",");
                System.out.printf("%-17s%-17s%-17s%n", bigTemp[0], bigTemp[1], bigTemp[2]);
            }
        }catch(FileNotFoundException e){
            System.out.println(e);
        }
    }
}
