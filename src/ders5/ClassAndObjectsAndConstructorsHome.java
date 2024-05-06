package ders5;

public class ClassAndObjectsAndConstructorsHome {
    public static void main(String[] args){

        Employee employee1= new Employee();


        Employee employee2= new Employee("melek");


        Employee employee3 = new Employee("vefa","hebilova");


        Employee employee4 = new Employee("nilay" ,1234,"12345");


        //chatgpt
        System.out.println("Employee 1:");{
        employee1.printDetails();

        System.out.println("\nEmployee 2:");
        employee2.printDetails();

        System.out.println("\nEmployee 3:");
        employee3.printDetails();

        System.out.println("\nEmployee 4:");
        employee4.printDetails();
    }



    }
}
