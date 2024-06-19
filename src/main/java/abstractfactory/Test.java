package abstractfactory;

/**
 * Класс предназначен для демонстрации работы паттерна Abstract Factory
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        AnimalAbstractFactory factory = new AnimalAbstractFactory();
        Animal animal = factory.create(AnimalType.LAND, "name1");
        System.out.println(animal);

        animal = factory.create(AnimalType.SKY, "name2");
        System.out.println(animal);
    }

}
