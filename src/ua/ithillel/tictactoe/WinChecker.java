package ua.ithillel.tictactoe;

public class WinChecker {
    public boolean winChecker(char dot, Field field) {
        char[][] data = field.getData();
        for (int i = 0; i < 3; i++)
            if ((data[i][0] == dot && data[i][1] == dot &&
                    data[i][2] == dot) ||
                    (data[0][i] == dot && data[1][i] == dot &&
                            data[2][i] == dot))
                return true;
        return (data[0][0] == dot && data[1][1] == dot &&
                data[2][2] == dot) ||
                (data[2][0] == dot && data[1][1] == dot &&
                        data[0][2] == dot);
    }
}
