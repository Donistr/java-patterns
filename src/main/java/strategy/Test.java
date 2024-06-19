package strategy;

/**
 * Класс предназначен для демонстрации работы паттерна Strategy
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        Auto f1Car = new F1Car();
        Auto hybdirAuto = new HybridAuto();
        Auto sedan = new Sedan();

        f1Car.gas();
        hybdirAuto.gas();
        sedan.gas();

        f1Car.stop();
        hybdirAuto.stop();
        sedan.stop();

        f1Car.fill();
        hybdirAuto.fill();
        sedan.fill();
    }

}
