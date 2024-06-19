package factory;

/**
 * Класс создающий транспорт
 */
public interface MotorVehicleFactory {

    /**
     * @return объект класса {@link MotorVehicle}
     */
    MotorVehicle create();

}
