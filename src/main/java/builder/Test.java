package builder;

/**
 * Класс предназначен для демонстрации работы паттерна Builder
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        Cake cake = new Cake.Builder()
                .build();
        System.out.println(cake);

        cake = new Cake.Builder()
                .sugar(1.5)
                .butter(2)
                .eggs(3)
                .vanila(4)
                .flour(5.5)
                .bakingpowder(6.5)
                .milk(7.5)
                .cherry(8)
                .build();
        System.out.println(cake);
    }

}
