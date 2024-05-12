package ders6;

public class MethodsHome {
    public static void main(String[] args){

        MethodsHome number = new MethodsHome();
        number.printNumbers(2,4);
        number.printNumbers(4,8);
        number.printNumbers(8,16);
    }

    public void printNumbers( int begin , int end){
        for ( int i = begin; i < end ; i++){
        System.out.println(i);
        }


    }
}
