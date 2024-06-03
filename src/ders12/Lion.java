package ders12;

public class Lion extends Animal {

    // Konstruktor
    Lion(String name, int age) {
        super(name, age);
    }

    // Alternativ konstruktor yalnız adı ilə
    Lion(String name) {
        super(name);
    }

    @Override
    public void makeNoise() {
        System.out.println(name + " kükreyir");
    }
}
