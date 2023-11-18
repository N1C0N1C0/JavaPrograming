package ch06;

import java.util.ArrayList;

class Animal {
    public void move() {
        System.out.println("동물이 움직입니다.");
    }
    public void eating() {

    }
}
class Human extends Animal {
    @Override
    public void move() {
        System.out.println("사람이 움직입니다.");
    }
    public void readBook() {
        System.out.println("사람이 책을 읽습니다.");
    }
}

class Tiger extends Animal {
    @Override
    public void move() {
        System.out.println("호랑이가 움직입니다.");
    }
    public void hunting() {
        System.out.println("호랑이가 사냥을 합니다.");
    }
}
class Eagle extends Animal {
    @Override
    public void move() {
        System.out.println("독수리가 움직입니다.");
    }
    public void flying() {
        System.out.println("독수리가 날고 있습니다.");
    }
}

public class AnimalTest {
    public static void main(String[] args) {
        Animal animalH = new Human();
        Animal animalT = new Tiger();
        Animal animalE = new Eagle();

//        AnimalTest test = new AnimalTest();
//        test.moveAnimal(animalH);
//        test.moveAnimal(animalT);
//        test.moveAnimal(animalE);

        ArrayList<Animal> animalsList = new ArrayList<>();
        animalsList.add(animalH);
        animalsList.add(animalT);
        animalsList.add(animalE);

        for(Animal animal : animalsList) {
            animal.move();
        }
    }

    public void moveAnimal(Animal animal) {
        animal.move();
    }
}

