package jp.ac.uryukyu.ie.e205710_e215749;
/**
 * ジャンケンを5回繰り返し、勝敗を決めるクラス
 * @author 那覇
 */
public class FiveBatlle {
    public static void fiveBatlle(){
        System.out.println("ジャンケン５回戦！");
        /**
         * 勝ち、負け、あいこの回数をカウントするための初期値
         * Jadge.javaから受け取ったString型の結果と比較するための文字列
         */
        int u = 0;
        int p = 0;
        int a = 0;
        String w = "勝ち";
        String l = "負け";
        String d = "あいこ";
        GetPc pc = new GetPc();
        User user = new User();
        Jadge jadge = new Jadge();
        /**
         * ジャンケンし、勝敗によってプラスしていく
         * それを5回繰り返す
         */
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
        /**
         * 最終的な結果をここで表示
         */
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
}