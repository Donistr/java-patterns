package abstractfactory;

/**
 * Класс создающий животных заданного типа и эры, которая задана конфигурацией
 */
public class AnimalAbstractFactory {

    public Animal create(AnimalType type, String name) {
        AnimalEra era = getEraFromConfiguration();
        return switch (era) {
            case MESOZOIC -> new MesozoicAnimalFactory().create(type, name);
            case CENOZOIC -> new CenozoicAnimalFactory().create(type, name);
        };
    }

    private AnimalEra getEraFromConfiguration() {
        return AnimalEra.MESOZOIC;
    }

}
