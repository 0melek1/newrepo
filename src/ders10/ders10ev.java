package ders10;

import java.util.Random;

public class ders10ev {
    public static void main(String[] args){
        char[] massiv = {'m','e','l','e','k' };
        String array = new String(massiv);
        System.out.println(array);

        String s = "melek";
        boolean s1 = s.length() == 3 && s.matches("[a-zA-Z]{3}");
        System.out.println(s1);

        String s2 = "melek";
        boolean result = s2.isBlank();
        System.out.println(result);

        String s3 = "";
        boolean result1 = s3.isEmpty();
        System.out.println(result1);

        //2 ədəd String tipli parametr qəbul edən metod yarat. Bu metod, 1-ci parametr-dən göndərilən sətirin , 2-ci parametr-dən
        //göndərilən sətirlə bitib-bitməməsini tapsın və nəticəsini boolean dəyişənə mənimsətsin və metod bu dəyəri geri
        //qaytarsın.

        String setir1 = "showmustgoon";
        String setir2 = "goon";
        boolean setir3 = setir1.endsWith(setir2);
        System.out.println(setir3);


        //10 ilə 30 arasında təsadüfi ədədi konsola çap edən kod yaz. 10 və 30 aralığa daxil olsun.

        Random random = new Random();
        int num = random.nextInt(10,30);
        System.out.println(num);

        //Verilmiş kəsr ədədi 100-də birlərə qədər yuvarlaqlaşdıran kod yaz.
        double numm = 42.192686;
        String result4 = String.format("%.4f",numm);
        System.out.println(result4);
    }
}

