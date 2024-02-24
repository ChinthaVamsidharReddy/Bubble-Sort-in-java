# Bubble-Sort-in-java
//Bubble Sort using ja
code:
import java.util.Scanner;
public class BubbleSorting{
    public static int[] BubbleMethod(int []arr){
        //Bubble sorting algorithm
        int temp=0;
        for(int i=0;i<=arr.length-2;i++){
            for(int j=0;j<=arr.length-2-i;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j+1];
                    arr[j+1]=arr[j];
                    arr[j]=temp;
                }
            }
        }
        return arr;
    }
    public static void main(String[] args){
        //taking size of the Array
        System.out.println("Enter size of array: ");
        Scanner input=new Scanner(System.in);
        int size=input.nextInt();
        int[] arr=new int[size];
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=input.nextInt();
        }
        //Display the array before Sorting
        System.out.print("Before  sorting elements are: \n");
        for(int x:arr){
            System.out.print(x+" ");
        }
        //Display the array After Sorting
        System.out.print("\nAfter sorting elements are: \n");
        //calling method
        int [] After=BubbleMethod(arr);
        //Display the array
        for(int x:After){
            System.out.print(x+" ");
        }

    }
}
