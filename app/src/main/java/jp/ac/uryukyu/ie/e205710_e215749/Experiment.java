package jp.ac.uryukyu.ie.e205710_e215749;

import java.util.Scanner;

/** 
 *ゲーム開始前の説明（ジャンケンゲーム）
 *Enter keyを押して読み進めていく
 *5回戦であること、あいこの際も１試合分になることを説明
 */
public class Experiment {
    /**
     *ゲームの説明メソッド。
     */
    public void experiment(){
        Scanner write = new Scanner (System.in);
        System.out.println("これからPCとジャンケンゲーム5回戦を行ってもらうね！(Enter☞)");
        write.nextLine();
        System.out.println("あいこの場合でも一回戦分となるよ〜(Enter☞)");
        write.nextLine();
        System.out.println("それじゃあ、準備はいいかな？？(OKならEnterキーを押してゲームスタート！)");
        write.nextLine();
    }
    
}
