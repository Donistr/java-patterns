package strategy;

/**
 * Базовый класс автомобиля
 */
public class Auto {

    protected FillStrategy fillStrategy;

    /**
     * @param fillStrategy стратегия заправки {@link FillStrategy}
     */
    public Auto(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

    public void fill() {
        fillStrategy.fill();
    }

    public void gas() {
        System.out.println("Едем вперед");
    }

    public void stop() {
        System.out.println("Тормозим!");
    }

    public void setFillStrategy(FillStrategy fillStrategy) {
        this.fillStrategy = fillStrategy;
    }

}
