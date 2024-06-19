package prototype;

/**
 * Класс создающий клоны объекта по образцу
 */
public class TreeFactory {

    private final Tree tree;

    public TreeFactory(Tree tree) {
        this.tree = tree;
    }

    public Tree create() throws CloneNotSupportedException {
        return (Tree) tree.clone();
    }

}
