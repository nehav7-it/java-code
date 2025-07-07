public class MultiplicationTable5 {
    public static void main(String[] args) {
        System.out.println("Multiplication Table of 5");
        System.out.println("========================");
        
        // Print multiplication table of 5 from 1 to 10
        for (int i = 1; i <= 10; i++) {
            int result = 5 * i;
            System.out.println("5 x " + i + " = " + result);
        }
    }
}