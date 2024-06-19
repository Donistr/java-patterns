package builder;

/**
 * Класс, который представляет торт и имеет много полей
 */
public final class Cake {

    private final double sugar;
    private final double butter;
    private final int eggs;
    private final int vanila;
    private final double flour;
    private final double bakingpowder;
    private final double milk;
    private final int cherry;

    /**
     * Внутренний статический класс, предназначенный для создания объекта класса {@link Cake}
     */
    public static class Builder {

        private double sugar = 0;
        private double butter = 0;
        private int eggs = 0;
        private int vanila = 0;
        private double flour = 0;
        private double bakingpowder = 0;
        private double milk = 0;
        private int cherry = 0;

        public Builder sugar(double cup) {
            this.sugar = cup;
            return this;
        }

        public Builder butter(double cup) {
            this.butter = cup;
            return this;
        }

        public Builder eggs(int number) {
            this.eggs = number;
            return this;
        }

        public Builder vanila(int spoon) {
            this.vanila = spoon;
            return this;
        }

        public Builder flour(double cup) {
            this.flour = cup;
            return this;
        }

        public Builder bakingpowder(double spoon) {
            this.bakingpowder = spoon;
            return this;
        }

        public Builder milk(double cup) {
            this.milk = cup;
            return this;
        }

        public Builder cherry(int number) {
            this.cherry = number;
            return this;
        }

        public Cake build() {
            return new Cake(this);
        }

    }

    /**
     * Приватный конструктор, назначает полям значения, заданные пользователем в Builder-е
     * @param builder внутренний класс {@link Builder}
     */
    private Cake(Builder builder) {
        this.sugar = builder.sugar;
        this.butter = builder.butter;
        this.eggs = builder.eggs;
        this.vanila = builder.vanila;
        this.flour = builder.flour;
        this.bakingpowder = builder.bakingpowder;
        this.milk = builder.milk;
        this.cherry = builder.cherry;
    }

    @Override
    public String toString() {
        return "Cake{" +
                "sugar=" + sugar +
                ", butter=" + butter +
                ", eggs=" + eggs +
                ", vanila=" + vanila +
                ", flour=" + flour +
                ", bakingpowder=" + bakingpowder +
                ", milk=" + milk +
                ", cherry=" + cherry +
                '}';
    }

}
