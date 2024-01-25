
package Orchid;
class SwapArray{
    public <T> void swap(T[] arr, int i,int j) {
        T temp= arr[i];
        arr[i]=arr[j];
        arr[j]=temp;
    }   
    
}

public class Qn20 {
    public static void main(String[] args) {
        Integer[] intArr={1,22,4,56,6,8};
        String[] strArr={"apple", "banana","Cherry","Orange"};
      SwapArray s1= new SwapArray();
      s1.swap(intArr, 1, 2);
      SwapArray s2= new SwapArray();
      s2.swap(strArr, 1,0 );
      
        System.out.println("After swapping :");
        for(int i=0;i<intArr.length;i++){
            System.out.print(intArr[i]+",");
        }
        System.out.println("\nString array");
        for(int i=0;i<strArr.length;i++){
            System.out.print(strArr[i]+",");
        }
    }
    
}
