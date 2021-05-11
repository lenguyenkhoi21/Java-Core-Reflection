package org.example.chapter1.pojo;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Student {
    private String name;
    private int age;
    private String email;

    public void sayHello() {
        System.out.println("Student Hello !");
    }

    private void saySecret() {
        System.out.println("I told you the secrect !");
    }
}
