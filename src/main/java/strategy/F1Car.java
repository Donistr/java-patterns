package strategy;

/**
 * Класс представляет автомобиль формулы 1<br>
 * Использует стратегию заправки {@link F1PitstopStrategy}
 */
public class F1Car extends Auto {

    public F1Car() {
        super(new F1PitstopStrategy());
    }

}
