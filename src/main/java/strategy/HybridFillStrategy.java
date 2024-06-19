package strategy;

/**
 * Класс реализует гибридную стратегию заправки
 */
public class HybridFillStrategy implements FillStrategy {

    @Override
    public void fill() {
        System.out.println("Заправляем бензином или электричеством на выбор!");
    }

}
