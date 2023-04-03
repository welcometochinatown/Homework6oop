package ru.home.homework.lesson6.oop.animals;

public class Cat extends Animal {
    private static int catCount;

    public Cat(String name) {
        super(name);
        catCount++;
    }

    public static int getCatCount() {
        return catCount;
    }

    @Override
    public void run(int runLength) {
        if (runLength > 0 && runLength <= 200) {
            System.out.println(name + " пробежал " + runLength + " м.");
        } else {
            System.out.println(name + " может пробежать только 200м");
        }
    }

    @Override
    public void swim(int swimLength) {
        System.out.println(name + " не умеет плавать");
    }
}
