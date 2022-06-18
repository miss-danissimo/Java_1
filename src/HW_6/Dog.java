package HW_6;

public class Dog extends Animal {

    public static final int MAX_RUN_DISTANCE = 500;
    public static final int MAX_SWIM_LENGTH = 10;

    private static int count;

    public static int getCount() {
        return count;
    }

    public Dog(int maxRunDistance, int maxSwimLength) {
        super(maxRunDistance, maxSwimLength);
        count++;
    }
    public Dog() {
        this(MAX_RUN_DISTANCE,MAX_SWIM_LENGTH );
    }

    @Override
    public boolean run(int distance) {
        if (this.maxRunDistance >= distance) {
            System.out.printf("Собака умница и пробежала дистанцию %d. Max = %d%n", distance, maxRunDistance);
            return true;
        }

        System.out.printf("Собака голодная и не смогла пробежать дистанцию %d. Max = %d%n", distance, maxRunDistance);
        return false;
    }

    @Override
    public boolean swim(int distance) {
        if (this.maxSwimLength >= distance) {
            System.out.printf("Собака супер и переплыла дистанцию %d. Max = %d%n", distance, maxSwimLength);
            return true;
        }

        System.out.printf("Собака хотела на корабле кататься, а не лапками работать, поэтому не смогла переплыть дистанцию %d. Max = %d%n", distance, maxSwimLength);
        return false;
    }

}