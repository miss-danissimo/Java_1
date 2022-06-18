package HW_6;

import java.util.Random;

public class HW {

    public static void main(String[] args) {
        Animal[] pets = preparePets();
        playGame(pets);
    }

    private static Animal[] preparePets() {
        return new Animal[] {
                new Cat(100, 9),
                new Dog(23,56),
                new Cat(300, 3),
                new Cat(115, 0),
                new Dog(1000,15),
                new Dog(3, 30),
                new Cat(0, 0)
        };
    }

    private static void playGame(Animal[] pets) {
        Random random = new Random();

        for (Animal pet : pets) {
            pet.printInfo();
            System.out.println(pet.swim(random.nextInt(100)));
            System.out.println(pet.run(random.nextInt(300)));
            System.out.println();
        }

        System.out.println(Animal.getCount());
        System.out.println(Dog.getCount());
        System.out.println(Cat.getCount());

    }
}
