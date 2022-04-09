package ua.ithillel.tictactoe;

public class CoordinateValidator {
    private final int minRange;
    private final int maxRange;

    public CoordinateValidator(int minRange, int maxRange) {
        this.minRange = minRange;
        this.maxRange = maxRange;
    }

    public boolean validate (Coordinates coordinates){
        if (coordinates == null) {
            return false;
        } return  (coordinates.getH() >= minRange && coordinates.getH() <= maxRange)
                && (coordinates.getV() >= minRange && coordinates.getV() <= maxRange);
     }
    public boolean notValid(Coordinates coordinate) {
        return !validate(coordinate);
    }
}
