package jp.ac.uryukyu.ie.e205710_e215749;
/**
 * ランダムで０−２の数字を生成するクラス
 * @author 那覇
 * @return ランダム生成した数字
 */
import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
public class GetPc {//Randomをインポートして３未満の数字をランダムで生成（０〜２）
    public static int getPc(){
        Random random = new Random();
        int handNumber = random.nextInt(3);
        return handNumber;//ランダムで生成された数字を返す
    }     

    @Test
    public void test(){
        int a = 3;
        int b = -1;

        assertNotEquals(getPc(), a);
        assertNotEquals(getPc(), b);
    }

}