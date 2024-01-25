//WAP to print prime number occur between 1 to 100.
public class Question11 {
    public static void main(String[] args) {
    int i,j;
    System.out.println("Prime number between 1 t0 100 are :");
        for(i=2; i<100; i++){
        int flag=0;
        for( j=2; j<i; j++){
            if(i%j==0){
                flag++;
                break;
            }
         }
        if (flag==0){
        System.out.print(i+", ");
            }
        }
    }
}

/*public class Question11 {
    public static void main(String[] args) {
        System.out.println("Prime number between 1 to 100 are: ");
        for (int i = 2; i < 100; i++) {
            int flag = 0;
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    flag++;
                    break;
                }
            }
            if (flag == 0) {
                System.out.print(i + ", ");
            }
        }
    }
}*/
