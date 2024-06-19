package factory;

/**
 * Класс машина, реализующий интерфейс MotorVehicle
 */
public class Car implements MotorVehicle {

    /**
     * Реализует метод {@link MotorVehicle#go()} для машины
     */
    @Override
    public void go() {
        System.out.println("Car go");
    }

}
