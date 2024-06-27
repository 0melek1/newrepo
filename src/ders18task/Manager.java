package ders18task;

public class Manager implements Employee{

    private int salary;

    public Manager(int salary){
        this.salary=salary;
    }
    @Override
    public int getMonthSalary() {
        return salary;
    }

    @Override
    public void onFire() {
        System.out.println("Manager isden cixarildi");
    }

    @Override
    public void onHire() {
      System.out.println("Manager ise alindi");
    }
}
