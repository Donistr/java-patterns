package strategy;

/**
 * Класс реализует стандартную стратегию заправки
 */
public class StandartFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Просто заправляем бензин!");
    }

}
