package jp.ac.uryukyu.ie.e205710_e215749;

import java.util.Random;
/**
 * ランダムで０−２の数字を生成するクラス
 * @author 那覇
 * @return ランダム生成した数字
 */
class GetPc {
    /**
     * Randomをインポートして３未満の数字をランダムで生成（０〜２）
     * @return 数字
     */
    int getPc(){
        Random random = new Random();
        int handNumber = random.nextInt(3);
        return handNumber;
    }
     

        
}