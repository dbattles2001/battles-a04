package baseline;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

/*
 *  UCF COP3330 Fall 2021 Assignment 4 Solutions
 *  Copyright 2021 Dustin Battles
 */

public class Solution41 {
    public static void main(String[] args) throws FileNotFoundException {
        NameSorter d = new NameSorter();

        //scanner for input file
        Scanner input = new Scanner(new File("exercise41_input.txt"));

        //array of strings
        ArrayList<String> names = new ArrayList<String>();

        //call readNames
        d.readNames(input, names);

        Collections.sort(names, String.CASE_INSENSITIVE_ORDER);

        //close input file
        input.close();

        //catch io exception
        try{
            d.writeNames(names);
        }catch(Exception e){
            System.out.println(e);
        }
    }
}
