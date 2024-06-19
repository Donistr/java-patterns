package abstractfactory;

/**
 * Класс создающий животное определённой эры
 */
public interface EraAnimalFactory {

    Animal create(AnimalType type, String name);

}
