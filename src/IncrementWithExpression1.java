public class IncrementWithExpression1 {

    public static void main(String[] args) {

        int b = 5;

        int c = b++ + ++b;

        System.out.println(c);

        //c = 5 + 7; // because b++ gave 5, ++b gave 7 => 12


    }
}
