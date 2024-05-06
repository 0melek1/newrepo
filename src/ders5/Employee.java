package ders5;

public class Employee {

    int id;
    String name;
    String surname;
    String phone;
    String address;
    int salary;

    public Employee(){
        System.out.println("default qurucu");

    }

    public Employee(String name){
        System.out.println("Constructor Name");
        this.name = name;

    }
    public Employee(String name,String surname){
        System.out.println("Constructor name and surname");
        this.name=name;
        this.surname=surname;
    }
    public Employee(String name,int salary,String phone){
        System.out.println("Constructor name,salary and phone");
        this.name=name;
        this.salary=salary;
        this.phone=phone;
    }

    //chatgpt
    public void printDetails() {
        System.out.println("ID: " + id);
        System.out.println("Name: " + name);
        System.out.println("Surname: " + surname);
        System.out.println("Phone: " + phone);
        System.out.println("Address: " + address);
        System.out.println("Salary: " + salary);
    }
}
