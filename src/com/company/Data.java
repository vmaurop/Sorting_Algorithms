package com.company;


import java.util.Scanner;

public class Data
{

    public static int[] input(int[] array)//input for custom array
    {

        Scanner in = new Scanner(System.in);

        System.out.print("Please insert the numbers:");
        try
        {
             for (int i = 0; i < array.length; i++)
                {
                    array[i] = in.nextInt();
                }
        }
        catch (Exception e)   //catch exceptions all
        {
            System.out.println("Only Integers..");
            input(array);
        }

        return array;
    }

    public static void select(int[] array)
    {
        String select;
        System.out.println("\n\n\n--select the Algorithm you want to implement sorting--\n--0:Exit 1.BubbleSort 2.SelectionSort "+
        "3.InsertionSort 4.QuickSort 5.mergeSort--");
        Scanner in = new Scanner(System.in);
        select = in.nextLine();
        switch (select)
        {
            case "0":
                System.exit(0);
            case "1":
                Sort.BubbleSort(array);
                System.out.print("Sorted:");print(array);
                break;
            case "2":
                Sort.SelectionSort(array);
                System.out.print("Sorted:");print(array);
                break;
            case "3":
                Sort.InsertionSort(array);
                System.out.print("Sorted:");print(array);
                break;
            case "4":
                Sort.QuickSort(array,0,array.length);
                System.out.print("Sorted:");print(array);
                break;
            case "5":
                Sort.mergeSort(array, 0, array.length-1);
                System.out.print("Sorted:");print(array);
                break;
            default:
                System.out.print("wrong input");
                select(array);


        }


    }

    public static void print(int[] array) //print array
    {

        System.out.print("Array elements:");
        for(int i:array)
            System.out.print(i + " ");
    }
}
