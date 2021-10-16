package baseline;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;

public class WebsiteGenerator {
    //I need a "path" first
    String path = "src/main/java/baseline";
    String directory = "";

    //create a thing to make a folder opening and closing a directory
    public String createWebsite(String websiteName){
        directory = path + websiteName;
        File newFolder = new File(directory);

        newFolder.mkdirs();
        return directory;
    }

    //optional js and css folders
    public String createCSSFolder(String websiteName){
        directory = path + websiteName + "/css";
        return directory;
    }
    public String createJavaScriptFolder(String websiteName){
        directory = path + websiteName + "/js";
        return directory;
    }

    //function that creates the actual HTML
    public String createHTML(String websiteName, String author){
        directory = path + websiteName + "/index.html";

        String html = "<title>" + websiteName + "</title>\n<meta>" + author + "</meta>";

        File file = new File(directory);

        try{
            BufferedWriter writer = new BufferedWriter(new FileWriter(file));
            writer.write(html);
            writer.close();
            return directory;
        }catch(Exception e){
            return "Directory is messed up";
        }
    }
}
