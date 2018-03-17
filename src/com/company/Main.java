package com.company;




import java.util.Scanner;

public class Main
{



    public static void main(String[] args)
    {
        int[] array = new int[10];
        String select;
        System.out.println("\nPlease choose 1 or 2: 1.Custom Input 2.Random Input");
        Scanner in = new Scanner(System.in);
        select = in.nextLine();

        switch (select)   //select custom or random input
        {
            case "1":
                Data.input(array);
                Data.select(array);
                break;
            case "2":
                R.rand();
                break;
            default:                       //catch all execeptions...select is String
                System.out.println("wrong input");
                break;


        }

    }
}
