package factory;

/**
 * Класс создающий машины
 */
public class CarFactory implements MotorVehicleFactory {

    /**
     * Реализует метод {@link MotorVehicleFactory#create()} для создания машины
     * @return объект класса {@link Car}
     */
    @Override
    public MotorVehicle create() {
        return new Car();
    }

}
