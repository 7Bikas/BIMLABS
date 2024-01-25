 
//wap in java to demonstrate arithmetic operator, increment ,decrement ,comprasion, and boolean logical operator
class Question5{
    public static void main(String[] args) {
        int a=5;
        int b=6;
        int sum=a+b;
        System.out.println("sum of a and b :"+sum);//Arithmetic 
        System.out.println("Ater  increasing a by 1 :"+ ++a);//increment 
        System.out.println("After decrement of b by 1 :"+ --b);//Decrement 
        if (a>b){
            System.out.println(a+ " Is greatest ");
        }
        else{
            System.out.println(b+ " Is greatest .");
        }
        if (a>0 && b>0){//logical operator
            System.out.println("Both are positive integer ");
        }
    }    
}