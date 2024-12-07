import java.awt.*;

public class WhiteTiger extends Tiger {
    private boolean hasInfected;

    public WhiteTiger() {
        this.hasInfected = false;
    }

    public Action getMove(CritterInfo info) {
        if (info.getFront() == Neighbor.OTHER) {
            hasInfected = true;
        }
        return super.getMove(info);
    }

    public Color getColor() {
        return Color.WHITE;
    }

    public String toString() {
        return hasInfected ? "TGR" : "tgr";
    }
}
