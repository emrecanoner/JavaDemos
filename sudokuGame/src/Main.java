import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        SudokuCreater sudokuCreater = new SudokuCreater();
        SudokuSolver sudokuSolver = new SudokuSolver();
        System.out.println("Welcome to Sudoku Game\nPlease Press c or C to Create a Sudoku");
        Scanner scanner = new Scanner(System.in);
        char letter = scanner.next().charAt(0);
        if (letter == 'c' || letter == 'C') {
            sudokuCreater.create();
            sudokuCreater.shuffle();
            sudokuCreater.delete();
            sudokuCreater.print();
            System.out.println("Please Press s or S to Solve The Sudoku");
            letter = scanner.next().charAt(0);
            if (letter == 's' || letter == 'S') {
                sudokuSolver.solve();
                sudokuSolver.print();
            } else {
                System.out.println("Invalid letter");
            }

        } else {
            System.out.println("Invalid letter");
        }
    }
}

