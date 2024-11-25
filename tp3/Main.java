import java.util.Scanner;

public class Main {
    public static String[] table = { "Courtois", "Dani", "", "Alaba", "", "Nacho", "Hazard", "Kroos", "Benzima", "Luka",
            "Asensio" };

    static int powerOf5(int n) {
        int ans = 1;
        for (int i = 0; i < n; i++) {
            ans *= 5;
        }
        return ans;
    }

    static int productMsum(int a, int b) {
        return a * b - (a + b);
    }

    static int productOf3(int[] arr) {
        return arr[0] * arr[1] * arr[2];
    }

    static void playerName(int i) {
        if (i >= 1 && i <= 11) {
            System.out.println(table[i - 1]);
        } else {
            System.out.println("specify a proper number");
        }
    }

    static boolean checkValideEsi(String email) {
        return email.endsWith("@esi-sba.dz");
    }

    static String reverseString(String str) {
        String ans = "";
        for (int i = str.length() - 1; i >= 0; i--) {
            ans += str.charAt(i);
        }
        return ans;
    }

    static String recRev(String str) {

        if (str.length() == 0) {
            return "";
        } else {
            return str.charAt(str.length() - 1) + recRev(str.substring(0, str.length() - 1));
        }
    }

    static char[][] board = { { '1', '2', '3' }, { '4', '5', '6' }, { '7', '8', '9' }, };
    static boolean there_is_winner = false;
    static boolean tie = false;

    static void playCpu() {
        // check if the cpu win in the next move
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] != 'o' && board[row][col] != 'x') {
                    char temp = board[row][col];
                    board[row][col] = 'x';
                    check_the_winner();
                    if (there_is_winner) {
                        there_is_winner = false;
                        return;
                    }
                    board[row][col] = temp;
                }

            }

        }
        // check if the player win in the next move
        for (int row = 0; row < 3; row++) {
            for (int col = 0; col < 3; col++) {
                if (board[row][col] != 'o' && board[row][col] != 'x') {
                    char temp = board[row][col];
                    board[row][col] = 'o';
                    check_the_winner();
                    if (there_is_winner) {
                        board[row][col] = 'x';
                        there_is_winner = false;
                        return;
                    }
                    board[row][col] = temp;
                }
            }
        }
        // play the center if it's available
        if (board[1][1] == '5') {
            board[1][1] = 'x';
            return;
        }

        if (board[0][0] == 'o' && board[2][2] == 'o') {
            board[1][2] = 'x';
            return;
        }
        if (board[0][2] == 'o' && board[2][0] == 'o') {
            board[1][2] = 'x';
            return;
        }
        // play in random corner if available
        if (board[0][0] == '1') {
            board[0][0] = 'x';
            return;
        }
        if (board[0][2] == '3') {
            board[0][2] = 'x';
            return;
        }
        if (board[2][0] == '7') {
            board[0][0] = 'x';
            return;
        }
        if (board[2][2] == '9') {
            board[2][2] = 'x';
            return;
        }
        // play in random empty cell
        for (int row = 0; row < 3; row++) {
            for (int col = 0; row < 3; row++) {
                if (board[row][col] != 'o' && board[row][col] != 'x') {
                    board[row][col] = 'x';
                    return;
                }
            }
        }
    }

    static void show() {
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.print(board[i][j]);
                System.out.print(" | ");
            }
            System.out.println();
        }
    }

    static int get_cell_column(char cellNumber) {
        int value = (int) (cellNumber) - 48;
        if (value < 0 || value > 9) {
            System.out.println("please enter a correct cell number");
            return -1;
        }
        return value % 3 == 0 ? 2 : (value % 3) - 1;
    }

    static int get_cell_row(char cellNumber) {
        int value = (int) (cellNumber) - 48;
        if (value < 0 || value > 9) {
            System.out.println("please enter a correct cell number");
            return -1;
        }
        return value % 3 == 0 ? value / 3 - 1 : value / 3;
    }

    static void playing(int row, int col, char playerChar) {
        if (board[row][col] == 'o' || board[row][col] == 'x') {
            System.out.println("the cell is occupied");
            return;
        }
        board[row][col] = playerChar;
    }

    static void check_the_winner() {
        for (int i = 0; i < 3; i++) {
            if ((board[i][0] == board[i][1] && board[i][1] == board[i][2])
                    || (board[0][i] == board[1][i] && board[1][i] == board[2][i])) {
                there_is_winner = true;
                return;
            }
        }
        if ((board[0][0] == board[1][1] && board[1][1] == board[2][2])
                || (board[0][2] == board[1][1] && board[1][1] == board[2][0])) {
            there_is_winner = true;
            return;
        }
        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                if (board[i][j] != 'x' && board[i][j] != 'o') {
                    return;
                }
            }
        }
        tie = true;
    }

    public static void main(String[] args) {
        show();
        Scanner sc = new Scanner(System.in);
        System.out.println("player 1 will play with : o");
        System.out.println("cpu will play with : x");
        int row, col;
        while (true) {
            System.out.println("player 01 select a cell number :  ");
            char player01 = sc.next().charAt(0);
            System.out.println("player 01 select : " + player01);
            row = get_cell_row(player01);
            col = get_cell_column(player01);
            playing(row, col, 'o');
            check_the_winner();
            show();
            if (there_is_winner) {
                System.out.println("player 1 is the winner !!");
                break;
            }
            if (tie) {
                System.out.println(" tie !!");
            }
            System.out.println("cpu turn !");
            playCpu();
            check_the_winner();
            show();
            if (there_is_winner) {
                System.out.println("cpu is the winner !!");
                break;
            }
            if (tie) {
                System.out.println(" tie !!");
                break;
            }

        }
    }
}