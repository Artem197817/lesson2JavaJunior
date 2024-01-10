package ru.geekbrains.junior.lesson2.taskGB;

import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

/**
 * Создайте абстрактный класс "Animal" с полями "name" и "age".
 * Реализуйте два класса-наследника от "Animal" (например, "Dog" и "Cat") с уникальными полями и методами.
 * Создайте массив объектов типа "Animal" и с использованием Reflection API выполните следующие действия:
 * Выведите на экран информацию о каждом объекте.
 * Вызовите метод "makeSound()" у каждого объекта, если такой метод присутствует.
 */

public class Program {
    public static void main(String[] args) throws IllegalAccessException, NoSuchMethodException, InvocationTargetException {
        Animal[] animals = new Animal[4];
        animals[0] = new Dog("Bar", 3, "dog");
        animals[1] = new Cat("Graf", 2, "red");
        animals[2] = new Cat("Fedor", 1, "white");
        animals[3] = new Dog("Rex", 4, "pug");

        for (Animal a :animals){
            Class<?> clazz = a.getClass();
            Field[] fields = clazz.getDeclaredFields();
            System.out.println(clazz);
            for (Field field : fields) {
                field.setAccessible(true);
                System.out.println("Поле: " + field.getName() + " - " + field.get(a));
            }
                Method method = clazz.getDeclaredMethod("makeSound");
                method.invoke(a);

        }
    }
}
