package sampleapp;

public class TestAcademy {

    public static void main(String[] args) {

        int myNumb =5;
        String myName ="Test Course";
        char myLetter ='Z';
        double dec = 5.99;
        boolean myCard = true;

       // System.out.println(myNumb+  "is tested by me");
        //System.out.println(myName);

        // Arrays:
        int[] arr = new int[5];
        arr[0] =1;
        arr[1] =2;
        arr[2] =4;
        arr[3] =5;
        arr[4] =6;

        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};
      // System.out.println(arr2[0]);

       //  for loop - (i++ ; i+=2) for example

       /*
        for (int i =0; i < arr.length; i++)

        {

            System.out.println(arr[i]);

        }
        for (int i=0; i <arr2.length; i++ )

        {
            System.out.println(arr2[i]);
        }
        */
        String[] name ={"zaza","test","course"};

        for (int i =0; i<name.length;i++)

        {
            System.out.println(name[i]);
        }
        for (String s :name)
        {

        }

    }

}
