package org.example.basic.pojo.complex;

import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Builder
@NoArgsConstructor
@AllArgsConstructor
public class Cat extends Animal{

    @Override
    public void Start() {

    }

    @Override
    public void End() {

    }
}
