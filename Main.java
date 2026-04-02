public class Main {
    public static double calcTriangleArea (double bottom, double height) {
        double triangleArea = (bottom * height) / 2;
        return triangleArea;
    }

    public static double calcCircleArea (double radius) {
        double circleArea = radius * radius * 3.14;
        return circleArea;
    }

    public static void main(String[] args) { 
        double A = calcTriangleArea(10.0, 5.0);
        System.out.println("面積は" + A + "平方cm");
        
        double circleArea = calcCircleArea(5.0);
        System.out.println("面積は" + circleArea + "平方cm");
    }
}