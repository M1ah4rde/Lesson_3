package ru.sbrf.lessons.lesson_6.animals;

import ru.sbrf.lessons.lesson_6.opportunities.ClimbUpTrees;
import ru.sbrf.lessons.lesson_6.opportunities.Eat;
import ru.sbrf.lessons.lesson_6.opportunities.MakeSounds;
import ru.sbrf.lessons.lesson_6.opportunities.Move;

public class Cat implements ClimbUpTrees, Eat, MakeSounds, Move {

    public void ClimbUpTrees() {
        System.out.println("The cat can climb trees");
    }

    public void Eat() {
        System.out.println("Cat eating: 'chomp-chomp'");
    }

    public void MakeSounds() {
        System.out.println("Cat says: 'Meow'");
    }

    public void Move() {
        System.out.println("The cat is moving");
    }

}
