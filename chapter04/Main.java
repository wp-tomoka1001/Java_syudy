package chapter04;

public class Main {
    public static void main(String[] args) {
        /*
        配列変数の作成
        要素の型[] 配列変数
         */
        int[] scores; //int型の変数名scores配列の箱

        //要素の作成と代入
        scores = new int[5];
        /*
        一行でまとめると
        int[] scores = new nt[5];
        */

        /*
        配列作成と初期化の省略記法
        ①要素の型[] 配列変数名 = new 要素の型[] {値１, 値２, 値３, ...};
        ②要素の型[] 配列変数名 =　{値１, 値２, 値３, ...};
        */
        int[] scores1 = new int[] {20, 30, 40, 50, 80};
        int[] scores2 = {20, 30, 40, 50, 80};

        int sum = 0;
        for (int i = 0; i < scores1.length; i++) {
            sum += scores1[i];
        }

        int avg = sum / scores1.length;
        System.out.println("合計点：" + sum);
        System.out.println("平均点：" + avg);

        int count = 0;
        for (int i = 0; i < scores2.length; i++) {
            if (scores2[i] >= 50) {
                count++;
            }
        }
        System.out.println("50点以上の科目の数は：" + count);

        //int型の変数seqの箱を10個
        int[] seq = new int[10];
        for (int i = 0; i < seq.length; i++) {
            //ランダムに0~3の数字を生成
            seq[i] = new java.util.Random().nextInt(4);
            
            //chae型の変数名baseの箱を４個（'A', 'G', 'G', 'C'要素を入れる）
            char[] base = {'A', 'T', 'G', 'C'};
            //seq[i]が呼ばれてbase[seq[i]]が走りアルファベットが表示される
            System.out.println(base[seq[i]]);
        }

        /*
        拡張for文で配列を回す
        for (要素の型　任意の変数名 : 配列変数名) {}
        */
        int[] scores3 = {20, 30, 40, 50, 80};
        for (int value : scores3) {
            System.out.println(value);
        }
    }
}