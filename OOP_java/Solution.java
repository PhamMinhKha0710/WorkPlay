import java.util.Random;

class Solution {
    public static void main(String[] args) {
        Solution solution = new Solution();
        char[][] board = new char[9][9];
        solution.generateSudoku(board);
        System.out.println("Generated Sudoku:");
        solution.printBoard(board);

        if (solution.solveSudoku(board)) {
            System.out.println("Solved Sudoku:");
            solution.printBoard(board);
        } else {
            System.out.println("No solution exists for the given Sudoku.");
        }
    }

    public boolean solveSudoku(char[][] board) {
        int[][] f = new int[9][10];
        int[][] row = new int[9][10];
        int[][] col = new int[9][10];
        int cell = 0;
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                cell = ((i / 3) * 3) + j / 3;
                if (board[i][j] != '.') {
                    f[cell][(int) (board[i][j] - '0')] = 1;
                    row[i][(int) (board[i][j] - '0')] = 1;
                    col[j][(int) (board[i][j] - '0')] = 1;
                }
            }
        }
        return get(f, board, 0, 0, row, col);
    }

    static boolean get(int[][] f, char[][] board, int i, int j, int[][] row, int[][] col) {
        if (i == 9) return true;
        if (board[i][j] != '.') {
            if (j == 8) {
                return get(f, board, i + 1, 0, row, col);
            } else {
                return get(f, board, i, j + 1, row, col);
            }
        } else {
            boolean t = false;
            int cell = ((i / 3) * 3) + j / 3;
            for (int k = 1; k <= 9; k++) {
                if (f[cell][k] == 0 && row[i][k] == 0 && col[j][k] == 0) {
                    f[cell][k] = 1;
                    row[i][k] = 1;
                    col[j][k] = 1;
                    board[i][j] = (char) (k + '0');
                    if (j == 8) {
                        t = get(f, board, i + 1, 0, row, col);
                    } else {
                        t = get(f, board, i, j + 1, row, col);
                    }
                    if (t) return true;
                    f[cell][k] = 0;
                    row[i][k] = 0;
                    col[j][k] = 0;
                    board[i][j] = '.';
                }
            }
        }
        return false;
    }

    public void generateSudoku(char[][] board) {
        Random rand = new Random();
        // Fill the board with empty cells
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                board[i][j] = '.';
            }
        }

        // Randomly fill some cells with valid numbers
        for (int i = 0; i < 9; i++) {
            int row = rand.nextInt(9);
            int col = rand.nextInt(9);
            int num = rand.nextInt(9) + 1;
            board[row][col] = (char) (num + '0');
        }
    }

    public void printBoard(char[][] board) {
        for (int i = 0; i < 9; i++) {
            for (int j = 0; j < 9; j++) {
                System.out.print(board[i][j] + " ");
            }
            System.out.println();
        }
    }
}
