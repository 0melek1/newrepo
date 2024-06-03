package ders12;

public class Heyvanlar {
    public static void Main(String[] args){
        Cat cat = new Cat("pisik",3);
        Dog dog = new Dog("it",2);
        Lion lion = new Lion("lion",1);

        cat.makeNoise();
        dog.makeNoise();
    }
}
