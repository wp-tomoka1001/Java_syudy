package chapter04;

public class lesson04 {
    public static void main(String[] args) {
        //練習4-1
        int[] points = new int[4];
        double[] weight = new double[5];
        boolean[] answers = new boolean[3];
        String[] names = new String[3];

        //練習4-2
        int[] moneyList = {121902, 8302, 55100};

        for (int i = 0; i < moneyList.length; i++) {
            System.out.println(moneyList[i]);
        }

        for (int value : moneyList) {
            System.out.println(value);
        }

        //練習4-4
        int[] number = {3, 4, 9};
        System.out.println("１桁の数字を入力してください");
        int input = new java.util.Scanner(System.in).nextInt();
        for (int num : number) {
            if(input == num) {
                System.out.println("アタリ！");
            }
        }
    }
}
