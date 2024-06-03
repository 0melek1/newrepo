package ders12evisi2;

public class Personn {
    int id;
    String name;
    String surname;
    int age;
    String phone;
    String address;

    // Konstruktor
    public Personn(int id, String name, String surname, int age, String phone, String address) {
        this.id = id;
        this.name = name;
        this.surname = surname;
        this.age = age;
        this.phone = phone;
        this.address = address;
    }

    // Dəyişənlərinin dəyərlərini çap etmək üçün metod
    public void printInfo() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Age: " + age);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
    }
}

