package ru.home.homework.lesson6.oop.animals;

public class Dog extends Animal {
    private static int dogCount;

    public Dog(String name) {
        super(name);
        dogCount++;
    }

    public static int getCount() {
        return dogCount;
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
    public void swim(int swimLength) {
        if (swimLength > 0 && swimLength <= 10) {
            System.out.println(name + " проплыл " + swimLength + " м.");
        } else {
            System.out.println(name + " может проплыть только 10м");
        }
    }
}
