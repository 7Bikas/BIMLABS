package Sorting;
import java.util.Scanner;
class Bubble{
    public void sort(){
        int size, i, j,arr[], temp;
        Scanner sc= new Scanner (System.in);
        System.out.println("Enter the size of the array :");
         size =sc .nextInt();
         arr= new int[size];
         System.out.println("Enter the element :");
         for( i=0;i<size;i++){
            arr[i]=sc.nextInt();
         }
         for(i=0;i<size-1;i++){
            for(j=0;j<size-i-1;j++){
                if(arr[j]>arr[j+1]){
                    temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
         }
         System.out.println("Sorted elements are :");
         for(i=0;i<size;i++){
            System.out.print(" "+arr[i]);

         }

    }

}
public class Bubblesort{

    public static void main(String[] args) {
        Bubble b1= new Bubble();
        b1.sort();
    }
}