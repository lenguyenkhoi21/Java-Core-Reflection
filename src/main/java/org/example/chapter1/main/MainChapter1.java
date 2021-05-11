package org.example.chapter1.main;

import org.example.chapter1.pojo.Student;
import org.example.chapter1.reflect.StudentReflect;

public class MainChapter1 {
    public static void main(String[] args) {
        Student student = Student.builder()
                .name("Le Nguyen Khoi")
                .age(20)
                .email("khoilnde140244@fpt.edu.vn")
                .build();

        //Before using method of reflection
        System.out.println("Before using method of reflection");
        System.out.println(student.toString());
        System.out.println("");

        //Using method setName
        System.out.println("Using method setName");
        StudentReflect.setNameStudent(student, "Milu");
        System.out.println(student.toString());
        System.out.println("");
    }
}
