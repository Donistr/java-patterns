package singleton;

/**
 * Класс предназначен для демонстрации работы паттерна Singleton
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        SingletonClass singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass.getInformation());
        System.out.println(singletonClass);
        singletonClass = SingletonClass.getInstance();
        System.out.println(singletonClass);
    }

}
