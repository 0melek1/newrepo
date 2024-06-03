package ders12;

public class Cat extends Animal {

    // Konstruktor
    Cat(String name, int age) {
        super(name, age);  // Superclass konstruktorunu çağırır
    }

    // Alternativ konstruktor yalnız adı ilə
    Cat(String name) {
        super(name);  // Superclass konstruktorunu çağırır
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " miyavlayır");
    }
}
