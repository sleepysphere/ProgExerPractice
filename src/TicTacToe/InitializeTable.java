package TicTacToe;

public class InitializeTable {
    // intialize the game table with 0s, 1 for player, 2 for machine
    int GameTable[][] = new int[3][3];
    {
    for(int i = 0; i < 3; i++){
        for(int j = 0; j < 3; j++){
            GameTable[i][j] = 0;
        }
    }
    }
}
