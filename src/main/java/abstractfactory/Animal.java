package abstractfactory;

/**
 * Класс представляет базовый тип животного
 */
public abstract class Animal {

    private final AnimalType type;
    private final AnimalEra era;
    private final String name;

    public Animal(AnimalType type, AnimalEra era, String name) {
        this.type = type;
        this.era = era;
        this.name = name;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "type=" + type +
                ", era=" + era +
                ", name='" + name + '\'' +
                '}';
    }

}
