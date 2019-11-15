// Flint Eller
// 11/13/19
//This program simulates a game of piglet


package com.company;
import java.util.Scanner;

public class Piglet {

    public static String roll_check() {
        Scanner scan = new Scanner(System.in);
        System.out.println("Welcome to Piglet!");
        int user_total = 0;
        String answer = "y";

        while (answer.equals("y")) {
            int random_num = (int) (Math.random() * 6) + 1;
            if (random_num == 1) {
                user_total = 0;
                System.out.println("You rolled a 1!");
                break;
            } else {
                user_total += random_num;
                System.out.println("You rolled a " + random_num + "!");
                System.out.println("Play again? (y / n): ");
                answer = scan.next();
            }

        }
        return "You got " + user_total + " points.";
    }



    public static void main(String[] args){
        System.out.println(roll_check());

    }
}