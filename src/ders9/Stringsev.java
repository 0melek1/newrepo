package ders9;

public class Stringsev {
    public static void main(String[] args){

        String name = "Meherrem";
        System.out.println(name);

        String message = "Java dilini oyrenmek maraqli ve faydalidir";
        System.out.println(message);

        System.out.println(message.length());

        char x = message.charAt(7);
        System.out.println(x);

        System.out.println(message.indexOf('n'));
        System.out.println(message.toLowerCase());
        System.out.println(message.toUpperCase());
        System.out.println(message.contains("x"));
        System.out.println(message.contains("n"));

        String mes1 = "lidir";
        String mes2 = "Lidir";
        System.out.println(message.endsWith(mes1));
        System.out.println(message.endsWith(mes2));

        String mes3 = "Java";
        String mes4 = "java";
        System.out.println(message.startsWith(mes3));
        System.out.println(message.startsWith(mes4));

        String name1 = " Ayxan ";
        System.out.println(name1.trim());

        String name2 = "kamil";
        System.out.println(name2.indexOf(4, 0));
        String[] parts = name.split(" ");


        name = "Hüseyn Mehdizadə";

        String[] partss = name.split(" ");

        for (String part : partss) {
            System.out.println(part);


        }

    }
}
