//WAP to demonstrate use of break and continue 
public class Question17 {
    public static void main(String[] args) {
        int i;
        System.out.println("Number from 1 to 10 skipping the num divided by 2 are:");
        for(i=1;i<10;i++){
            if (i%2==0){
                continue;
            }
            System.out.print(i+", ");
        }
        System.out.println("\nLoop is terminated when i=15");
        for(i=10;i<30;i++){
            if(i==15){
                break;
            }
            System.out.print(i+", ");
        }

    }
    
}
