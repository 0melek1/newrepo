package ders12;

abstract class Animal {
    String name;
    int age;

    // Konstruktor
    Animal(String name, int age) {
        this.name = name;
        this.age = age;
    }

    // İkinci konstruktor, yalnız adı ilə
    Animal(String name) {
        this.name = name;
    }

    public abstract void makeNoise();
}
