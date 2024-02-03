package practice2;

public class Robot extends Creature {
    public Robot(String name, int maxRunDistance, int maxJumpHeight) {
        super(name, maxRunDistance, maxJumpHeight);
    }

    @Override
    void run(int distance) {
        if (distance <= maxRunDistance) {
            System.out.println(name + " пробежал дистанцию в " + distance + " метров");
        } else {
            System.out.println(name + " не добежал!");
        }
    }

    @Override
    void jump(int height) {
        System.out.println(name + " не умеет прыгать!");
    }
}
