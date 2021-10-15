package baseline;

import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class NameSorter {

    //readNames(scanner and an array to hold the names)
    //a thing that scans next lines until next line is empty,
    //adding those names to the string array
    void readNames(Scanner input, ArrayList<String> names){
        while(input.hasNextLine()){
            names.add(input.nextLine());
        }
    }

    //writeNames(name array) throws ioexception
    //create a writer
    //for i to size of names print string[i]
    //close the file
    void writeNames(ArrayList<String> names) throws IOException{
        FileWriter output = new FileWriter("exercise41_output.txt");
        output.write("Total of " + names.size() + " names\n");
        output.write("----------\n");

        for(String i : names){
            output.write(i + "\n");
        }

        output.close();
    }
}


