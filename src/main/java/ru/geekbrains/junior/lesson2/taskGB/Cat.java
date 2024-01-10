package ru.geekbrains.junior.lesson2.taskGB;


import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Cat extends Animal{

    private String name;
    private int age;
    private String colorCat;

    @Override
    public void makeSound() {
        System.out.println("МяУ");
    }
}
