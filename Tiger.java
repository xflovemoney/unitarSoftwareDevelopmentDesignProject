import java.awt.*;
import java.util.Random;

public class Tiger extends Critter {
    private Color[] colors = {Color.RED, Color.GREEN, Color.BLUE};
    private Color currentColor;
    private int steps;
    private Random random;

    public Tiger() {
        random = new Random();
        steps = 0;
        currentColor = colors[random.nextInt(colors.length)];
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            return Action.INFECT;
        } else if (info.getFront() == Neighbor.WALL || info.getRight() == Neighbor.WALL) {
            return Action.LEFT;
        } else if (info.getFront() == Neighbor.SAME) {
            return Action.RIGHT;
        } else {
            return Action.HOP;
        }
    }

    public Color getColor() {
        if (steps % 3 == 0) {
            currentColor = colors[random.nextInt(colors.length)];
        }
        steps++;
        return currentColor;
    }

    public String toString() {
        return "TGR";
    }
}
