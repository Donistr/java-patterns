package state;

/**
 * Класс предназначен для демонстрации работы паттерна State
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        Package pkg = new Package();
        pkg.printStatus();
        pkg.previousState();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
        pkg.printStatus();
        pkg.nextState();
    }

}
