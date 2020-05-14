package my.fruitbox;

public class MainClass {
    public static void main(String[] args) {
        Apple apple = new Apple();
        Orange orange = new Orange();
        Box<Apple> appleBox1 = new Box<>(apple,apple);
        Box<Orange> orangeBox1 = new Box<>(orange,orange,orange);
        Box<Apple> appleBox2 = new Box<>(apple,apple,apple,apple);


        System.out.println("apple Первый ящик: "+appleBox1.getNum()+" с массой "+(appleBox1.getNum()*apple.getNet()));
        appleBox1.addItem(apple,apple,apple,apple,apple,apple);
        System.out.println("apple Первый ящик: "+appleBox1.getNum()+" с массой "+(appleBox1.getNum()*apple.getNet()));

        System.out.println("apple Второй ящик: "+appleBox2.getNum()+" с массой "+(appleBox2.getNum()*apple.getNet()));
        appleBox1.fromAnotherBox(appleBox2);
        System.out.println("apple Первый ящик: "+appleBox1.getNum()+" с массой "+(appleBox1.getNum()*apple.getNet()));
        System.out.println("apple Второй ящик: "+appleBox2.getNum()+" с массой "+(appleBox2.getNum()*apple.getNet()));



        System.out.println("oranges Первый ящик: "+orangeBox1.getNum()+" с массой "+(orangeBox1.getNum()*orange.getNet()));
        orangeBox1.addItem(orange,orange);
        System.out.println("oranges Первый ящик: "+orangeBox1.getNum()+" с массой "+(orangeBox1.getNum()*orange.getNet()));
    }
}
