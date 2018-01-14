# Sorting_Algorithms
Basic algorithms for sorting custom or random input in ascending order(10 numbers integers)


IDE:IntelliJ IDEA Ultimate 2017.2.5
programming language:Java
Revision Control System: Git(Sharing an IntelliJ project on Github)
Type:console application



File class:
Main.java : We choose implent sorting custom or random input
Data.java : Methods input,print and select with which algorith we are going to implement sorting
Sort.java : BubbleSort,SelectionSort,InsertionSort,MergeSort,QuickSort (Basic known sort algorithms)
R.java :  Rand method for input. betwen [-100,100] only integers


*explain rum-time
--------------------------------------------------------------------------------------------------------
--custom--
Please choose 1 or 2: 1.Custom Input 2.Random Input--  *we can choose from 1 or 2
1                                                       *assume that we enter 1
Please insert the numbers:1 4 5 2 1 4 7 8 5 1                 *only integers 10 elements



--Select the Algorithm you want to implement sorting--
--0:Exit 1.BubbleSort 2.SelectionSort 3.InsertionSort 4.QuickSort 5.MergeSort--
1
Sorted:Array elements:1 1 1 2 4 4 5 5 7 8   *here is the sorted list via Bubblesort(we have entered case 1)
------------------------------------------------------------------------------------------------------------
--random--
Please choose 1 or 2: 1.Custom Input 2.Random Input--
2
Array elements:33 10 4 -10 -73 -65 76 -60 76 -61    * 10 elements of random numbers [-100,100] as i set


--Select the Algorithm you want to implement sorting--
--0:Exit 1.BubbleSort 2.SelectionSort 3.InsertionSort 4.QuickSort 5.MergeSort--
4                                                                 *QuickSort        
Sorted:Array elements:-73 -65 -61 -60 -10 4 10 33 76 76  
---------------------------------------------------------------------------------------------------------------

**optional:When working with any kind of algorithm ,it is important to know how fast it runs,
So  if we want to count the process time of the algorithm.
Inside method BubbleSort(It is with comments) 
long StartTime = System.nanoTime();
.
.
.
.
long EndTime = System.nanoTime();
        long duration = EndTime - StartTime;
        System.out.println("Time time executed ns:"+duration);











