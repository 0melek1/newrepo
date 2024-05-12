package ders6;

public class MainClass {
    public static void main(String[] args){
        Circle circle = new Circle();
        circle.radius = 5.2 ;

        Calculator calculator = new Calculator();
        calculator.calculateCircleLength(circle);
        System.out.println(" cevrenin uzunlugu : " + circle.length + " dir ");
    }
}
