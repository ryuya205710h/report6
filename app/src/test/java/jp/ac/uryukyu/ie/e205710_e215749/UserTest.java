package jp.ac.uryukyu.ie.e205710_e215749;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;
import java.util.Scanner;

class UserTest {
    @Test 
    public void User(){
        System.out.println("※エラー※0~2を記入してね");
        Scanner write = new Scanner (System.in);
        assertEquals(write.nextInt(3), "※エラー※0~2を記入してね");
        write.close();
    }


}
