package org.example.basic.main;

import org.example.basic.pojo.Student;
import org.example.basic.reflect.StudentReflect;
import org.example.color.Color;

import java.util.Arrays;

public class MainChapter1 {
    public static void main(String[] args) throws NoSuchMethodException {
        Student student = Student.builder()
                .name("Le Nguyen Khoi")
                .age(20)
                .email("khoilnde140244@fpt.edu.vn")
                .build();

        //Before using method of reflection
        System.out.println(Color.PURPLE + "Before using method of reflection" + Color.RESET);
        System.out.println(student.toString());
        System.out.println("");

        //Using method setName
        System.out.println(Color.PURPLE + "Using method setName" + Color.RESET);
        StudentReflect.setNameStudent(student, "Milu");
        System.out.println(student.toString());
        System.out.println("");

        //Using get all public method
        System.out.println(Color.PURPLE + "Using method to get all public method" + Color.RESET);
        Arrays
                .stream(StudentReflect
                        .getAllPublicMethod(student))
                .forEach(method -> System.out.println(method.getName()));
        System.out.println("");

        //Get all Declared Methods Student
        System.out.println(Color.PURPLE + "Using method to get all declared method" + Color.RESET);
        Arrays
                .stream(StudentReflect
                        .getAllDeclaredMethodsStudent(student))
                .forEach(method -> System.out.println(method.getName()));
        System.out.println("");

        //Get method declared be name
        System.out.println(Color.PURPLE + "Get method declared be name" + Color.RESET);
        System.out.println(
                StudentReflect.getDeclareMethodStudent(
                        student,
                        "getName",
                        new Class[]{}
                )
        );
        System.out.println(
                StudentReflect.getDeclareMethodStudent(
                        student,
                        "saySecret",
                        new Class[]{}
                )
        );
        System.out.println("");

        //Get a method parameter types
        System.out.println(Color.PURPLE + "Get a method parameter types" + Color.RESET);
        Arrays.stream(
                StudentReflect.getParametersTypes(student, "setName", new Class[]{String.class})
        ).forEach(clazz -> System.out.println(clazz.getName()));
        System.out.println("");

    }
}
