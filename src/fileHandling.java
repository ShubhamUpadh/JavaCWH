import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;

public class fileHandling {
    public static void main(String[] args) {
        File myFile = new File("fileHandling.txt");
//        try {
//            myFile.createNewFile();
//        }
//        catch (Exception e){
//            System.out.println(e);

//        try{
//            FileWriter fl = new FileWriter("fileHandling.txt");
//            fl.write("This is my first file");
//            fl.close();
//        }
//        catch (IOException e){
//            e.printStackTrace();
//        }
        File myFile2 = new File("fileHandling.txt");
        try {
            Scanner sc = new Scanner(myFile2);
            while (sc.hasNextLine()){
                String line = sc.nextLine();
                System.out.println(line);
            }
        }
        catch (IOException e){
            e.printStackTrace();
        }

    }
}
