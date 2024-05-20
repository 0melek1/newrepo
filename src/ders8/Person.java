package ders8;

public class Person {

    String name ;

    public String surName ;

    protected int age ;

    private int student_id ;


    public static  int personCount = 0;


    public Person(String name ){
        this.name = name ;
        this.age = 0;
        this.student_id = 0;
        this.surName = "Unknown";
        personCount++;
    }

    private Person( String name ,int student_id){
        this.name = name ;
        this.age = 0;
        this.student_id = student_id;
        this.surName = "Unknown";
        personCount++;
    }

    protected Person(String name , int age , String surName , int student_id){
        this.name = name ;
        this.age = age;
        this.student_id = student_id;
        this.surName = surName;
        personCount++;

    }

     Person(String name , int age, String surName) {
         this.name = name;
         this.age = age;
         this.student_id = 0;
         this.surName = surName;
         personCount++;
    }

     public void publicMethod(){
        System.out.println( " public metod : " + name);
     }

     private void privateMethod(){
        System.out.println(" private metod , name : " + name + "age:" + age ) ;
     }

     protected void protectedMetod(){
        System.out.println(" protected metod , name : " + name + " age:" + age + " surname :" + surName + " student_id:" + student_id);
     }

     void defaultMethod(){
        System.out.println("default metod, name : " + name + " age : " + age + " surname : " + surName);
     }

      public void accessprivateMethod(){
        privateMethod();
      }
}
