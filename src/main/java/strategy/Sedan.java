package strategy;

/**
 * Класс представляет автомобиль седан<br>
 * Использует стратегию заправки {@link StandartFillStrategy}
 */
public class Sedan extends Auto {

    public Sedan() {
        super(new StandartFillStrategy());
    }

}
