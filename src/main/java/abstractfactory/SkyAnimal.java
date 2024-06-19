package abstractfactory;

/**
 * Класс наследуется от класса {@link Animal}, представляет летающее животное
 */
public class SkyAnimal extends Animal {

    public SkyAnimal(AnimalEra era, String name) {
        super(AnimalType.SKY, era, name);
    }

}
