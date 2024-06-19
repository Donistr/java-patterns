package decorator;

/**
 * Класс-декоратор, от которого наследуются декораторы
 */
public abstract class PizzaDecorator implements Pizza {

    protected Pizza pizza;

    public PizzaDecorator(Pizza pizza) {
        this.pizza = pizza;
    }

}
