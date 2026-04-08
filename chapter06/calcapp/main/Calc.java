/*
クラスをパッケージに所属させる
package 所属させたいパッケージ名;
*/
package chapter06.calcapp.main;

/*
FQCN入力の手間を省くための宣言
import パッケージ名.クラス名;
*/
import chapter06.calcapp.logics.CalcLogic;

public class Calc {
    public static void main(String[] args) {
        int a = 10;
        int b = 2;
        int total = CalcLogic.tasu(a, b);
        int delta = CalcLogic.hiku(a, b);
        System.out.println("足すと" + total + "、引くと" + delta);
    }
}
