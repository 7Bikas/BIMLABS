class Work{
    public void calc(int x, int y){
        for (int i=x; i<=y;i++){
            if(i%2!=0)
            System.out.println(i+",");      
        }
    }
    public double calc (double a, double b, double c ){
        return(a*b*c);
    }
    public float calc(float a,float b)
    {
        if (a>b){
            return a;
        }
        else {
            return b;
        }
    }
}
public class Demo{
    public static void main(String []args){
        Work w1 = new Work();
        w1.calc(5,3);
        double c=w1.calc(3.5,5.5,7.6);
        float v=w1.calc(5.1f, 4.6f);
        System.out.println("Multiplication ="+c);
        System.out.println("Greatest is "+v);

    } 
}