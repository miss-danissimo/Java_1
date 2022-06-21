package HW_7;

import java.util.Scanner;

public class HW_7 {

        public static void main(String[] args) {

            Cat[] cats = {
                    new Cat("Анатолий", 2),
                    new Cat("Кирилл", 4),
                    new Cat("Борис", 6),
                    new Cat("Тигр", 8),
                    new Cat("Геннадий", 10),
            };

            Plate plate = new Plate(18);

            printInfo(cats, plate);
            haveLunch(cats, plate);

            printInfo(cats, plate);

            addFood(plate);

            System.out.println("Добавка: ");
            plate.info();
            System.out.println();

            haveLunch(cats, plate);
            printInfo(cats, plate);


        }

        private static void addFood(Plate plate) {
            Scanner scanner = new Scanner(System.in);
            System.out.print("Новая еда: ");
            int foodCount = scanner.nextInt();
            plate.addFood(foodCount);
        }

        private static void printInfo(Cat[] cats, Plate plate) {
            System.out.println();
            plate.info();
            printInfo(cats);
            System.out.println();
            System.out.println();
        }

        private static void haveLunch(Cat[] cats, Plate plate) {
            for (Cat cat : cats) {
                boolean result = cat.eat(plate);
                System.out.printf("Наш кот %s покушал? Результат: %s%n", cat.getName(), result);
            }
            System.out.println();
        }

        private static void printInfo(Cat... cats) {
            for (Cat cat : cats) {
                System.out.printf("Наш кот %s (аппетит: %d) голоден? Результат: %s%n",
                        cat.getName(),
                        cat.getAppetite(),
                        !cat.isSatiety());
            }
        }
}

