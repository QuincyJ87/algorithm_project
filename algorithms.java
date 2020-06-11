import java.io.*;
import java.util.Random;
import java.io.PrintWriter;
import java.io.File;

public class Algorithms{
	
    public static void main(String[]args)throws Exception
    {
    	System.out.println("Quincy Jackson");
    	System.out.println("Joushua Wormley");
    	 System.out.println("**********************************************************");
        Random num = new Random(1900);
        Sorts connect=new Sorts();
        double [] uniquearray = new double[221];
        //double[] spareArray;
        System.out.println("Random Array of Numbers");
        System.out.println("**********************************************************");
        for(int l = 0; l < uniquearray.length; l++)
        {
            uniquearray[l] = num.nextInt(523);
            if((l+1)%9!=0)
            System.out.print(uniquearray[l]+" ");
            else
            {
            System.out.print(uniquearray[l]+" ");
            System.out.println();}
        }
        printToFile(uniquearray);
        connect.display(uniquearray);
        connect.bubbleSort(uniquearray);
        connect.selectionSort(uniquearray);
        connect.insertionSort(uniquearray);
        
    }
private static class Sorts{
    public Sorts() 
    {
}
    void display(double[] a)
{
for(int i=0; i <= 120; i++) 
{
 
    }
    
 }
    void bubbleSort(double[] uniquearray)
{
        double swap;
        int comp=0;
        int swaps=0;
            for(int c = 0; c < uniquearray.length - 1; c++)
            {comp++;
            for (int d = 0; d < uniquearray.length - 1; d++)
            { 
             if (uniquearray[d] > uniquearray[d+1])
             {
                 swap=uniquearray[d];
                 uniquearray[d]=uniquearray[d+1];
                 uniquearray[d+1]=swap;
                 swaps++;
            }
            }
            }
          
            
            int count = 0;
            System.out.println("\n***********************************************************************************");
            System.out.println("BubbleSort");
       
            for (int c = 0; c < uniquearray.length - 1; c++)
            {
                if(count==9)
                {
                    System.out.print("\n"); 
                    count = 0;
                 }
                 count ++;
                 System.out.print(uniquearray[c] +" ");
        
       
                }
            
           System.out.println();
        System.out.println("Total swaps for BubbleSort: "+ swaps);
        System.out.println("Total comparisons for BubbleSort: "+ comp);
}
double smallerNumber=0;
double tempval=0;
int comparisons = 0;
int swaps = 0;
void selectionSort(double[] arr)
{
    int comparisons = 0;
     int swaps = 0;
            for (int i = 0; i <= arr.length - 2; i++)
        {
            int smallerNumber = i;
            comparisons++;
            for (int j = i + 1; j <= arr.length - 1; j++)
            {
                comparisons++;
                if (arr[j] < arr[smallerNumber])
                {
                    smallerNumber = j;
                    swaps++;
                }
            }
            tempval = arr[i];
            arr[i] = arr[smallerNumber];
            arr[smallerNumber] = tempval;
        
        }
        System.out.println("\n********************************************");
        System.out.println("Selection Sort:");
        int count = 0;
            for (int i = 0; i < arr.length - 1; i++)
            {
                if(count==9)
                {
                    System.out.print("\n"); 
                    count = 0;
                 }
                 count ++;
                 System.out.print(arr[i] +" ");
            }
            System.out.println("\nTotal number of comparisons: " + comparisons);
        System.out.println("\nTotal number of swaps: " + swaps);
}
void insertionSort(double[] arr)
    {
        int comp =0;
            int swap=0;
        for(int i = 1; i < arr.length; i++)
        {
         
            double valueToSort = arr[i];
            int j = i;
            comp++;
            while (j > 0 && arr[j - 1] > valueToSort)
            {
                arr[j] = arr[j - 1];
                j--;
                swap++;
            }
            arr[j] = valueToSort;
            
        }
            int count = 0;
            System.out.println("\n***********************************************************************************");
            System.out.println("InsertionSort");
       
         for (int c = 0; c < arr.length - 1; c++)
            {
                if(count==9)
                {
                    System.out.print("\n"); 
                    count = 0;
                 }
                 count ++;
                 System.out.print(arr[c] +" ");
        
       
                }
                
                System.out.println("\ntotal Insertion sort swaps: "+ swap);
                System.out.println("total Insertion comparisons: "+ comp);
}


}
public static void printToFile(double[] x)
{
    try
    {
        File file = new File("P2.out");
        PrintWriter printwriter = new PrintWriter(file);
        if(file.exists())
        {
            printwriter = new PrintWriter(file);
        }
        else
        {
            file.createNewFile();
            printwriter = new PrintWriter(file);
        }
    }catch(Exception e)
    {}
}
             
}
