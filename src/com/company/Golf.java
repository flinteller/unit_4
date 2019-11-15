package com.company;
import java.io.FileNotFoundException;
import java.util.Scanner;
import java.io.File;

public class Golf {

    public static String findScore()  {
        File file = new File("C:\\Users\\ellerfl\\IdeaProjects\\unit_4\\src\\com\\company\\golf_scores.txt");
        Scanner scan = null;
        try {
            scan = new Scanner(file);
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        }

        String score;
        String score_list = "";

        int par_total = 0;
        int hit_total = 0;

        for(int count = 1; count <= 4; count++){
            String line = scan.nextLine();

            int par = Integer.parseInt(line.substring(0, 1));
            int hit = Integer.parseInt(line.substring(2));


            if(hit == par - 1){
                score = "birdie\n";
            }
            else if(hit == par - 2){
                score = "eagle\n";
            }
            else if(hit == par + 1){
                score = "bogey\n";
            }
            else if(hit == par + 2){
                score = "double bogey\n";
            }
            else if (hit == par){
                score = "par\n";
            }
            else {
                if (hit < par){
                    score = par - hit + " under par\n";
                }
                else{
                    score = hit - par + " over par\n";
                }
            }
            score_list += score;
            par_total += par;
            hit_total += hit;

        }
        String last_line;

        if(hit_total < par_total){
            last_line = par_total - hit_total + " under par";
        }
        else if(hit_total > par_total){
            last_line = hit_total - par_total + " over par";
        }
        else{
            last_line = "par";
        }



        return score_list + last_line;
    }

    public static void main(String[] args){
        System.out.println(findScore());
    }
}
