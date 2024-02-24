import java.util.Scanner;
public class LinearSearch{
    public static String Search(int key,int []arr){
        //performing Linear Search algorithm
        for(int i=0;i<=arr.length-1;i++){
           if(key==arr[i]){
            return("found key "+arr[i]+" at index "+i);
           }
        }
        return("Not found! "+key);
    }
    public static void main(String[] args){
        //Creating a array by taking user input.
        System.out.println("Enter size of array: ");
        Scanner sc=new Scanner(System.in);
        int size=sc.nextInt();
        int[] arr=new int[size];
        System.out.println("Enter values of array: ");
        for(int i=0;i<=arr.length-1;i++){
            arr[i]=sc.nextInt();
        }
        //Display the array.
        System.out.println("before Searching: ");
        for(int x:arr){
            System.out.print(x+" ");
        }
        System.out.print("\nEnter value of key should be found: ");
        //Taking key value from user.
        int key =sc.nextInt();
        sc.close();
        System.out.println("After searching: ");
        System.out.println(Search(key, arr));
    }
}