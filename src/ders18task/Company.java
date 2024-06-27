package ders18task;

import java.util.ArrayList;
import java.util.List;

public class Company {

    private static Employee employee;
    private static boolean newEmployee;


    /*1. Company - classı yaradılsın. Özündə List Employee saxlayır. Aşağıdakı method-ları olmalıdır.
     hire - bir iyeni işçi əlavə olunur
,    hireAll - List işçi əlavə olunur
     fire(int count) - count sayda işçi işdən kənarlaşdırılır
     List<Employee> getTopSalaryStaff(int count) - count qədər ən çox maaş alanlar
     List<Employee> getLowestSalaryStaff(int count) - count qədər ən az maaş alanlar

Employee interface-dir.
        int getMonthSalary() - aylıq məvacib
       onFire() - İşdən çıxarılanda  print etmək
       onHire() - işə qəbul ediləndə print etmək
Emplyee interface-ni implement edən 3 class var. Operator, Manager, TopManager.
main method-da Company yaradıb içərisinə 200 nəfər Operator, 50 nəfər manager və 10 nəfər Top Manager əlavə edin(random maaşla).
50% ştatı ixtisar edin. Ən çox  və ən az maaş alanları çapa verin.

Classların field və method-larını mənaya uyğun olaraq özünüz təyin edin
"*/

    ArrayList<Employee> employees = new ArrayList<>();

    public void hire(Employee employee) {
        employees.add(employee);
        employee.onHire();
    }

    public void hireAll(List<Employee> newEmployee) {
        //for(Employee employee ; newEmployee) hire(employee);
    }

    public void fire(int count) {
        for (int i = 0; i < employees.size(); i++) {
            Employee employee = employees.remove(employees.size() - 1);

        }
    }

    public List<Employee> getTopSalaryStaff(int count) {

        return List.of();
    }

    public List<Employee> getLowestSalaryStaff(int count) {

        return List.of();
    }

    public static void main(String[] args) {

        Company company = new Company();
        for (int i = 0; i < 200; i++) {
            company.hire(new Operator((int) (Math.random() * 500 + 100)));

        }
        for (int i = 0; i < 50; i++) {
            company.hire(new Manager((int) (Math.random() * 600 + 100)));
        }
        for (int i = 0; i < 50; i++) {
            company.hire(new Manager((int) (Math.random() * 700 + 100)));

        }

        //50% ştatı ixtisar edin
        company.fire(company.employees.size() / 2);

        //ardi var
    }
}


