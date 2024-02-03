package practice2;

public class Cat extends Creature {
    public Cat(String name, int maxRunDistance, int maxJumpHeight) {
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
        if (height <= maxJumpHeight) {
            System.out.println(name + " перепрыгнул стену высотой " + height + " метров");
        } else {
            System.out.println(name + " не перепрыгнул!");
        }
    }
}
