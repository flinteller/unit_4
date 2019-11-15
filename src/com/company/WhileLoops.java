package com.company;
import java.util.Scanner;

public class WhileLoops {

    static Scanner scan = new Scanner(System.in);

    public static String fromHereToThere(int start, int end){
        String numbers = "";
        if (start > end){
            return "Invalid input";
        }
        else{
            while(start <= end){
                numbers += start++ + " ";
            }
        }

        return numbers;
    }

    public static String factors(int num){
        String list = "";
        int count = 1;
        while(count <= num){
            if (num % count == 0) {
                list += count + " ";
            }
            count++;

        }
        return "The factors of " + num + " are: " + list;
    }

    public static String countPosAndNeg(){
        int pos_nums = 0;
        int neg_nums = 0;
        System.out.println("Enter a positive or negative number: ");
        int user_num = scan.nextInt();

        if(user_num > 0) {
            pos_nums++;
            while (user_num != 0) {
                System.out.println("Enter a positive or negative number: ");
                user_num = scan.nextInt();
                if (user_num > 0)
                    pos_nums++;
                else if(user_num < 0)
                    neg_nums++;
                else
                    break;

            }
        }
        else if(user_num < 0) {
            neg_nums++;
            while (user_num != 0) {
                System.out.println("Enter a positive or negative number: ");
                user_num = scan.nextInt();
                if (user_num > 0)
                    pos_nums++;
                else if(user_num < 0)
                    neg_nums++;
                else
                    break;


            }
        }
        else {
            pos_nums = 0;
            neg_nums = 0;
        }

        return "There were " + pos_nums + " positive and " + neg_nums + " negative numbers.";
    }

    public static String findMinAndMax(){
        int count = 1;
       int highest_num = Integer.MIN_VALUE;
       int lowest_num = Integer.MAX_VALUE;
        while(count <= 5) {
            System.out.println("Enter a number: ");
            int user_num = scan.nextInt();

            if(user_num > highest_num) {
                highest_num = user_num;
            }

            if(user_num < lowest_num){
                lowest_num = user_num;
            }

            count++;

        }
        return "Max value is: " + highest_num + "\nMin value is: " + lowest_num;
    }

    public static Double gradePoint(){
        System.out.println("Enter 7 letter grades (A, B, C, D, or F): ");
        int count = 1;
        double grade_total = 0;
        while(count <= 7){
            String grade = scan.next();
            count++;
            if(grade.equals("A"))
                grade_total += 4.0;
            else if (grade.equals("B"))
                grade_total += 3.0;
            else if (grade.equals("C"))
                grade_total += 2.0;
            else if (grade.equals("D"))
                grade_total += 1.0;
            else if (grade.equals("F"))
                grade_total += 0.0;
            else
                System.out.println("Input invalid");
        }
        double raw_gpa = grade_total / 7;
        int rounded_gpa = (int)((raw_gpa * 100) + .5);
        return rounded_gpa / 100.0;
    }

    public static void main(String[] args){

        System.out.println("Enter a number to start with: ");
        int start = scan.nextInt();
        System.out.println("Enter a number to end with: ");
        int end = scan.nextInt();
        System.out.println(fromHereToThere(start, end));

        System.out.println("Enter a number: ");
        int num = scan.nextInt();
        System.out.println(factors(num));

        System.out.println(countPosAndNeg());

        System.out.println(findMinAndMax());

        System.out.println(gradePoint());

    }


}
