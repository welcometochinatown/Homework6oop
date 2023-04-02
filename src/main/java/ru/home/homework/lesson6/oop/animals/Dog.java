package ru.home.homework.lesson6.oop.animals;

public class Dog extends Animal {
    private int runLength;

    public Dog(String name) {
        this.name = name;
    }


    @Override
    public void run(int runLength) {
        if (runLength > 0 && runLength <= 500) {
            System.out.println(name + " пробежал " + runLength + " м.");
        } else {
            System.out.println(name + " может пробежать только 500м");
        }
    }

    @Override
    public void swim(int runLength) {
        if (runLength > 0 && runLength <= 10) {
            System.out.println(name + " проплыл " + runLength + " м.");
        } else {
            System.out.println(name + " может проплыть только 10м");
        }
    }
}
