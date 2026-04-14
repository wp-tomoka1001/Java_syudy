package chapter16;

import java.util.HashMap;

public class Main {
    /*
    ローカル変数
    型名を記述していた部分に「var」を記述すると、代入された値の方として扱われる。
    */
    var age = 22; //ageはint型
    var h = new Hero(); //hはHero型
    var list = new ArrayList<String>; //listはArrayList<String>型

    //エラー
    var x;
    var y = null;
    var scores = {10, 20, 30};

    /*
    引数、戻り値、フィールド変数にvarを用いることはできない。
    varは主に、コレクションの宣言に用いると、シンプルなコードを記述する手助けをする。
    オールマイティに利用できるvarという型が存在しているわけではない。
    */
    //varを使わない宣言
    HashMap<String, Integer> map = new HashMap<String, Integer>();
    //varを使った宣言
    var map = new HashMap<String, Integer>();
}
