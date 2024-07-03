package com.ass4.ass4;
//import com.ass4.ass4.Student;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;

public class StudentManagement implements Serializable{
    public static void main(String[] args) {
        List<Student> student = new ArrayList<>();
        student.add(new Student(1,"Sujay","Java",9.8));
        student.add(new Student(2,"Vijay","Java",8.8));
        student.add(new Student(3,"Raj","DBT",7.5));
        student.add(new Student(4,"Rahul","Java",9.5));

        serializeStudents(student);
        //student.add(new Student("A", "B", 1, 1, 1,);
        //Student student = new Student();
        //student.getName();
        //student.getDoB();
        //student.getRollNo();
        //student.getGpa();
        //student.getSubject();
        //Retrieve the student details
    }

    //Serialization
    private static void serializeStudents(List<Student> students) {
        try{
            FileOutputStream fileOut = new FileOutputStream("src\\main\\java\\com\\ass4\\ass4\\file1.txt");
            ObjectOutputStream out = new ObjectOutputStream(fileOut);
            out.writeObject(students);
            out.close();
            fileOut.close();
            System.out.println("Serialization successful in file file1.txt");
        }
        catch(IOException e){
            e.printStackTrace();
        }
    }
}