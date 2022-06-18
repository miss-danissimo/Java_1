package HW_6;

public abstract class Animal {
    private static int count;

    public static int getCount() {
        return count;
    }

    protected int maxRunDistance;
    protected int maxSwimLength;

    public Animal(int maxRunDistance, int maxSwimLength) {
        this.maxRunDistance = maxRunDistance;
        this.maxSwimLength = maxSwimLength;
        count++;
    }

    public abstract boolean run(int distance);

    public abstract boolean swim(int distance);

    public void printInfo() {
        System.out.println(this);
    }

    @Override
    public String toString() {
        return  this.getClass().getSimpleName() + "{" +
                "maxRunDistance=" + maxRunDistance +
                ", maxSwimDistance=" + maxSwimLength +
                '}';
    }

}