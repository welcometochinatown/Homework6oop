package ru.home.homework.lesson6.oop;

import ru.home.homework.lesson6.oop.animals.Animal;
import ru.home.homework.lesson6.oop.animals.Cat;
import ru.home.homework.lesson6.oop.animals.Dog;

public class MainApp {
    public static void main(String[] args) {
        /*
        1. Создать классы Собака и Кот с наследованием от класса Животное.
        2. Все животные могут бежать и плыть.
        В качестве параметра каждому методу передается длина
        препятствия. Результатом выполнения действия будет печать в консоль.
        (Например, dogBobik.run(150); -> 'Бобик пробежал 150 м.');
        3. У каждого животного есть ограничения на действия
        (бег: кот 200 м., собака 500 м.; плавание:
        кот не умеет плавать, собака 10 м.).
        4. * Добавить подсчет созданных котов, собак и животных.
        */

        // Вариант №1
        Animal[] animal = {
                new Cat("Barsik"),
                new Dog("Bobik"),
                new Cat("Murzik")
        };

        for (Animal a: animal) {
            a.run(150);
            a.swim(5);
        }

        System.out.println();

        // Вариант №2
        Cat cat = new Cat("Smoke");
        Dog dog = new Dog("Rex");

        cat.run(150);
        cat.swim(50);
        dog.run(150);
        dog.swim(5);
    }
}