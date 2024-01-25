/*Write a program to demonstrate all conditional statement (if, if…else, if..elseif..else) 
    and loops (while, do while, for and for each loop)
     */
    public class Question7 {
        public static void main(String[] args) {
            int a = 20;
            int b = 15;
            int c = 11;
            // using if
            if (a > b) {
                System.out.println(a + " is greater than " + b);
            }
            // using if...else
            if (a < b) {
                System.out.println(a + " is smaller than " + b);
            } else {
                System.out.println(b + " is smaller than " + a);
            }
            // using if...else if...else
            if (a > b && a > c) {
                System.out.println(a + " is greatest.");
            } else if (b > a && b > c) {
                System.out.println(b + " is greatest");
            } else {
                System.out.println(c + " is greatest.\n");
            }
            // using while
            System.out.println("Whole numbers from 0 t0 2: ");
            int num = 0;
            int num1=0;
            while (num <= 2) {
                System.out.print(num++ + ", ");
            }
            // using do while
            System.out.println("\nWhole numbers from 0 t0 4: ");
            do {
                System.out.print(num1++ + ", ");
            } while (num1 != 4);
            // using for
            System.out.println("\nEven numbers between 1 to 10 are:");
            for (int i = 1; i < 10; i++) {
                if (i % 2 == 0) {
                    System.out.print(i + ", ");
                }
            }
            System.out.println("");
            // using for each loop
            System.out.println("for each loop eg :");
            int x[] = { 1, 2, 3 };
            for (int i : x) {
                System.out.print(i+", ");
            }
        }
    
}
