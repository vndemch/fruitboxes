package my.fruitbox;

import java.util.ArrayList;
import java.util.Arrays;

public class Box<T extends Fruit> {
    private ArrayList<T> box;

    public Box(T... fruits) {
        box = new ArrayList<>(Arrays.asList(fruits));

    }

    public void addItem (T... fruits) {
        System.out.println("Добавляем в коробку: "+fruits.length);
    box.addAll(Arrays.asList(fruits));
    }

    public int getNum () {
        return this.box.size();
    }

    public void setEmpty () { box.clear(); }

    public void fromAnotherBox (Box<T> anotherBox) {
        if (box == anotherBox.box) {
            System.out.println("Это одна коробка");
            return;
        }
        System.out.println("Перекладываем в коробку: " +anotherBox.box.size()+ " ед.");
        box.addAll(anotherBox.box);
        anotherBox.setEmpty();
    }
}
