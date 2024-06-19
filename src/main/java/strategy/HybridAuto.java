package strategy;

/**
 * Класс представляет гибридный автомобиль<br>
 * Использует стратегию заправки {@link HybridFillStrategy}
 */
public class HybridAuto extends Auto {

    public HybridAuto() {
        super(new HybridFillStrategy());
    }

}
