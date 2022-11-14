package io.codelex.arrays.practice;

import java.util.Scanner;

public class TicTacToe {

    private static final char[][] board = new char[3][3];

    public static void main(String[] args) {
        Scanner keyboard = new Scanner(System.in);
        String replay = "y";

        while (!replay.equals("n")) {

            String winner = "";
            char currentPlayer = 'X';
            initBoard();
            displayBoard();

            while (!winCondition(board)) {
                System.out.print(currentPlayer + " Chose your location (row column):");
                String[] playerInput = keyboard.nextLine().split(" ");
                int x = Integer.parseInt(playerInput[0]);
                int y = Integer.parseInt(playerInput[1]);


                while (board[x][y] != ' ') {
                    System.out.println("That not a valid location Try again: ");
                    playerInput = keyboard.nextLine().split(" ");
                    x = Integer.parseInt(playerInput[0]);
                    y = Integer.parseInt(playerInput[1]);
                }

                board[x][y] = currentPlayer;
                if (!winCondition(board)) {
                    currentPlayer = playerTurn(currentPlayer);
                }

                displayBoard();

                if (winCondition(board)) {
                    winner = "The winner is " + currentPlayer;
                    break;
                }

                if (itsATie(board)) {
                    winner = "It's a Tie";
                    break;
                }
            }

            System.out.println(winner);

            System.out.println("Do you want to play another game? y/n");
            replay = keyboard.nextLine();
        }

    }

    public static void initBoard() {
        // fills up the board with blanks
        for (int r = 0; r < 3; r++)
            for (int c = 0; c < 3; c++)
                board[r][c] = ' ';
    }

    public static void displayBoard() {
        System.out.println("  0  " + board[0][0] + "| " + board[0][1] + " |" + board[0][2]);
        System.out.println("    --+---+--");
        System.out.println("  1  " + board[1][0] + "| " + board[1][1] + " |" + board[1][2]);
        System.out.println("    --+---+--");
        System.out.println("  2  " + board[2][0] + "| " + board[2][1] + " |" + board[2][2]);
        System.out.println("    0   1   2 ");
    }

    public static char playerTurn(char currentPlayer) {
        if (currentPlayer == 'X') {
            currentPlayer = 'O';
        } else {
            currentPlayer = 'X';
        }
        return currentPlayer;
    }

    public static Boolean winCondition(char[][] board) {
        boolean winCon = false;
        if ((board[0][0] != ' ') && (board[0][0] == board[0][1]) && (board[0][1] == board[0][2])) {
            winCon = true;
        }
        if ((board[1][0] != ' ') && (board[1][0] == board[1][1]) && (board[1][1] == board[1][2])) {
            winCon = true;
        }
        if ((board[2][0] != ' ') && (board[2][0] == board[2][1]) && (board[2][1] == board[2][2])) {
            winCon = true;
        }
        if ((board[0][0] != ' ') && (board[0][0] == board[1][0]) && (board[1][0] == board[2][0])) {
            winCon = true;
        }
        if ((board[0][1] != ' ') && (board[0][1] == board[1][1]) && (board[1][1] == board[2][1])) {
            winCon = true;
        }
        if ((board[0][2] != ' ') && (board[0][2] == board[1][2]) && (board[1][2] == board[2][2])) {
            winCon = true;
        }
        if ((board[0][0] != ' ') && (board[0][0] == board[1][1]) && (board[1][1] == board[2][2])) {
            winCon = true;
        }
        if ((board[2][0] != ' ') && (board[2][0] == board[1][1]) && (board[1][1] == board[0][2])) {
            winCon = true;
        }
        return winCon;
    }

    public static boolean itsATie(char[][] board) {
        StringBuilder arrayString = new StringBuilder();
        for (int i = 0; i < board.length; i++) {
            for (int j = 0; j < board[i].length; j++) {
                arrayString.append(board[i][j]);
            }
        }
        boolean itsATie;
        if (arrayString.toString().contains(" ")) {
            itsATie = false;
        } else {
            itsATie = true;
        }
        return itsATie;
    }
}