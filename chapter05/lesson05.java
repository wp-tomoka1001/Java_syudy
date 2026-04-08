package chapter05;

public class lesson05 {

    //練習5-1
    public static void introduceOneself() {
        String name = "湊雄輔";
        int age = 22;
        double height = 169.9;
        char animal = '辰';
        System.out.println("私の名前は" + name + "です。" + "歳は" + age + "歳です。" + "身長は" + height + "cmです。" + "十二支は" + animal + "です。");
    }

    //練習5-2
    public static void email(String title, String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：" + title);
        System.out.println("本文：" + text);
    }

    //練習5-3
    public static void email(String address, String text) {
        System.out.println(address + "に、以下のメールを送信しました");
        System.out.println("件名：無題");
        System.out.println("本文：" + text);
    }

    //練習5-3
    public static double calcTriangleArea(double bottom, double height) {
        double ans = bottom * height / 2;
        return ans;
    }

    public static double calcCircleArea(double radius) {
        double ans = radius * radius * 3.14;
        return ans;
    }   

    public static void main(String[] args) {
        introduceOneself();

        email("メールの本文", "メールの宛先アドレス", "メールのタイトル");

        email("メールの宛先アドレス", "メールのタイトル");

        double calcTriangleArea = calcTriangleArea(10.0, 5.0);
        System.out.println("三角形の面積：" + calcTriangleArea + "平方cm");
        double calcCircleArea = calcCircleArea(5.0);
        System.out.println("円の面積：" + calcCircleArea + "平方cm");
    }
}
