import java.awt.*;
import java.util.Random;

public class NinjaCat extends Critter {
    private Random random;

    public NinjaCat() {
        random = new Random();
    }

    public Action getMove(CritterInfo info) {
        if (info.frontThreat()) {
            return Action.RIGHT;
        } else if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.LEFT;
        }
    }

    public Color getColor() {
        return new Color(random.nextInt(256), random.nextInt(256), random.nextInt(256));
    }

    public String toString() {
        return "N";
    }
}
