package practice2;

public class Wall extends Obstacle{
    protected int height;

    public Wall(int height) {
        this.height = height;
    }

    void doAction(Creature creature) {
        creature.jump(height);
    }
}
