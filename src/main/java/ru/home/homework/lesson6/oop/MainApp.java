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
                new Cat("Барсик"),
                new Cat("Васька"),
                new Cat("Тимка"),
                new Cat("Санька"),
                new Dog("Бобик"),
                new Dog("Тузик"),
                new Dog("Рекс"),
                new Dog("Стрелка"),
                new Cat("Дымок")
        };

        for (Animal a : animal) {
            a.run(150);
            a.swim(5);
        }
        System.out.println();
        animalsCount(animal);

        // Вариант №2
        Cat cat = new Cat("Дымок");
        Dog dog = new Dog("Рекс");

        cat.run(150);
        cat.swim(50);
        dog.run(150);
        dog.swim(5);
        System.out.println();

        System.out.println("==========================================");
        System.out.println();

        // Вывод решение через static
        System.out.println("ВСЕГО ЖИВОТНЫХ : " + (Cat.getCatCount() + Dog.getDogCount()));
        System.out.println("ВСЕГО КОТОВ : " + Cat.getCatCount());
        System.out.println("ВСЕГО СОБАК : " + Dog.getDogCount());
    }

    public static void animalsCount(Animal[] animal) {
        int animalCount = 0;
        int catCount = 0;
        int dogCount = 0;
        for (Animal a : animal) {
            if (a instanceof Cat) {
                catCount++;
            }
            if (a instanceof Dog) {
                dogCount++;
            }
            animalCount++;
        }
        System.out.println("Количество животных в массиве животных: " + animalCount);
        System.out.println("Количество котов в массиве животных: " + catCount);
        System.out.println("Количество собак в массиве животных: " + dogCount);
        System.out.println();
    }
}
