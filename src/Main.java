package com.company;

import java.util.Dictionary;
import java.util.Enumeration;
import java.util.Hashtable;
import java.util.Scanner;

public class Main {

    //for reference
    /*
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_BLACK = "\u001B[30m";
    public static final String ANSI_RED = "\u001B[31m";
    public static final String ANSI_GREEN = "\u001B[32m";
    public static final String ANSI_YELLOW = "\u001B[33m";
    public static final String ANSI_BLUE = "\u001B[34m";
    public static final String ANSI_PURPLE = "\u001B[35m";
    public static final String ANSI_CYAN = "\u001B[36m";
    public static final String ANSI_WHITE = "\u001B[37m";

    public static final String ANSI_BLACK_BACKGROUND = "\u001B[40m";
    public static final String ANSI_RED_BACKGROUND = "\u001B[41m";
    public static final String ANSI_GREEN_BACKGROUND = "\u001B[42m";
    public static final String ANSI_YELLOW_BACKGROUND = "\u001B[43m";
    public static final String ANSI_BLUE_BACKGROUND = "\u001B[44m";
    public static final String ANSI_PURPLE_BACKGROUND = "\u001B[45m";
    public static final String ANSI_CYAN_BACKGROUND = "\u001B[46m";
    public static final String ANSI_WHITE_BACKGROUND = "\u001B[47m";
     */
    public static void main(String[] args) {
//	    String board = "_________________" +
//                       "| | | | | | | | |" +
//                       "| | | | | | | | |" +
//                       "| | | | | | | | |" +
//                       "| | | | | | | | |" +
//                       "| | | | | | | | |" +
//                       "| | | | | | | | |" +
//                       "| | | | | | | | |" +
//                       "| | | | | | | | |" +
//                       "_________________";
//	    String boardEdge = "_________________";
//	    String knight = "N";
//        String  = "N";
//        String knight = "N";
//        String knight = "N";
//        String knight = "N";
//        char[] pieces = {'R', 'N', 'B', 'Q', 'K', 'B'}
        char[][] whiteBoard = new char[][] {
                {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'R', 'N', 'B', 'Q', 'K', 'B', 'N', 'R'}
        };

        char[][] blackBoard = new char[][] {
                {'R', 'N', 'B', 'K', 'Q', 'B', 'N', 'R'},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {' ', ' ', ' ', ' ', ' ', ' ', ' ', ' '},
                {'P', 'P', 'P', 'P', 'P', 'P', 'P', 'P'},
                {'R', 'N', 'B', 'K', 'Q', 'B', 'N', 'R'}
        };

        Scanner sc = new Scanner(System.in);
        boolean userSide = false; // false if red, true if white
        System.out.println("Welcome to CommandLineChess!\n");
        System.out.print("Which side would you like to play as white(w) or red(r)? ");
        String side = sc.nextLine();

        userSide = side.equals("w");
        char[][] board = userSide ? whiteBoard : blackBoard;
        System.out.println("\nLet the game begin!\nExamples move : \'e2 e4\'\n");

        printBoard(board);

        String move = "";
        do {
            System.out.print("\nWhat is your move?: ");
            move = sc.nextLine();
            if (move.equals("quit")) break;
            if (move.length() == 5) {
                String moveFrom = move.substring(0,2);
                String moveTo = move.substring(3,5);

            } else {
                System.out.println("Invalid move, please try again (example move: \'e2 e4\')");
            }
        } while(!move.equals("quit"));

//        System.out.print("_________________");
//        for (char[] row : whiteBoard) {
//            System.out.print("\n|");
//            for (char c : row) {
//                System.out.print(c + "|");
//            }
//        }
//        System.out.print("\n_________________");
        // print board
        // check who's turn it is, if users turn, allow them to move, if bots turn, move bot
        // print changes
        // repeat until checkmate

//        Dictionary<Integer, String> pieceCodes = new Hashtable<>();
//
//        System.out.println("\u001B[45mERROR");
//        System.out.println("Styfff");
    }

    public static void printBoard(char[][] board) {
        System.out.print("      A     B     C     D     E     F     G     H   \n");
        System.out.print("\n   #################################################\n");
        StringBuffer sb = new StringBuffer();
        for (int r = 0; r < board.length; r++) {
            sb.setLength(0);
            sb.append("   #     #     #     #     #     #     #     #     #\n");
            sb.append(8 - r + "  #  ");
            for (int c = 0; c < board[r].length; c++) {
                sb.append(board[r][c] + "  #  ");
            }
            sb.append(8 - r);
            sb.append("\n   #     #     #     #     #     #     #     #     #\n");
            sb.append("   #################################################\n");
            System.out.print(sb.toString());
        }
        System.out.print("\n      A     B     C     D     E     F     G     H   \n");
    }
}
