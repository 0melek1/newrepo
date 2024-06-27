package ders18task;

public class TopManager implements Employee{

    private int salary;

    public  TopManager(int salary){
        this.salary=salary;
    }
    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public void onFire() {
        System.out.println("Top manager isden cixarildi");

    }

    @Override
    public void onHire() {
        System.out.println("top manager ise alindi");

    }
}
