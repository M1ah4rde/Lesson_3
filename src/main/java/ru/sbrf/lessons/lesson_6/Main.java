package ru.sbrf.lessons.lesson_6;

import ru.sbrf.lessons.lesson_6.animal.Animal;
import ru.sbrf.lessons.lesson_6.animal.Cat;
import ru.sbrf.lessons.lesson_6.animal.Dog;

public class Main {
    public static void main(String[] args) {
        Animal animal = new Animal();
        Cat alice = new Cat("Alice");
        Dog lester = new Dog("Roze");

        System.out.println("Возможности животных:");
        animal.eat();
        animal.makeSounds();
        animal.moving();

        System.out.println();
        System.out.println("Возможности кошки 'Алисы':");
        alice.climbUpTrees();
        alice.eat();
        alice.makeSounds();
        alice.moving();

        System.out.println();
        System.out.println("Возможности собаки 'Лестер':");
        lester.swim();
        lester.eat();
        lester.makeSounds();
        lester.moving();
    }
}
