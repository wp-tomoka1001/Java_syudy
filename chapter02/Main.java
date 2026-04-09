package chapter02;

public class Main {
    public static void main(String[] args) {
        /*命令実行の文（画面に表示させる）
        呼び出す命令の名前（引数）;
        */
        String name = "すがわら";
        String msg;
        msg = name + "さん、こんにちは";
        System.out.println(msg);

        /*改行せずに画面に文字を表示させる
        System.out.print(①);
        */
        String firstName = "すがわら";
        System.out.print("私の名前は");
        System.out.print(firstName);
        System.out.print("です");

        /*２つの値を比較して大きい方の数理を代入する
        int m = Math.max(①, ②);
        */
        int a = 5;
        int b = 3;
        int m = Math.max(a, b);
        System.out.println("比較実験" + a + "と" + b + "とで大きいほうは・・・" + m);

        /*文字列を整数に変換する
        int n = Integer.parseInt(①);
        */
        String age = "31";
        int n = Integer.parseInt(age);
        System.out.println("あなたは来年、" + (n + 1) + "歳になりますね");

        /*乱数を発生させる
        int r = new java.util.Random().nextInt(①);
        */
        int r = new java.util.Random().nextInt(90);
        System.out.println("あなたはたぶん、" + r + "歳ですね?");

        /*キーボードから1行の文字列の入力を受け付ける
        String s = new java.util.Scanner(System.in).nextline();
        キーボードから1つに整数の入力を受け付ける
        int input = new java.util.Scanner(System.in).nextInt();
        */
        System.out.println("あなたの名前を入力してください。");
        String s = new java.util.Scanner(System.in).nextLine();
        System.out.println("あなたの年齢を入力してください。");
        int input = new java.util.Scanner(System.in).nextInt();
        System.out.println("ようこそ、" + input + "歳の" + s + "さん");
    }
}
