package singleton;

/**
 * Класс является реализацией паттерна Singleton, т.е. может быть создан только один экземпляр на программу
 */
public final class SingletonClass {

    private static final SingletonClass INSTANCE = new SingletonClass();

    private final String information = "information";

    public static SingletonClass getInstance() {
        return INSTANCE;
    }

    public String getInformation() {
        return information;
    }

    private SingletonClass() {
    }

}
