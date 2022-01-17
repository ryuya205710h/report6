package jp.ac.uryukyu.ie.e205710_e215749;

public class Jadge {
    public static String jugde(int user, int pc){//ユーザが入力した数字とPCが生成した数字を比べる
        String result ="";

        if((user == 0 && pc ==1)||(user == 1 && pc == 2)||(user == 2 && pc == 0)){
            result ="勝ち";//勝ちのパターン
        }else if((user == 0 && pc == 0)||(user == 1 && pc == 1)||(user == 2 && pc == 2)){
            result ="あいこ";//あいこのパターン
        }else if((user == 0 && pc == 2)||(user == 1 && pc == 0)||(user == 2 && pc == 1)){
            result ="負け";//負けのパターン
        }
        return result;
    }
}