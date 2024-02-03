package practice2;

public class Main {
    public static void main(String[] args) {
        Creature[] participants = {
                new Human("Иииигааарь", 300, 1),
                new Cat("Бааарсик", 400, 2),
                new Robot("R2D2", 500, 0)
        };

        Obstacle[] obstacles = {
                new Track(250),
                new Wall(2),
                new Track(350),
                new Wall(3)
        };

        for (Creature participant : participants) {
            boolean completed = true;
            for (Obstacle obstacle : obstacles) {
                obstacle.doAction(participant);
                if ((obstacle instanceof Track && participant.maxRunDistance < ((Track) obstacle).length) ||
                        (obstacle instanceof Wall && participant.maxJumpHeight < ((Wall) obstacle).height)) {
                    System.out.println(participant.name + " не смог преодолеть препятствие и выбывает из соревнований.");
                    completed = false;
                    break;
                }
            }
            if (completed) {
                System.out.println(participant.name + " успешно преодолел все препятствия!");
            }
        }
    }
}
