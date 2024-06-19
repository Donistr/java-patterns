package proxy;

/**
 * Прокси, инициализирует поле {@link #object} только по необходимости
 */
public class ExpensiveObjectProxy implements ExpensiveObject {

    private ExpensiveObject object;

    @Override
    public void process() {
        if (object == null) {
            object = new ExpensiveObjectImpl();
        }
        object.process();
    }

    @Override
    public String toString() {
        return "ExpensiveObjectProxy{" +
                "object=" + object +
                '}';
    }

}
