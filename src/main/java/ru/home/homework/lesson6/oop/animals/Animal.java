package ru.home.homework.lesson6.oop.animals;

public abstract class Animal {
    String name;

    public Animal(String name) {
        this.name = name;
    }

    public abstract void run(int runLength);

    public abstract void swim(int swimLength);
}
