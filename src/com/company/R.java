package com.company;
import java.util.*;



public class R
{


    public static void Rand()
    {


        Random rn = new Random();
       // int n = (rn.nextInt((1000-1)+1)+1);//possible elements [1,1000]((max - min)+1)+min)
        int[] array = new int[10];


            for (int i = 0; i < 10; i++)
            {
                array[i] = (rn.nextInt((100 + 100) + 1) - 100);  //possible values [-100,100]

            }
            Data.print(array);
            Data.Select(array);

    }
}
