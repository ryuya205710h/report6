package jp.ac.uryukyu.ie.e205710_e215749;
/**
 * ジャンケンを5回繰り返し、勝敗を決めるクラス
 * @author 那覇
 */
public class FiveBatlle {
    /**
     * 勝ち、負け、あいこの回数をカウントするための初期値
     * Jadge.javaから受け取ったString型の結果と比較するための文字列
     */
    public void fiveBatlle(){
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
                System.out.println("結果:勝ちだよ〜！");
            }else if(j.equals(l)){
                p += 1;
                System.out.println("結果:負けだよ〜！");
            }else if(j.equals(d)){
                a += 1;
                System.out.println("結果:あいこだよ〜！");
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
}