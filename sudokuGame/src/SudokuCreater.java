public class SudokuCreater extends PrintSudoku implements SudokuManager {

    public void create() {
        int temp1, temp2 = 0;
        for (int i = 0; i < size; i++) {
            temp1 = temp2;
            for (int j = 0; j < size; j++) {
                if (temp1 < size) {
                    sudoku[i][j] = nameOfValue[temp1];
                    temp1++;
                } else {
                    temp1 = 0;
                    sudoku[i][j] = nameOfValue[temp1];
                    temp1++;
                }
            }
            temp2 = temp1 + 3; //I use the algorithm to create a unique sudoku
            if (temp1 == 9) {
                temp2 = 3;
            }
            if (temp2 > 8) { //if temp2 smaller than index number of sudoku characters then apply modulo not to get IndexOutOfBoundException
                temp2 = (temp2 % size) + 1;
            }
        }
    }

    public void suffleRow(char[] dataKeeper, int randNum1, int randNum2) {
        for (int i = 0; i < size; i++) { //change the random number 1 row and random number 2 row
            dataKeeper[i] = sudoku[randNum1][i];
            sudoku[randNum1][i] = sudoku[randNum2][i];
            sudoku[randNum2][i] = dataKeeper[i];
        }
    }

    public void suffleColumn(char[] dataKeeper, int randNum1, int randNum2) {
        for (int i = 0; i < size; i++) { //change the random number 1 column and random number 2 column
            dataKeeper[i] = sudoku[i][randNum1];
            sudoku[i][randNum1] = sudoku[i][randNum2];
            sudoku[i][randNum2] = dataKeeper[i];
        }
    }

    public void shuffle() { // I aplly the shuffle three times not to be easy for solving
        suffleRow(dataKeeper, randNum1, randNum2);
        suffleColumn(dataKeeper, randNum1, randNum2);
        suffleRow(dataKeeper, randNum3, randNum4);
        suffleColumn(dataKeeper, randNum3, randNum4);
        suffleRow(dataKeeper, randNum5, randNum6);
        suffleColumn(dataKeeper, randNum5, randNum6);
    }

    public void delete() {
        int x = 0, y;
        for (int i = 0; i < size; i++) {
            if (i == 3) { // if index equal 3 then x equal 1
                x = 1;
            }
            if (i == 6) { // if index equal 6 then x equal 2
                x = 2;
            }
            y = 0;
            while (y < size) { // while y smaller than size of sudoku, delete the value from sudoku three by three
                sudoku[i][x] = '0';
                y += 3;
                x += 3;
            }
            if (x > 8) { // if x smaller than index number of sudoku characters then apply modulo not to get IndexOutOfBoundException
                x = (x % size) + 1;
                if (x == 3) {
                    x = 0;
                }
            }
        }
        x = 0;
        for (int i = 0; i < size; i++) { // same process for column
            if (i == 3) {
                x = 1;
            }
            if (i == 6) {
                x = 2;
            }
            y = 0;
            while (y < size) {
                sudoku[x][i] = '0';
                y += 3;
                x += 3;
            }
            if (x > 8) {
                x = (x % size) + 1;
                if (x == 3) {
                    x = 0;
                }
            }
        }
    }
}
