package baseline;

import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Scanner;

public class Solution45 {
    public static void main(String[] args) throws IOException {
        Scanner input = new Scanner(System.in);

        System.out.println("What's the name of the output file?");
        String name = input.next();

        fileThing d = new fileThing();

        ArrayList<String> list = d.readFile();

        d.writeFile(name, list);
    }
}
