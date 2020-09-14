package ru.sbrf.lessons.lesson_6.animals;

import ru.sbrf.lessons.lesson_6.opportunities.ClimbUpTrees;
import ru.sbrf.lessons.lesson_6.opportunities.Eat;
import ru.sbrf.lessons.lesson_6.opportunities.MakeSounds;
import ru.sbrf.lessons.lesson_6.opportunities.Move;

public class Cat implements ClimbUpTrees, Eat, MakeSounds, Move {

    private String name;

    public Cat(String name) {
        this.name = name;
    }

    @Override
    public void ClimbUpTrees() {
        System.out.println("The cat can climb trees");
    }

    @Override
    public void Eat() {
        System.out.println("Cat eating: 'chomp-chomp'");
    }

    @Override
    public void MakeSounds() {
        System.out.println("Cat says: 'Meow'");
    }

    @Override
    public void Move() {
        System.out.println("The cat is moving");
    }
}