package sampleapp;

public class MethodsDemo {

    public static void main(String[] args) {

        MethodsDemo  d = new MethodsDemo();
        // awagidaki funksiani cagirmaq :
       String name = d.getData();
       System.out.println(name);
       MethodsDemo2 d1 =new MethodsDemo2();
       d1.getUserData();
       getData2();


    }

    public String getData()
    {
        System.out.println("Call method test first class");
        return "return my test first class";
    }
    public static String getData2()
    {
        System.out.println("hello world");
        return "rahul shetty";
    }


}
