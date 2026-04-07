package bouken;

public class Main {
    public static void main(String[] args) {
        Hero h = new Hero();
        h.name = "シャト";
        h.hp = 100;

        Matango m1 = new Matango('A');
        m1.hp = 50;

        Matango m2 = new Matango('B');
        m2.hp = 50;

        h.slip();
        m1.run();
        m2.run();
        h.run();
        SuperHero sh = new SuperHero();
        sh.name = "ラッシュ";
        sh.run();
        PoisonMatango pm = new PoisonMatango('A');
        pm.attack(h);
    }
}