package decorator;

/**
 * Класс представляет собой реализацию интерфейса {@link Pizza} - пицца с пепперони
 */
public class PepperoniPizza implements Pizza {

    @Override
    public String getDescription() {
        return "Pepperoni Pizza";
    }

    @Override
    public double getCost() {
        return 10;
    }

}
