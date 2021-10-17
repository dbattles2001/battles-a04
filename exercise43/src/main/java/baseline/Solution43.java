package baseline;

import java.util.Scanner;

public class Solution43 {
    public static void main(String[] args) {
        //initialize scanner and application
        Scanner input = new Scanner(System.in);
        WebsiteGenerator d = new WebsiteGenerator();

        //ask for name and author
        System.out.println("What is the name of the website?");
        String websiteName = input.next();

        System.out.println("What is the authors name?");
        String authorsName = input.next();

        //ask for css and javascript folder
        System.out.println("Would you like a folder for CSS? (y/n)");
        String css = input.next();

        System.out.println("Would you like a folder for JavaScript? (y/n)");
        String javascript = input.next();

        //call the websitegenerator
        System.out.println("Created " + d.createWebsite(websiteName));
        System.out.println("Created " + d.createHTML(websiteName, authorsName));

        //if they chose either of the optional ones
        if(css.equalsIgnoreCase("y")){
            System.out.println("Created " + d.createCSSFolder(websiteName));
        }
        if(javascript.equalsIgnoreCase("y")){
            System.out.println("Created " + d.createJavaScriptFolder(websiteName));
        }
    }
}
