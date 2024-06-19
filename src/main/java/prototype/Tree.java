package prototype;

/**
 * Класс представляющий собой прототип, реализует интерфейс {@link Cloneable}
 */
public class Tree implements Cloneable {

    private int mass;
    private int height;

    public Tree(int mass, int height) {
        this.mass = mass;
        this.height = height;
    }

    public int getMass() {
        return mass;
    }

    public void setMass(int mass) {
        this.mass = mass;
    }

    public int getHeight() {
        return height;
    }

    public void setHeight(int height) {
        this.height = height;
    }

    @Override
    public Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

}
