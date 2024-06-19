package abstractfactory;

/**
 * Класс создающий животных мезозойской эры
 */
public class MesozoicAnimalFactory implements EraAnimalFactory {

    @Override
    public Animal create(AnimalType type, String name) {
        return switch (type) {
            case LAND -> new LandAnimal(AnimalEra.MESOZOIC, name);
            case SKY -> new SkyAnimal(AnimalEra.MESOZOIC, name);
        };
    }

}
