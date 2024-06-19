package proxy;

/**
 * Класс предназначен для демонстрации работы паттерна Proxy
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        ExpensiveObject expensiveObject = new ExpensiveObjectProxy();
        System.out.println(expensiveObject);
        expensiveObject.process();
        System.out.println(expensiveObject);
    }

}
