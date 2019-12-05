package com.company;
import java.util.Scanner;

public class FizzBuzz {
    static Scanner scan = new Scanner(System.in);
    public static String fizzBuzz(int num){
        String list = "";
        for(int start = 1; start <= num; start++){
            if(start % 3 == 0 && start % 5 == 0)
                list += "FizzBuzz ";
            else if(start % 5 == 0)
                list += "Buzz ";
            else if(start % 3 == 0)
                list += "Fizz ";
            else
                list += start + " ";

            if(start % 20 == 0)
                list += "\n";
        }
        return list;
    }

    public static void main(String[] args){
        System.out.println("Enter the number you want to count to: ");
        int num = scan.nextInt();
        System.out.println(fizzBuzz(num));
    }
}
