
package practice;

public class Delete {
    public static void main(String[] args) {
       /* StringBuffer s1= new StringBuffer("Nabinloveallgirl");
        s1.delete(12,16);
        System.out.println(s1);*/
        //using charAt
        String str="Hari is good boy";
        char hari= str.charAt(str.length()-1);
        if(hari=='y'){
            System.out.println(str);
        }
    }
    
}
