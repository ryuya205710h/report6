package jp.ac.uryukyu.ie.e205710_e215749;

import java.util.Scanner;

/**
 * ユーザーがジャンケンで出す手を選ぶクラス。
 */
public class User{
    /**
     * ユーザがジャンケンの手を記入するメソッド。
     * @return 0,1,2の数字を返す。
     */
    public int getUser(){
        Scanner write = new Scanner (System.in);

        while(true){
            System.out.println("あなたのジャンケンの手を入力してください。");
            System.out.println("(グー:0, チョキ:1, パー:2) --> ");
            if(write.hasNextInt()){
                int number = write.nextInt();
                if(number<=-1||number>=3){
                    System.out.println("※エラー※0~2を記入してね");
                    continue;
                }else{
                    return number;
                }
            }else{
                System.out.println("※エラー※入力できるのは０~2の数字のみだよ！！");
                write.next();
            }
        }
    }



}