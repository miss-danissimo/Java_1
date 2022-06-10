package HW_4;

import java.util.Random;
import java.util.Scanner;

public class TicTacToe {

    private static final int SIZE = 5;
    private static final int WIN = 4;

    private static final char DOT_EMPTY = '•';
    private static final char DOT_X = 'X';
    private static final char DOT_O = 'O';

    private static char[][] map;

    public static void main(String[] args) {
        initMap();
        printMap();
        while (true) {
            humanTurn();
            printMap();
            if (checkRowColomn(DOT_X)){
                System.out.println("Человек победил!");
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
            computerTurn();
            printMap();
            if (checkRowColomn(DOT_O)){
                System.out.println("Компьютер победил!");
                break;
            }
            if (isMapFull()){
                System.out.println("Ничья!");
                break;
            }
        }

        isMapFull();
    }

    private static void initMap() {
        map = new char[SIZE][SIZE];
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                map[i][j] = DOT_EMPTY;
            }

        }
    }

    private static void printMap() {
        for (int i = 0; i <= SIZE; i++) {
            System.out.print(i + " ");
        }
        System.out.println();
        for (int i = 0; i < SIZE; i++) {
            System.out.print((i + 1) + " ");
            for (int j = 0; j < SIZE; j++) {
                System.out.print(map[i][j] + " ");
            }
            System.out.println();
        }
        System.out.println();
    }

    private static void humanTurn() {
        int x = 0;
        int y = 0;
        Scanner scanner = new Scanner(System.in);
        do {
            System.out.println("Введите координаты в формате X Y");
            if (scanner.hasNextInt()) {
                x = scanner.nextInt() - 1;
            } else {
                System.out.println("Координаты должны быть числом!");
                scanner.nextLine();
            }
            if (scanner.hasNextInt()) {
                y = scanner.nextInt() - 1;
            } else {
                System.out.println("Координаты должны быть числом!");
                scanner.nextLine();
            }

            if (x < 0 || x >= SIZE || y < 0 || y >= SIZE) {
                System.out.println("Данные введены некорректно!");
            } else if (map[x][y] != DOT_EMPTY) {
                System.out.println("Клетка уже занята!");
            } else {
                break;
            }
        } while (true);
        map[x][y] = DOT_X;
    }

    private static void computerTurn() {
        int x;
        int y;
        Random random = new Random();

        do {
            x = random.nextInt(SIZE);
            y = random.nextInt(SIZE);
        }while (map[x][y] != DOT_EMPTY);
        map[x][y] = DOT_O;
    }

  /*  private static boolean isWin(char symbol) {
        if (map[0][0] == symbol && map[0][1] == symbol && map[0][2] == symbol) return true;
        if (map[1][0] == symbol && map[1][1] == symbol && map[1][2] == symbol) return true;
        if (map[2][0] == symbol && map[2][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][0] == symbol && map[2][0] == symbol) return true;
        if (map[0][1] == symbol && map[1][1] == symbol && map[2][1] == symbol) return true;
        if (map[0][2] == symbol && map[1][2] == symbol && map[2][2] == symbol) return true;
        if (map[0][0] == symbol && map[1][1] == symbol && map[2][2] == symbol) return true;
        if (map[0][2] == symbol && map[1][1] == symbol && map[2][0] == symbol) return true;
        return false;
    } */


    private static boolean checkRowColomn(char symbol) {
        for (int i = 0; i < WIN; i++) {
            int row = 0;
            int column = 0;
            for (int j = 0; j < WIN; j++) {
                row = (map[i][j] == symbol) ? row + 1 : 0;
                column = (map[j][i] == symbol) ? column + 1 : 0;
                if (row == WIN || column == WIN) {
                    return true;
                }
            }
        }
        return false;
    }

    private static boolean checkDiagonal(char symbol) {
        boolean toright, toleft;
        toright = true;
        toleft = true;
        for (int i=0; i < WIN; i++) {
            toright = (map[i][i] == symbol);
            toleft = (map[WIN-i-1][i] == symbol);
        }

        if (toright || toleft) return true;

        return false;
    }



    private static boolean isMapFull() {
        for (int i = 0; i < SIZE; i++) {
            for (int j = 0; j < SIZE; j++) {
                if (map[i][j] == DOT_EMPTY){
                    return false;
                }
            }

        }
        return true;
    }
}
