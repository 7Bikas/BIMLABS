package Recursion;

public class TowerOfHannoi {
    void toh(int n, String source, String auxilary, String destination){
        if(n<=0){
            return;
        }
        else{
            toh(n-1,source,destination,auxilary);
            System.out.println("Disk"+n+" move frome "+source+ " to "+ destination);
            toh(n-1, auxilary, source, destination);
        }
    }
    public static void main(String[] args) {
        TowerOfHannoi hn= new TowerOfHannoi();
        hn.toh(3,"A","B","C");
    }
}
