public class Question4 {
    public static void main(String[] args) {
        int i=105;
        float f=i; //smaller data type to bigger data type 
        System.out.println("Implicit  type casting from int to float : "+f);
        double d=8.34;
        int i1=(int)d;//bigger data type to smaller data type 
        System.out.println("Explicit type casting from double to int : "+i1);
    }
    
}
