package jp.ac.uryukyu.ie.e205710_e215749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Random;
public class GetPcTest {//Randomをインポートして３未満の数字をランダムで生成（０〜２）
    @Test
    public static int getPc(){
        Random random = new Random();
        int handNumber = random.nextInt(3);
        return handNumber;//ランダムで生成された数字を返す
    }
    public void test(){
        int a = 3;
        int b = -1;

        assertNotEquals(getPc(), a);
        assertNotEquals(getPc(), b);
    }
}