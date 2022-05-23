package sampleapp;

import com.beust.ah.A;

import java.util.ArrayList;

public class CoreJava {

    public static void main(String[] args) {

        int[] arr2 = {1,2,4,5,6,7,8,9,10,122};

        //2,4,6,8,10,122 ( cut)

        for (int i =0; i < arr2.length;i++)

        {
            // % 2 (multiple of entered number (2) )
            if (arr2[i] % 2 == 0)

            {
                System.out.println(arr2[i]);
                // check from list first if multiple or no ( break)
                break;
            }
            else
            {
                System.out.println(arr2[i] +"is not multiple of 2");
            }
        }
        //create object of class - object.method
        ArrayList<String> myList = new ArrayList<String>();
        myList.add("ibragim");
        myList.add("tural");
        myList.add("ataxan");
        myList.add("elnur");
        System.out.println(myList.get(3));

    }

}
