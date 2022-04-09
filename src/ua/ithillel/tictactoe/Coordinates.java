package ua.ithillel.tictactoe;

public class Coordinates {
    private final int h;
    private final int v;

    public Coordinates(int h, int v) {
        this.h = h;
        this.v = v;
    }

    public int getH() {
        return h;
    }

    public int getV() {
        return v;
    }

    @Override
    public String toString() {
        return "Coordinates{" +
                "h=" + h +
                ", v=" + v +
                '}';
    }
}
