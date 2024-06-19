package factory;

/**
 * Класс мотоцикл, реализующий интерфейс {@link MotorVehicle}
 */
public class Motorcycle implements MotorVehicle {

    /**
     * Реализует метод {@link MotorVehicle#go()} для мотоцикла
     */
    @Override
    public void go() {
        System.out.println("Motorcycle go");
    }

}
