/*
 */
package Labsheet8;
public class Q3 {
    public static void main(String[] args) {
        double num1 = 15.6, num2 = 3.2;
        
        // 1. abs() function
        double absNum = Math.abs(num1);
        System.out.println("Absolute value of " + num1 + ": " + absNum);
        
        // 2. ceil() function
        double ceilNum = Math.ceil(num1);
        System.out.println("Ceiling value of " + num1 + ": " + ceilNum);
        
        // 3. floor() function
        double floorNum = Math.floor(num1);
        System.out.println("Floor value of " + num1 + ": " + floorNum);
        
        // 4. max() function
        double maxNum = Math.max(num1, num2);
        System.out.println("Maximum value between " + num1 + " and " + num2 + ": " + maxNum);
        
        // 5. min() function
        double minNum = Math.min(num1, num2);
        System.out.println("Minimum value between " + num1 + " and " + num2 + ": " + minNum);
        
        // 6. pow() function
        double powNum = Math.pow(num1, 2);
        System.out.println(num1 + " raised to the power of 2: " + powNum);
        
        // 7. round() function
        double roundNum = Math.round(num1);
        System.out.println("Rounded value of " + num1 + ": " + roundNum);
        
        // 8. sqrt() function
        double sqrtNum = Math.sqrt(num1);
        System.out.println("Square root of " + num1 + ": " + sqrtNum);
        
        // 9. random() function
        double randomNum = Math.random();
        System.out.println("Random number: " + randomNum);
        
        // 10. sin() function
        double sinNum = Math.sin(Math.toRadians(num1));
        System.out.println("Sine value of " + num1 + ": " + sinNum);
    }
}
 