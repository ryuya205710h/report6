package jp.ac.uryukyu.ie.e205710_e215749;

public class FiveBatlleTest {
    public static void fiveBatlle(){
        System.out.println("ジャンケン５回戦！");
        int u = 0;
        int p = 0;
        int a = 0;
        String w = "勝ち";
        String l = "負け";
        String d = "あいこ";
        GetPc pc = new GetPc();
        User user = new User();
        GetResult result = new GetResult();
        Jadge jadge = new Jadge();
        for(int i = 0; i <= 4; i += 1){
            String j = jadge.jugde(user.getUser(),pc.getPc());
            if(j.equals(w)){
                u += 1;
                System.out.println("あなた：" + user.getUser() + "　PC:" + pc.getPc() + "　あなたの勝ち！");
            }else if(j.equals(l)){
                p += 1;
                System.out.println("あなた：" + user.getUser() + "　PC:" + pc.getPc() + "　PCの勝ち！");
            }else if(j.equals(d)){
                a += 1;
                System.out.println("あなた：" + user.getUser() + "　PC:" + pc.getPc() + "　あいこ！");
            }else{
            }
        }
        System.out.println("最終結果！");
        System.out.println("あなた:" + u + "勝");
        System.out.println("PC:" + p + "勝");
        System.out.println("あいこ:" + a + "回");
        if(u > p){
            System.out.println("あなたの勝ち！");
        }else if(u < p){
            System.out.println("PCの勝ち！");
        }else{
            System.out.println("引き分け！");
        }
    }
    public static void main(String[] args) {
        fiveBatlle();
    }
}