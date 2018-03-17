package com.company;

import java.util.Random;

public class Sort
{

    public static void BubbleSort(int[] array)
    {

//long StartTime = System.nanoTime();

        for (int i = 0; i < array.length - 1; i++)
        {
            boolean swap = false;
            for (int j = 0; j < array.length - i - 1; j++)
            {
                if (array[j] > array[j + 1])  //compare for asc(if we need desc: <)
                {
                    int temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swap = true;
                }
            }

            if (swap == false)//the list is sorted we don't need any check
            {
                break;
            }
        }

/*optional if we want to count the process time of the algorithm nanosec

        long EndTime = System.nanoTime();
        long duration = EndTime - StartTime;
        System.out.println("Time time executed ns:"+duration);
*/

    }

    public static void SelectionSort(int[] array)
    {


        for (int i = 0; i < array.length - 1; i++)//.i<length-1: when we get there we are sure the next is the max!
        {
            int min_pos = i;
            for (int j = i + 1; j < array.length; j++) {
                if (array[j] < array[min_pos])//checking for the min element
                {
                    min_pos = j;  //set the min in pos j
                }
            }

            //swap
            int temp = array[min_pos];
            array[min_pos] = array[i];
            array[i] = temp;
        }


    }

    public static void InsertionSort(int[] array)
    {


        int j=0;
        for(int i=1; i<array.length; i++)
        {
            j=i;
            while (j>0 && array[j-1]>array[j]) //J>0 because in j=j-1 at the end of while loop
            {
                //swap
                int temp = array[j];
                array[j] = array[j-1];
                array[j-1] = temp;


                j=j-1;
            }
        }


    }

    public static void QuickSort(int[] array, int left, int right)
    {

        int l = left;
        int r = right - 1;
        int size = right - left;
        if(size >1)
        {
            Random rn = new Random();
            int pivot = array[rn.nextInt(size) + l];
            while (l < r)
            {
                while (array[r] > pivot && r > l)
                {
                    r--;
                }
                while (array[l] < pivot && l <= r)
                {
                    l++;
                }
                if (l < r)
                {
                    int temp = array[l];
                    array[l] = array[r];
                    array[r] = temp;
                    l++;
                }


                QuickSort(array, left, l);
                QuickSort(array, r, right);
            }
        }


    }

   public static void merge(int[] array, int l, int m, int r)
   {
        int n1 = m-l+1;
        int n2 = r-m;

        int L[] = new int [n1];
        int R[] = new int [n2];

        for(int i=0; i<n1; i++)
            L[i] = array[l+i];
        for(int j=0; j<n2; j++)
            R[j] = array[m+1+j];

        int i = 0, j = 0;
        int k = l;
        while (i < n1 && j < n2)
        {
            if (L[i] <= R[j])
            {
                array[k] = L[i];
                i++;
            } else
            {
                array[k] = R[j];
                j++;
            }
            k++;
        }
        while (i < n1)
        {
            array[k] = L[i];
            i++;
            k++;
        }
        while (j < n2)
        {
            array[k] = R[j];
            j++;
            k++;
        }
    }
    public static void mergeSort(int[] array, int l, int r)
    {
        if (l < r)
        {
            int m = (l+r)/2;
            mergeSort(array, l, m);
            mergeSort(array, m+1, r);
            merge(array, l, m, r);
        }
    }

}

