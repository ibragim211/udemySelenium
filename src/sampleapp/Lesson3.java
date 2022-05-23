package sampleapp;

public class Lesson3 {

    public static void main(String[] args) {

        // string is an object  //String literal

        String  s1 = "Ankara";
        String  s5 = "Istanbul";


        //new -> operator
        String s2  =  new String("Welcome");
        String s3  =  new String("Good luck!");

        // split (deyeri bolmek uchun)
        // trim ( metn ichinde bosluqlari legv etmek)

        String  s = "Rahul Shetty Academy";
        String[] splittedString = s.split("Shetty");

        //System.out.println(splittedString[0]);
        //System.out.println(splittedString[1]);

        System.out.println(splittedString[1].trim());
        // charAt ( butun char-lari liste verir)
        for (int i =0; i < s.length(); i++ )
        {
            System.out.println(s.charAt(i));
        }

    }

}
