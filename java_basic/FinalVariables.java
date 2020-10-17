/* 
Final Variables: 
However, you can add the 'final' keyword if you don't want others (or yourself) to overwrite existing values 
(this will declare the variables as "final" or "constant", which means unchangeable and read-only):
*/


/**
 * Other Types 
 * int myNum = 5;
 * float myFloatNum = 5.99f;
 * char myLetter = 'D';
 * boolean myBool = true;
 * String myText = "Hello";
 */

public class FinalVariables {
    public static void main(String[] args) {
        final int myNum = 15;
        myNum = 20; // will generate an error 
        System.out.println(myNum);
    }
}
