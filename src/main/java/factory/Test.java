package factory;

/**
 * Класс предназначен для демонстрации работы паттерна Factory
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        MotorVehicleFactory factory = new CarFactory();
        MotorVehicle vehicle = factory.create();
        vehicle.go();

        factory = new MotorcycleFactory();
        vehicle = factory.create();
        vehicle.go();
    }

}
