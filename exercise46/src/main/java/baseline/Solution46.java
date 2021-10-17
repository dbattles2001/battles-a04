package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Map;
import java.util.Scanner;
import java.util.TreeMap;

public class Solution46 {
    public static void main(String[] args) throws FileNotFoundException {
        //create a scanner for the file

        //for each time a word appears in the file save it to the list

        //if the word duplicates add ++ to that word otherwise add it to the list

        Scanner file=new Scanner(new File("exercise46_input.txt"));
        Map<String,Integer> hm=new TreeMap<>();

        // read values from file and add them into map
        while(file.hasNext()) {
            String str=file.next();
            if(hm.containsKey(str))
                hm.put(str,hm.get(str)+1);
            else
                hm.put(str,1);
        }

        // print the histogram
        for(String key:hm.keySet()) {
            System.out.printf("%-10s",key+":");
            for(int i=hm.get(key);i>0;i--)
                System.out.print("*");
            System.out.println();
        }
    }
}
