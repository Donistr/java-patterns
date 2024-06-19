package adapter;

/**
 * Класс-адаптер представляет кард ридер, чтобы прочитать карту памяти, использую usb порт
 */
public class CardReader implements USB {

    private final MemoryCard memoryCard;

    public CardReader(MemoryCard memoryCard) {
        this.memoryCard = memoryCard;
    }

    @Override
    public void connectUSB() {
        this.memoryCard.insert();
        this.memoryCard.copyData();
    }

}
