package ders8;

public class ModifiersDemo {

    public static void main(String[] args){


        Person person1 = new Person("melek");
        person1.publicMethod();

        Person person2 = new Person("vuqar");
        person2.publicMethod();
        person2.accessprivateMethod();

        Person person3 = new Person("qafar",30,"demirchi");
        person3.defaultMethod();

        Person person4 = new Person("sezen",29,"mammedly",40);
        person4.protectedMetod();

        System.out.println("total person :" + Person.personCount);



    }
}
