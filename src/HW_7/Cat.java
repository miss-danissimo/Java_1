package HW_7;

public class Cat {

    private final String name;
    private final int appetite;
    private boolean satiety;

    public Cat(String name, int appetite) {
        this.name = name;
        this.appetite = appetite;
    }

    public String getName() {
        return name;
    }

    public int getAppetite() {
        return appetite;
    }

    public boolean eat(Plate plate) {
        String message = checkEat(plate);
        if (message != null) {
            System.out.println(message);
            return false;
        }

        doEat(plate);
        satiety = true;
        return true;
    }

    private String checkEat(Plate plate) {
        if (!plate.isFoodEnough(appetite)) {
            return "Недостаточно еды в тарелке!";
        }
        if (satiety) {
            return "Кот уже не голоден!";
        }

        return null;
    }

    private void doEat(Plate plate) {
        plate.decreaseFood(appetite);
    }

    public boolean isSatiety() {
        return satiety;
    }
}