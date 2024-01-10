package ru.geekbrains.junior.lesson2.taskGB;

import lombok.Data;

@Data
public abstract class Animal {

    private String name;
    private int age;

    public void makeSound(){}
}
