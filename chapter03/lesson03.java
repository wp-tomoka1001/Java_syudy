package chapter03;

public class lesson03 {
    
    public static void main(String[] args) {
        /*練習3-1
        weight == 60
        (age1 + age2) * 2 > 60
        age % 2 == 1
        name.eruals("湊")
        */

        //練習3-3
        int isHungry = 1;
        String food = "おにぎり";
        System.out.println("こんにちは");    
        if (isHungry == 0) {   
            System.out.println("お腹がいっぱいです");
        } else {
            System.out.println("はらぺこです");
            System.out.println(food + "をいただきます");
        }
        System.out.println("ごちそうさまでした");

        //練習3-4
        boolean tenki = false;
        if (tenki == true) {
            System.out.println("洗濯をします");
            System.out.println("散歩に行きます");
        } else {
            System.out.println("映画をみます");
            System.out.println("寝ます");
        }

        //練習3-5
        System.err.print("【メニュー】１：検索 ２：投稿 ３：削除 ４：変更");
        int selected = new java.util.Scanner(System.in).nextInt();
        switch (selected) {
            case 1 -> {
                System.out.println("検索します");
                break;
            }
            case 2 -> {
                System.out.println("登録");
                break;
            }
            case 3 -> {
                System.out.println("削除");
                break;
            }
            case 4 -> {
                System.out.println("変更");
                break;
            }
        }

        //練習3-6
        System.out.println("【数当てゲーム】");
        int ans = new java.util.Random().nextInt(10);
        for (int i = 0; i < 5; i++) {
            System.out.println("0〜9の数字を入力してください");
            int num = new java.util.Scanner(System.in).nextInt();
            if (num == ans) {
                System.out.println("アタリ！");
            } else {
                System.out.println("違います");
            }
        }
        System.out.println("ゲームを終了します");
    }
}
