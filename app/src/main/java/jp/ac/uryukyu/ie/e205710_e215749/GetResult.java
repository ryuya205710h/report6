package jp.ac.uryukyu.ie.e205710_e215749;
/**
 * ジャンケンの結果を表示するクラス。
 */
public class GetResult {
    /**
     * UserとPCのジャンケンの結果をを出力するメソッド。
     * @param user ユーザー。
     * @param pc　対戦時の相手。
     * @param result ジャンケンの結果を返す
     */
    public static void Result(int user, int pc, String result){
        String[] janken = {"グー","チョキ","パー"};
        //結果を表示する
        System.out.println("あなた:" + janken[user] + "コンピュータ:" +janken[pc]);
        System.out.println("結果:"+ result+"だよ〜！");
    }
}