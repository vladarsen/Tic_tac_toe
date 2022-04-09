package ua.ithillel.tictactoe;

import java.util.Random;

public class RandomCoordinateScanner implements CoordinateScanner {
    private final Random random = new Random();
    private final CoordinateValidator coordinateValidator = new CoordinateValidator(0, 2);


    @Override
    public Coordinates scan() {
        Coordinates coordinates;
        do {
            coordinates = new Coordinates(random.nextInt(3), random.nextInt(3));
        } while (coordinateValidator.notValid(coordinates));
        return coordinates;
    }
}
