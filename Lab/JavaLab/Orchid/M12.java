
package Orchid;


public class M12 {
    public static void main(String[] args) {
       int[] arr={1,5,7,9,8,4};
       
       for(int i=0;i<arr.length;i++){
           for(int j=i+1;j<arr.length;j++){
               if(arr[i]>arr[j]){
                  int temp= arr[i];
                  arr[i]=arr[j];
                  arr[j]=temp;
               }
           }
       }
       int index=arr.length-2;
        System.out.println("Second largest number is "+arr[index]);
        System.out.println("Arranging in assending order :");
        for(int i=0;i<arr.length;i++){
            System.out.print(arr[i]+",");
        }
    }
    
}
