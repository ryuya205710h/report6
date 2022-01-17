package jp.ac.uryukyu.ie.e205710_e215749;

public class GetResult {
   
    public static void Result(int user, int pc, String result){
        String[] janken = {"グー","チョキ","パー"};
        //結果を表示する
        System.out.println("あなた:" + janken[user] + "　コンピュータ:" +janken[pc]);
        System.out.println("結果:"+ result+"だよ〜！");
    }
}