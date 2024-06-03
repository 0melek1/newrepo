package ders12evisi2;



public class Employee extends Personn {
    //Employee sinifinin daxilində salary department username password dəyişənlərini yarat. dəyişənlərin tiplərini özün
    //təyin et.

    double salary;
    String department;
    String username;
    String password;

    public Employee(int id, String name, String surname, int age, String phone, String address,
                    double salary, String department, String username, String password) {
        super(id, name, surname, age, phone, address);
        this.salary = salary;
        this.department = department;
        this.username = username;
        this.password = password;
    }
    public void printInfo() {
        super.printInfo();
        System.out.println("Salary: " + salary);
        System.out.println("Department: " + department);
        System.out.println("Username: " + username);
        System.out.println("Password: " + password);
    }
}
