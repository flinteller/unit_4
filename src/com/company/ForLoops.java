package com.company;

public class ForLoops {

    public static String printingHashTags(int count){
        String tags = "";
        for(int num = 1; num <= count; num++){
            tags += "#";
        }
        return tags;
    }

    public static String countDown(int num1 , int num2){
        String list = "";
        if(num1 < num2){
            for(int count = num2; count >= num1; count--){
                list += count + " ";
            }
        }
        else{
            list = " ";
        }
        return list;
    }

    public static String countDown2(int num1 , int num2) {
        String list = "";
        if (num1 < num2) {
            for (int count = num2; count >= num1; count--) {
                list += count + " ";
            }
        } else {
            for (int count = num1; count >= num2; count++) {
                list += count + " ";
            }
        }
        return list;
    }

    public static int sumNumbers(int num1, int num2){
        int total = 0;
        if(num1 < num2) {
            for (int count = num1; count <= num2; count++) {
                total += count;
            }
        }
        else if(num1 > num2){
            for (int count = num2; count <= num1; count++) {
                total += count;
            }
        }
        return total;
    }


    public static void main(String[] args){

        System.out.println(printingHashTags(7));

        System.out.println(countDown(0, 10));

        System.out.println(countDown2(10, 0));

        System.out.println(sumNumbers(10 , 10));


    }
}
