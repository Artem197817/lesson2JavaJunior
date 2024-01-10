package ru.geekbrains.junior.lesson2.taskGB;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;

@Data
@EqualsAndHashCode(callSuper = true)
@AllArgsConstructor
public class Dog extends Animal{

    private String name;
    private int age;
    private String breedDog;



    @Override
    public void makeSound() {
        System.out.println("Гав");
    }
}
