package chapter03;

public class Main {
    public static void main(String[] args) {
        /*
        文字列の比較
        文字列型の変数.equals(比較相手の文字列) {}
        if (str.equals("スッキリ")) {}
        */
        
        System.out.println("あなたに運勢を占います");
        int fortune = new java.util.Random().nextInt(5) + 1;
        /*
        switchの条件式は(変数名)
        caseの後ろに -> {処理内容}
        dehalt -> {条件に合致しない時の処理内容}
        */
        switch (fortune) {
            case 1, 2 -> {
                System.out.println("いいね!");
            } 
            case 3 -> {
                System.out.println("普通です!");
            } 
            case 4, 5 -> {
                System.out.println("うーん...!");
            } 
        }

        /*
        繰り返しの中断
        break文（繰り返し自体を中断）
        i == 3ならfor文を中断する
        */
        for (int i = 1; i < 10; i++) {
            if (i == 3) {
                break;
            }
            System.out.println(i);
        }

        /*
        continue文（今回の周だけ中断し、次の周へ）
        i == 3ならSystem.out.println(i);を処理せずi == 4...for文の続きをする
         */
        for (int i = 1; i < 10; i++) {
            if (i == 3) {
                continue;
            }
            System.out.println(i);
        }

    }
}
