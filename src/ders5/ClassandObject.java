package ders5;

public class ClassandObject {
    public static void main (String[] args){

        Person person1 = new Person();
        person1.age = 19;
        person1.id = 1234;
        person1.name = "melek";
        person1.surname = "hajiyeva";
        person1.phone = "12345";


        Person person2 = new Person();
        person2.id = 12345;
        person2.name = "vefa";
        person2.surname = "hebilova";
        person2.age = 15;
        person2.phone = "12345";


        System.out.println("person1-in yasi :" + person1.age);
        System.out.println("person1-in adi :" + person1.name);
        System.out.println("person1-in soyadi :" + person1.surname);
        System.out.println("person1-in idsi :" + person1.id);
        System.out.println("person1-in elaqe nomresi :" + person1.phone);

        System.out.println("person2-in yasi :" + person2.age);
        System.out.println("person2-in adi :" + person2.name);
        System.out.println("person2-in soyadi :" + person2.surname);
        System.out.println("person2-in idsi :" + person2.id);
        System.out.println("person2-in elaqe nomresi :" + person2.phone);

    }
}
