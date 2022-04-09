package ua.ithillel.tictactoe;

import java.util.Scanner;

public class Main {
    private static final FieldDrawer fieldDrawer = new FieldDrawer();
    private static final CoordinateChecker coordinateChecker = new CoordinateChecker();
    private static final WinChecker winChecker = new WinChecker();
    private static final DrawChecker drawChecker = new DrawChecker();
    private static final RandomCoordinateScanner randomCoordinateScanner = new RandomCoordinateScanner();
    private static final Scanner scanner = new Scanner(System.in);


    public static void main(String[] args) {
        int gameScanner;
        while (true) {
            System.out.println("Желаете начать игру?(1 - Да, 2 - Нет)");
            gameScanner = scanner.nextInt();
            if (gameScanner == 1) {
                game();
            } else break;
        }
    }

    private static void game() {
        Field field = new Field();
        fieldDrawer.draw(field);


        while (true) {
            turnHuman(field);
            if (winChecker.winChecker('X', field)) {
                System.out.println("YOU WIN!");
                break;
            }
            if (drawChecker.drawChecker(field)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
            turnAI(field);
            fieldDrawer.draw(field);
            if (winChecker.winChecker('O', field)) {
                System.out.println("AI WIN!");
                fieldDrawer.draw(field);
                break;
            }
            if (drawChecker.drawChecker(field)) {
                System.out.println("Sorry, DRAW!");
                break;
            }
        }
        System.out.println("GAME OVER.");
        fieldDrawer.draw(field);
    }

    public static void turnAI(Field field) {
        Coordinates randomCoordinate;
        do {
            randomCoordinate = randomCoordinateScanner.scan();
            System.out.println(randomCoordinate);
        } while (!coordinateChecker.checker(randomCoordinate, field));
        field.setValue(randomCoordinate.getH(), randomCoordinate.getV(), 'O');
    }


    public static void turnHuman(Field field) {
        Coordinates coordinates;
        do {
            coordinates = new StdoutCoordinateScanner().scan();
        } while (!coordinateChecker.checker(coordinates, field));
        field.setValue(coordinates.getH(), coordinates.getV(), 'X');
    }
}
