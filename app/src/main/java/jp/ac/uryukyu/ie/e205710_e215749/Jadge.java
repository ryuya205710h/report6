package jp.ac.uryukyu.ie.e205710_e215749;

/**
 * UserとPCが出した手で勝敗の判定
 */
public class Jadge {
    /**
     * 判定メソッド。
     * @param user ユーザー。
     * @param pc　対戦時の相手。
     * @return　勝ち負けあいこの文字を返す
     */
    public String jugde(int user, int pc){
        String result ="";
        String w = "勝ち";
        String d = "あいこ";
        String l = "負け";
        if((user == 0 && pc ==1)||(user == 1 && pc == 2)||(user == 2 && pc == 0)){
            result = w;
        }else if((user == 0 && pc == 0)||(user == 1 && pc == 1)||(user == 2 && pc == 2)){
            result = d;
        }else if((user == 0 && pc == 2)||(user == 1 && pc == 0)||(user == 2 && pc == 1)){
            result = l;
        }
        return result;
    }
}