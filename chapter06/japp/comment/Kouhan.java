package chapter06.japp.comment;

public class Kouhan {
    public static void callDesa() {
        System.out.println("えぇい、こしゃくな。くせものだ！であえい！");
    }

    public static void showMondokoro() throws Exception {
        System.out.println("飛車さん、角さん。もういいでしょう。");
        System.out.println("この紋所が目にはいらぬか！");
        //3秒間の待ち時間メソッド呼び出し
        Thread.sleep(3000);
        Zenhan.doTogame(); 
    }
}
