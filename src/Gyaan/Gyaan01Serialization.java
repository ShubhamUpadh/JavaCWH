package Gyaan;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;

public class Gyaan01Serialization {
    public static void main(String[] args) {

        String fileName = "H:\\Java\\Java Course\\src\\Gyaan\\TestFile.txt";

        // Gyaan01StudentClass student = new Gyaan01StudentClass("Shubham", 18);
        // try{
        //     FileOutputStream fos = new FileOutputStream(fileName);
        //     ObjectOutputStream oos = new ObjectOutputStream(fos);
        //     oos.writeObject(student);
        //     oos.close();
        //     fos.close();
        // }
        // catch (FileNotFoundException e) {
        //     e.printStackTrace();
        // }
        // catch (IOException e){
        //     e.printStackTrace();
        // }
        // System.out.println("Done");

        
        // String fileName = "H:\\Java\\Java Course\\src\\Gyaan\\TestFile.txt";
        
        try{
            FileInputStream fis = new FileInputStream(fileName);
            ObjectInputStream ois = new ObjectInputStream(fis);
            Gyaan01StudentClass obj = (Gyaan01StudentClass)ois.readObject();
            System.out.println(obj);
            System.out.println(obj);
            ois.close();
            fis.close();
        }
        catch (Exception e){
            e.printStackTrace();
        }
    }    
}
