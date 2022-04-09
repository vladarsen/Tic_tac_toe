package ua.ithillel.tictactoe;

public class DrawChecker {
    public boolean drawChecker(Field field) {
        char[][] data = field.getData();
        for (int i = 0; i < 3; i++)
            for (int j = 0; j < 3; j++)
                if (data[i][j] == '-')
                    return false;
        return true;
    }
}
