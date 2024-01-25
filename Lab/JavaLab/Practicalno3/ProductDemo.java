package Practicalno2.Practicalno3;
class Product{
    String name;
    int price, qty;
    public Product(String name, int price, int qty){
        this.name=name;
        this.price=price;
        this.qty=qty;
    }
    public String getName(){
        return name;
    }
    public int getQty(){
        return qty;
    }
    public int getPrice(){
        return price;
    }
    public int getTotal(){
        int total=qty*price;
        return total;
    }
}
public class ProductDemo {
    public static void main(String[] args) {
        Product p1=new Product("MacBook",5000,50);
        System.out.println("Name : "+p1.getName());
        System.out.println("Quantity : "+p1.getQty());
        System.out.println("Price : "+p1.getPrice());
        System.out.println("Total cost in $ : "+p1.getTotal());  
        Product p2=new Product("Iphone 14 pro Max",2000,100);
        System.out.println("Name : "+p2.getName());
        System.out.println("Quantity : "+p2.getQty());
        System.out.println("Price : "+p2.getPrice());
        System.out.println("Total cost in $ : "+p2.getTotal());
    }
    
}
