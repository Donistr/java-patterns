package decorator;

/**
 * Класс предназначен для демонстрации работы паттерна Decorator
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        Pizza pizza = new PepperoniPizza();
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());

        pizza = new CheeseDecorator(pizza);
        System.out.println(pizza.getDescription());
        System.out.println(pizza.getCost());
    }

}
