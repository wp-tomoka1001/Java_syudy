package chapter01;
public class Main {
    public static void main(String[] args) {
        /* 変数宣言
        型 変数名 = 入力するデータ;
        */
        //int型のsge変数の箱に20を代入する
        int age = 20; 
        System.out.println("私の年齢は" + age);
        age = 31;
        System.out.println("...いや、本当の年齢は" + age);

        /*定数宣言
        fainal 型　定数名 = 初期位置;
        */
        final double PI = 3.14;
        int pie = 5;
        System.out.println("半径" + pie + "cmの牌の面積は、");
        System.out.println(pie * pie * PI);
        System.out.println("パイの半径を倍にします");
        //PI = 10; //定数コンパイルエラーになる
        System.out.println("半径" + pie + "cmのパイの面積は、");
        System.out.println(pie * pie * PI);
    }
}
