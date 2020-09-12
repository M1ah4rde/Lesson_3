package ru.sbrf.lessons.lesson_6.animals;

import ru.sbrf.lessons.lesson_6.opportunities.Eat;
import ru.sbrf.lessons.lesson_6.opportunities.MakeSounds;
import ru.sbrf.lessons.lesson_6.opportunities.Move;
import ru.sbrf.lessons.lesson_6.opportunities.Swim;

public class Dog implements Swim, Eat, MakeSounds, Move {

    @Override
    public void Swim() {
        System.out.println("The dog can swimming");
    }

    @Override
    public void Eat() {
        System.out.println("Dog eating: 'chomp-chomp'");
    }

    @Override
    public void MakeSounds() {
        System.out.println("Dog says: 'Woof-Woof'");
    }

    @Override
    public void Move() {
        System.out.println("The dog is moving");
    }
}