package org.example.memoryandgc.chapter05;

/**
 * 早期綁定和晚期綁定的例子
 */

class Animal {

    public void eat() {
        System.out.println("動物進食");
    }
}

interface Huntable {
    void hunt();
}

class Dog extends Animal implements Huntable {
    @Override
    public void eat() {
        System.out.println("狗吃骨頭");
    }

    @Override
    public void hunt() {
        System.out.println("捕食老鼠，多管閒事");
    }
}

class Cat extends Animal implements Huntable {

    public Cat() {
        super();//表現為：早期綁定
    }

    public Cat(String name) {
        this();//表現為：早期綁定
    }

    @Override
    public void eat() {
        super.eat();//表現為：早期綁定
        System.out.println("貓吃魚");
    }

    @Override
    public void hunt() {
        System.out.println("捕食老鼠，天經地義");
    }
}

public class AnimalTest {
    public void showAnimal(Animal animal) {
        animal.eat();//表現為：晚期綁定
    }

    public void showHunt(Huntable h) {
        h.hunt();//表現為：晚期綁定
    }
}
