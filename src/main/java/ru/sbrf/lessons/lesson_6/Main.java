package ru.sbrf.lessons.lesson_6;

import ru.sbrf.lessons.lesson_6.animals.Animal;
import ru.sbrf.lessons.lesson_6.animals.Cat;
import ru.sbrf.lessons.lesson_6.animals.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat cat = new Cat();
        Dog dog = new Dog();

        System.out.println("Animal opportunities: ");
        animal.Eat();
        animal.MakeSounds();
        animal.Move();

        System.out.println();
        System.out.println("Cat opportunities: ");
        cat.ClimbUpTrees();
        cat.Eat();
        cat.MakeSounds();
        cat.Move();

        System.out.println();
        System.out.println("Dog opportunities: ");
        dog.Swim();
        dog.Eat();
        dog.MakeSounds();
        dog.Move();
    }
}
