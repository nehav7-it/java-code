public class IncrementOperatorExample1 {

public static void main(String[] args) {

    int a = 10;
    a = a++;
    System.out.println(a);
    /*

   Let's break down a = a++;
    Step 1 -  'a' is assigned the current value of a -> 10
    Step 2- Then 'a' is incremented to 11
    Step 3- But the incremented value is lost as the old value (10) is assigned back to 'a'

    Hence current value of a is 10
 */




}
}
