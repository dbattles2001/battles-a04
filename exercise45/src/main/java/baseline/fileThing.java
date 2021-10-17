package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Scanner;

public class fileThing {

    //create an array of strings

    ArrayList<String> list = new ArrayList<>();

    public ArrayList<String> readFile() throws FileNotFoundException{
        //scan in the file
        File file = new File("C:\\Users\\dbatt\\IdeaProjects\\assignment04\\exercise45\\exercise45_input.txt");
        Scanner input = new Scanner(file);

        //try and read each one in to elements in the string array until there is no nextLine()
        //finally close the file

        try{
            while(input.hasNextLine()){
                String reader = input.nextLine();
                list.add(reader);
            }
        }finally{
            input.close();
        }

        //return the array
        return list;
    }

    public void writeFile(String name, ArrayList<String> list) throws IOException{
        //open up a writer
        FileWriter writer = new FileWriter("C:\\Users\\dbatt\\IdeaProjects\\assignment04\\exercise45\\exercise45_input.txt");

        //for the number of strings its stored
        //each time it sees utilize, replace it with use
        for(int i = 0; i<list.size(); i++){
            String temp = list.get(i);
            if(temp.equalsIgnoreCase("utilize")){
                temp = "use";
                writer.write(temp + " ");
            }
        }
        writer.write("\n");

        //close the writer
        writer.close();
    }
}
