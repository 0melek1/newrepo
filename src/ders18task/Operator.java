package ders18task;

public class Operator implements Employee
{

    private int salary ;


    public Operator (int salary){
        this.salary = salary;
    }
    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public void onFire() {
        System.out.println("Operator isden cixarildi");

    }

    @Override
    public void onHire() {
        System.out.println("Operator ise alindi");

    }
}
