package chapter05;

public class Main {
    /* 
    引数を利用したメソッド定義
    public static void メソッド名(引数リスト) {}
     */
    public static int add(int x, int y) {
        int ans = x + y;
        System.out.println(x + "+" + y + "+" + "=" + ans);

        /*
        戻り値を利用したメソッドの呼び出し
        型 変数名 = メソッド名(引数リスト);
        */
        return ans;
    }

    public static double add(double x, double y) {
        return x + y;
    }

    public static String add(String x, String y) {
        return x + y;
    }

    //戻り値に配列を用いる
    public static int[] makeArray(int size) {
        int[] newArray = new int[size];
        for (int i = 0; i < newArray.length; i++) {
            newArray[i] = i;
        }
        return newArray;
    }

    public static void main(String[] args) {
        /*
        引数鵜を利用したメソッドの呼び出し
        メソッド名(引数リスト)
        */
        add(100, 20);
        add(200, 50);

        int answer = add(500,55);
        System.out.println("!500 + 55 =" + answer);

        //オーバーロード
        System.out.println(add(10, 20));
        System.out.println(add(3.5, 2.7));
        System.out.println(add("Hello", "World"));

        int[] array = makeArray(3);
        for (int i : array) {
            System.out.println(i);
        }
    }
}
