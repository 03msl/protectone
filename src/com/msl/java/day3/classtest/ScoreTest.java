package com.msl.java.day3.classtest;


import java.util.Scanner;
import java.util.Vector;

public class ScoreTest {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int maxScore = 0;
        Vector v = new Vector();
        char level;
        for(;;){
            System.out.println("请输入学生的成绩");
            int score = scan.nextInt();
            if(score < 0) {
                break;
            }
            if(score > 100 ){
                System.out.println("输入的数据非法，请重新输入");
                continue;
            }
              Integer inScore = score;
              v.addElement(inScore);
              if(maxScore < score){
                  maxScore = score;
              }

        }
        for(int i = 0;i < v.size();i++){
            Object obj = v.elementAt(i);
            Integer objj =(Integer)obj;
            int score = objj;
            if(maxScore - score <= 10){
                level = 'A';
            }else if(maxScore - score <= 20){
                level = 'B';
            }else if(maxScore -score <= 30){
                level = 'C';
            }else{
                level = 'D';
            }
            System.out.println("student-"+ i +"score is "+score+",level "+level);
        }

    }
}
