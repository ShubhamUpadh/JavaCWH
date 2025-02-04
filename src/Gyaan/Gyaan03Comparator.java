package Gyaan;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student{
    String name;
    int age;

    public Student(int age, String name){
        this.age = age;
        this.name = name;
    }

    @Override
    public String toString(){
        return "name = " + name + ", age = " + age +"\n";
    }
}

public class Gyaan03Comparator {
    public static void main(String[] args) {
        List<Student> ls = new ArrayList<>();

        ls.add(new Student(21, "Shubh"));
        ls.add(new Student(35, "Shikhar"));
        ls.add(new Student(12, "Sanjay"));
        ls.add(new Student(60, "Seema"));
        

        Comparator<Student> comp = new Comparator<>() {
            @Override
            public int compare(Student a, Student b){
                if (a.name.length() != b.name.length()) return (a.name.length() > b.name.length()) ? 1 : - 1;
                else return (a.age > b.age) ? 1 : -1;
            }
        };
        Collections.sort(ls, comp);

        System.out.println(ls);
    }
}
