/*
 */
package Labsheet8;
public class Q1 {
    public static void main(String[] args) {
         String str = "Hello World";
        
        // 1. length() function
        int len = str.length();
        System.out.println("Length of " + str + ": " + len);
        
        // 2. charAt() function
        char c = str.charAt(0);
        System.out.println("First character of " + str + ": " + c);
        
        // 3. indexOf() function
        int index = str.indexOf("World");
        System.out.println("Index of 'World' in " + str + ": " + index);
        
        // 4. substring() function
        String sub = str.substring(0, 5);
        System.out.println("Substring of " + str + ": " + sub);
        
        // 5. toLowerCase() function
        String lower = str.toLowerCase();
        System.out.println("Lowercase of " + str + ": " + lower);
        
        // 6. toUpperCase() function
        String upper = str.toUpperCase();
        System.out.println("Uppercase of " + str + ": " + upper);
        
        // 7. trim() function
        String newStr = "   Hello World   ";
        String trim = newStr.trim();
        System.out.println("Trimmed version of " + newStr + ": " + trim + " ");
        
        // 8. replace() function
        String replaced = str.replace("World", "Java");
        System.out.println("Replaced version of " + str + ": " + replaced + "");
        
        // 9. startsWith() function
        boolean starts = str.startsWith("He");
        System.out.println("Does" + str + " start with 'He'? " + starts);
        
        // 10. endsWith() function
        boolean ends = str.endsWith("ld");
        System.out.println("Does " + str + " end with 'ld'? " + ends);
    }
}
