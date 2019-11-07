package com.company;


import java.io.IOException;
import java.util.Scanner;

public class Main {
    public static final int MERCEDES = 0;
    public static final int AUDI = 1;
    public static final int BMW = 2;
    public static final int LEXUS = 3;
    public static final int SMALL = 0;
    public static final int MEDIUM = 1;
    public static final int LARGE = 2;
    public static final int CAR_TYPE_ROW = 4;
    public static final int CAR_TYPE_COL = 3;
    public static final int CAR_ROW = 12;
    public static final int CAR_COL = 3;

    public static void main(String[] args) throws IOException {
        StartMenu menu = new StartMenu();
//        carQuiz();
    }

    static void carQuiz(){
        int counter = 0, carType = -1, carBrand = -1, carTypeAndBrand, carSize = -1;
        String ans, car, carCompany = "";
        Scanner in = new Scanner(System.in);
        // write your code here
        //initialize 2D array for car type and car company
        int[][] carTypeTable = new int[CAR_TYPE_ROW][CAR_TYPE_COL];
        for (int i = 0; i < CAR_TYPE_ROW; i++) {
            for (int j = 0; j < CAR_TYPE_COL; j++) {
                carTypeTable[i][j] = counter;
                counter++;
            }
        }
        //initialize 2D array of cars
        String [][] carTable = makeCarTable();

        //Ask the user the questions
        System.out.println("Would you like a A)2 door B)4 door sedan C)SUV:");
        ans = in.next();

        switch (ans.toUpperCase()){
            case "A":
                carType = 0;
                break;
            case "B":
                carType = 1;
                break;
            case "C":
                carType = 2;
                break;
            default:
                break;
        }
        System.out.println("A)Mercedes B)Audi C)BMW D)Lexus: ");
        ans = in.next();
        switch (ans.toUpperCase()){
            case "A":
                carBrand = MERCEDES;
                carCompany = "Mercedes";
                break;
            case "B":
                carBrand = AUDI;
                carCompany = "Audi";
                break;
            case "C":
                carBrand = BMW;
                carCompany = "BMW";
                break;
            case "D":
                carBrand = LEXUS;
                carCompany = "Lexus";
                break;
            default:
                break;
        }

        carTypeAndBrand = carTypeTable[carBrand][carType];

        System.out.println("A)Small Car B)Medium Car C)Large Car: ");
        ans = in.next();
        switch (ans.toUpperCase()){
            case "A":
                carSize = SMALL;
                break;
            case "B":
                carSize = MEDIUM;
                break;
            case "C":
                carSize = LARGE;
                break;
            default:
                break;
        }

        car = carTable[carTypeAndBrand][carSize];

        System.out.println("Your car is the " + carCompany + " " + car);
    }


    static void printTable(String[][] table, int row, int col) {
        for (int i = 0; i <row; i++) {
            for (int j = 0; j < col; j++) {
                System.out.print(table[i][j] + " ");
            }
            System.out.println();
        }
    }

    static void setItem(String[][] table, int row, int col, String item){
        table[row][col] = item;
    }

    static String[][] makeCarTable(){
        String [][] carTable = new String[CAR_ROW][CAR_COL];
        setItem(carTable, 0, 0, "AMG C63S");
        setItem(carTable, 0, 1, "AMG E53");
        setItem(carTable, 0, 2, "AMG GT R");
        setItem(carTable, 1, 0, "A-Class");
        setItem(carTable, 1, 1, "E-Class");
        setItem(carTable, 1, 2, "S-Class");
        setItem(carTable, 2, 0, "GLC");
        setItem(carTable, 2, 1, "GLE");
        setItem(carTable, 2, 2, "G-Class");
        setItem(carTable, 3, 0, "TT RS");
        setItem(carTable, 3, 1, "RS 5 Coupe");
        setItem(carTable, 3, 2, "R8");
        setItem(carTable, 4, 0, "S3");
        setItem(carTable, 4, 1, "RS 5 Sedan");
        setItem(carTable, 4, 2, "S8");
        setItem(carTable, 5, 0, "Q3");
        setItem(carTable, 5, 1, "SQ5");
        setItem(carTable, 5, 2, "Q8");
        setItem(carTable, 6, 0, "M2");
        setItem(carTable, 6, 1, "M4");
        setItem(carTable, 6, 2, "M8");
        setItem(carTable, 7, 0, "3 Series");
        setItem(carTable, 7, 1, "5 Series");
        setItem(carTable, 7, 2, "7 Series");
        setItem(carTable, 8, 0, "X2");
        setItem(carTable, 8, 1, "X4");
        setItem(carTable, 8, 2, "X7");
        setItem(carTable, 9, 0, "RC F");
        setItem(carTable, 9, 1, "LC");
        setItem(carTable, 9, 2, "");
        setItem(carTable, 10, 0, "IS");
        setItem(carTable, 10, 1, "ES");
        setItem(carTable, 10, 2, "LS");
        setItem(carTable, 11, 0, "NX");
        setItem(carTable, 11, 1, "RX");
        setItem(carTable, 11, 2, "LX");

        return carTable;

    }


}







