package chapter02;

public class lesson02 {

    public static void main(String[] args) {
        //練習2-1
        int x = 5;
        int y = 10;
        int m = x + y;
        String ans = "x+yは" + (x + y); 
        String msg = "x+yは" + m;
        System.out.println(ans);
        System.out.println(msg);

        //練習2-3
        System.out.println("ようこそ占いの館へ");
        System.out.print("あなたの名前を入力してください＞");
        String name = new java.util.Scanner(System.in).nextLine();
        System.out.print("あなたの年齢を入力してください＞");
        String ageString = new java.util.Scanner(System.in).nextLine();
        int age = Integer.parseInt(ageString);
        int fortune = new java.util.Random().nextInt(4);
        fortune++;
        System.out.println("占いの結果が出ました！");
        System.out.println(age + "歳の" + name + "さん、あなたの運気番号は" + fortune + "です");
        System.out.println("1：大吉 2：中吉 3：吉 4：凶");
    }
}
