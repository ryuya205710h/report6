package jp.ac.uryukyu.ie.e205710_e215749;

import java.util.Scanner;

public class User{
    public static int getUser(){
        Scanner write = new Scanner (System.in);//入力を受け付け

        while(true){
            System.out.println("あなたのジャンケンの手を入力してください。");
            System.out.print("(グー:0, チョキ:1, パー:2) --> ");
            if(write.hasNextInt()){
                int number = write.nextInt();
                if(number<=-1 || number>=3){//−１より小さくて、３以上の場合はエラーと表示
                    System.out.println("※エラー※0~2を記入してね");
                    continue;
                }else{//それ以外は返り値として保存
                    return number;
                }
            }else{
                System.out.println("※エラー※入力できるのは０~2の数字のみだよ！！");//数字以外を入力した場合はエラーを表示
                write.next();
            }
        }
    }
}