package adapter;

/**
 * Класс предназначен для демонстрации работы паттерна Adapter
 */
public final class Test {

    private Test() {
    }

    public static void main(String[] args) {
        MemoryCard card = new MemoryCard();
        USB usb = new CardReader(card);
        usb.connectUSB();
    }

}
