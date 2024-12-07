import java.awt.*;

public class Giant extends Critter {
    private String[] phrases = {"fee", "fie", "foe", "fum"};
    private int steps;

    public Giant() {
        this.steps = 0;
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.EMPTY) {
            return Action.HOP;
        } else {
            return Action.RIGHT;
        }
    }

    public Color getColor() {
        return Color.GRAY;
    }

    public String toString() {
        return phrases[(steps / 6) % phrases.length];
    }

    public void incrementSteps() {
        steps++;
    }
}
