package ders14ev;

public class evisi1 {
//birinci tapsiriq
   /* public static void main(String[] args){
        System.out.println("program starts");
        int a = 8;
        int b = 0;
        try {
            int result = a / b;
            System.out.println(result);
        } catch(ArithmeticException e){
            System.out.println("program islemir");
        }
    }*/
//ikinci ve ucuncu tapsiriq tabsiriq bir yerde
   /* public static void main(String[] args){

        System.out.println("program starts");

        String strNum1 = "10";
        String strNum2 = "0";

        try {
            int num1 = Integer.parseInt(strNum1);
            int num2 = Integer.parseInt(strNum2);

            int result = num1 / num2;
            System.out.println(result);
        }catch(ArithmeticException e){
            System.out.println("sifira bolmek mumkun deyil");
        } catch (NumberFormatException e){
            System.out.println("zehmet olmasa reqem daxil edin");
        } finally {
            System.out.println("proqramin sonu hehehe");
        }
        }*/

    //dorduncu tapsiriq
   /* public static void main(String[] args){
        int[] numbers = {-1,-2,-3,1,2,3};
        for(int number : numbers){
            try{
                if(number < 0) {
                    throw new IllegalArgumentException("Xəta: Rəqəm mənfidir: " + number);
                } System.out.println("reqem menfi deyil" + number);
            }catch(IllegalArgumentException e){
                System.out.println(e.getMessage());
            }
        }
    }*/
    //besinci tabsiriq
    public static void main(String[] args){
         int[] numbers = {1,2,3,4,5,6,7,8};
         int lowerB = 3;
         int higherB = 7;
         for( int number : numbers){
             try{
                 if (number < lowerB || number > higherB) {
                     throw new OutOfRangeValueException("Xəta: Rəqəm [" + lowerB + ", " + higherB + "] aralığından kənardadır: " + number);
                 }
                 System.out.println("Rəqəm daxil olduğu aralığa uyğundur: " + number);
             } catch (OutOfRangeValueException e) {
                 System.out.println(e.getMessage());

                 }
         }
    }
    static class OutOfRangeValueException extends Exception {
        public OutOfRangeValueException(String message) {
            super(message);
        }
    }
}

