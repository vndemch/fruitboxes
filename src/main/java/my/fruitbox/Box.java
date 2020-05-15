package my.fruitbox;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private int num;
    private ArrayList<T> box;

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));
        this.num = box.size();

    }

    public void addItem (T... fruits) {
        System.out.println("Добавляем в коробку: "+fruits.length);
    box.addAll(Arrays.asList(fruits));
    this.num = box.size();
    }

    public int getNum () {
        return this.num;
    }

    public void setEmpty () { box.clear(); this.num = 0; }

    public void fromAnotherBox (Box<T> anotherBox) {
        if (box == anotherBox.box) {
            System.out.println("Это одна коробка");
            return;
        }
        System.out.println("Перекладываем в коробку: " +anotherBox.box.size()+ " единиц");
        box.addAll(anotherBox.box);
        this.num += anotherBox.getNum();
        anotherBox.setEmpty();
    }
}
