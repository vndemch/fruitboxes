package my.fruitbox;

public class Box<T extends Fruit> {
    private int num;
    private T[] box;

    public Box(T... fruits) {
        this.num = fruits.length;
    }

    public T[] getBox() {
        return box;
    }

    public void addItem (T... fruits) {
        this.num += fruits.length;
    }

    public int getNum () {
        return this.num;
    }

    public void setEmpty () { this.num = 0; }

    public void fromAnotherBox (Box<T> anotherBox) {
        this.num += anotherBox.getNum();
        anotherBox.setEmpty();
    }
}
