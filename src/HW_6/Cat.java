package HW_6;

public class Cat extends Animal {
    public static final int MAX_RUN_DISTANCE = 200;
    public static final int MAX_SWIM_LENGTH = 0;

    private static int count;

    public static int getCount() {
        return count;
    }

    public Cat(int maxRunDistance) {
        super(maxRunDistance, MAX_SWIM_LENGTH);
        count++;
    }

    public Cat(int a, int b) {
        this(MAX_RUN_DISTANCE);
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("Кот молодец и пробежал дистанцию %d. Max = %d%n", distance, maxRunDistance);
            return true;
        }

        System.out.printf("Кот устал и не смог пробежать дистанцию %d. Max = %d%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        System.out.println("Кот не умеет плавать!");
        return false;
    }


}