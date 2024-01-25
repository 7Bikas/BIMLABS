public class Question18 {
    public static void main(String[] args) {
        int i;
        for (i=0;i<100;i++){
            if(i==25||i==40||i==90){
                continue;
            }
            System.out.print(i+", ");
        }
    }
    
}
