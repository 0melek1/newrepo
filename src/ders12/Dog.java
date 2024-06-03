package ders12;

public class Dog extends Animal {

    // Konstruktor
    Dog(String name, int age) {
        super(name, age);  // Superclass konstruktorunu çağırır
    }

    // Alternativ konstruktor yalnız adı ilə
    Dog(String name) {
        super(name);  // Superclass konstruktorunu çağırır
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " havlayır");
    }
}
