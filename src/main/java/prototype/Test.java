package prototype;

/**
 * Класс предназначен для демонстрации работы паттерна Prototype
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) throws CloneNotSupportedException {
        TreeFactory factory = new TreeFactory(new Tree(12, 13));
        System.out.println(factory.create());
        System.out.println(factory.create());
    }

}
