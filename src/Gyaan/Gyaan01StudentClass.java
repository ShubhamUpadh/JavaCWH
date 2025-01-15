package Gyaan;

import java.io.Serializable;

public class Gyaan01StudentClass implements Serializable{
    String name;
    int rollno;
    public Gyaan01StudentClass(String name, int rollno){
        this.name = name;
        this.rollno = rollno;
    }
    @Override
    public String toString(){
        return "Student's name = " + name + ", Roll No = " + rollno;
    }
    
}
