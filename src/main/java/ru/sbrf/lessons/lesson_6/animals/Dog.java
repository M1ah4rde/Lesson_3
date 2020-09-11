package ru.sbrf.lessons.lesson_6.animals;

import ru.sbrf.lessons.lesson_6.opportunities.Eat;
import ru.sbrf.lessons.lesson_6.opportunities.MakeSounds;
import ru.sbrf.lessons.lesson_6.opportunities.Move;
import ru.sbrf.lessons.lesson_6.opportunities.Swim;

public class Dog implements Swim, Eat, MakeSounds, Move {

    public void Swim() {
        System.out.println("The dog can swimming");
    }

    public void Eat() {
        System.out.println("Dog eating: 'chomp-chomp'");
    }

    public void MakeSounds() {
        System.out.println("Dog says: 'Woof-Woof'");
    }

    public void Move() {
        System.out.println("The dog is moving");
    }
}
