package abstractfactory;

/**
 * Класс наследуется от класса {@link Animal}, представляет наземное животное
 */
public class LandAnimal extends Animal {

    public LandAnimal(AnimalEra era, String name) {
        super(AnimalType.LAND, era, name);
    }

}
