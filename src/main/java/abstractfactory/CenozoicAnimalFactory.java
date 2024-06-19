package abstractfactory;

/**
 * Класс создающий животных кайнозойской эры
 */
public class CenozoicAnimalFactory implements EraAnimalFactory {

    @Override
    public Animal create(AnimalType type, String name) {
        return switch (type) {
            case LAND -> new LandAnimal(AnimalEra.CENOZOIC, name);
            case SKY -> new SkyAnimal(AnimalEra.CENOZOIC, name);
        };
    }

}
