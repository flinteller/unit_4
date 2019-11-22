package com.company;

public class StringProblems {

    public static String printTheLetters(String str){
        String list = "";
        for(int a = 0; a < str.length(); a++){
            list += str.substring(a , a + 1) + "\n";
        }
        return list;
    }

    public static String everyOtherLetter(String str){
        String new_word = "";
        for(int a = 0; a < str.length(); a+=2){
            new_word += str.substring(a , a + 1);
        }
        return new_word;
    }

    public static int countTheVowels(String str){
        int vowel_count = 0;
        str = str.toLowerCase();
        for(int a = 0; a < str.length(); a++){
            if(str.substring(a, a + 1).equals("a") || str.substring(a, a + 1).equals("e") || str.substring(a, a + 1).equals("i") || str.substring(a, a + 1).equals("o") || str.substring(a, a + 1).equals("u")){
                vowel_count++;
            }
        }
        return vowel_count;
    }

    public static String differentStrings(String str1, String str2) {
        int a = 0;
        int num = 0;

        String shorter = "";
        if(str1.length() > str2.length())
            shorter = str2;

        else if(str1.length() < str2.length())
            shorter = str1;

        if (str1.equals(str2)) {
            return str1 + " and " + str2 + " are the same";
        } else {
            while (a < shorter.length()) {
                if(str1.substring(a, a + 1).equals(str2.substring(a, a + 1))){
                    a++;
                    num = a;
                }
                else {
                    num = a;
                    break;
                }
            }
            return str1 + " and " + str2 + " are not the same. They differ at letter number " + (num + 1);
        }
    }

    public static boolean isPalindrome(String user_str) {
        String str = user_str.toLowerCase();
        String str_backwards = "";
        for(int a = str.length() - 1; a >= 0; a--){
            str_backwards += str.substring(a , a + 1) ;

        }

        if(str.equals(str_backwards)){
            return true;
        }
        else{
            return false;
        }
    }



    public static void main(String[] args){

        System.out.println(printTheLetters("Pizza"));



        System.out.println(everyOtherLetter("Computer Science"));



        System.out.println(countTheVowels("COMPUTER science"));



        System.out.println(differentStrings("Pizza", "Pizzas"));



        System.out.println(isPalindrome("racecar"));



    }
}
