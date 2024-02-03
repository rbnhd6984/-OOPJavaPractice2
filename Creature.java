package practice2;

public abstract class Creature {
    protected String name;
    protected int maxRunDistance;
    protected int maxJumpHeight;

    public Creature(String name, int maxRunDistance, int maxJumpHeight) {
        this.name = name;
        this.maxRunDistance = maxRunDistance;
        this.maxJumpHeight = maxJumpHeight;
    }

    abstract void run(int distance);
    abstract void jump(int height);
}
