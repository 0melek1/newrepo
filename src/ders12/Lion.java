package ders12;

public class Lion extends Animal {

    // Konstruktor
    Lion(String name, int age) {
        super(name, age);  // Superclass konstruktorunu çağırır
    }

    // Alternativ konstruktor yalnız adı ilə
    Lion(String name) {
        super(name);  // Superclass konstruktorunu çağırır
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " kükreyir");
    }
}
