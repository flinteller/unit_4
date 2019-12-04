package com.company;
import java.util.Scanner;

public class NestedLoops {
    static Scanner scan = new Scanner(System.in);

    public static String xSquare(){
        String str = "";

        for(int start1 = 1; start1 <= 5; start1++){
            for(int start2 = 1; start2 <= 5; start2++){
                str += "X";
            }
            str += "\n";
        }
        return str;
    }

    public static String xSquare2(int num){
        String str = "";
        for(int start1 = 1; start1 <= num; start1++){
            for(int start2 = 1; start2 <= num; start2++){
                str += "X";
            }
            str += "\n";
        }

        return str;
    }

    public static String flippedTriangle(int num){
        String str = "";

        for(int start1 = num; start1 >= 1; start1--) {
            for(int start2 = 1; start2 <= start1; start2++){
                str += "*";
            }
            str += "\n";

        }
        return str;
    }

    public static String multiplicationTable(){
        String table = "";

        for(int rows = 1; rows <= 9; rows++){

            for(int multiplier = 1; multiplier<= 9; multiplier++){

                if(rows * multiplier <= 9)
                    table += "  ";
                else
                    table += " ";

                table += multiplier * rows;

            }


            table += "\n";
        }

        return table;
    }

    public static void main(String[] args){

        //System.out.println(xSquare());

        //System.out.println("Enter number of rows of Xs: ");
        //int num = scan.nextInt();

        //System.out.println(xSquare2(num));

        //System.out.println("Enter number of *s in first row: ");
        //int num2 = scan.nextInt();

        //System.out.println(flippedTriangle(num2));

        System.out.println(multiplicationTable());
    }
}
