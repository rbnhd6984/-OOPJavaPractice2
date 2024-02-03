package practice2;

public class Track extends Obstacle {
    protected int length;

    public Track(int length) {
        this.length = length;
    }

    @Override
    void doAction(Creature creature) {
        creature.run(length);
    }

}
