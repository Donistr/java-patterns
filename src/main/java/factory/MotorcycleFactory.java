package factory;

/**
 * Класс создающий мотоциклы
 */
public class MotorcycleFactory implements MotorVehicleFactory {

    /**
     * Реализует метод {@link MotorVehicleFactory#create()} для создания мотоцикла
     * @return объект класса {@link Motorcycle}
     */
    @Override
    public MotorVehicle create() {
        return new Motorcycle();
    }

}
