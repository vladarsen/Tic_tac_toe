package ua.ithillel.tictactoe;

public class CoordinateChecker {

    public boolean checker(Coordinates coordinates, Field field) {
        char[][] data = field.getData();
        return (data[coordinates.getH()][coordinates.getV()] == '-');
    }
}
