<h1>Java Identifiers</h1>
<p> All java variables must be identified with unique names.
These unique names are called identifiers </p> 

<h1>Java Data Types </h1>
<h3>Example</h3>
<pre>
    int myNum = 5; // Integer (whole number) 
    float myFloatNum = 5.99f; // Floating point number 
    char myLetter = 'D'; // Character 
    boolean myBool = true; // Boolean 
    String myText = "Hello"; //String 
</pre>

<p> Data types are divided into two groups:</p> 
<ul>
    <li>Primitive data types - includes <b>byte</b>, <b>short</b>,<b>int</b>,<b>long</b>,<b>float</b>,<b>double</b>,<b>boolean</b> and </b>char</li>
    <li>Non-Primitive data types - such as String,Arrays and Classes</li>
</ul>


<h1>Java Type Casting </h1>
<p>Type casting is when you assing a value of one primitive data types to another type</p>
<p>
    - Widenning casting (automatically) - converting a smaller type to a larger type size. byte -> short -> char -> int -> long -> float -> double 

    - Narrwoing Casting (manually)- converting a larger type to a smaller size type
    double -> float -> long -> int -> char -> short -> byte 
</p>

<h3>Widening Casting </h3> 
<p>Widening Casting is done automatically when passing a smaller size type to a larger size type:</p>
<pre>
Example:

public class MyClass {
    public static void main(String[] args) {
        int myInt = 9;
        double myDouble = myInt; // Automatic casting: int to double 
        
        System.out.println(myInt); // Output 9 
        System.out.println(myDouble); //out out 9.0
    }
}
</pre>

<h3>Narrowing Casting </h3>
<p>Narrowing casting must be done manually by placing the type in parentheses in front of the value:
</p>
<pre>
Example: 

public class MyClass {
    public static void main(String[] args) {
        double myDouble = 9.78;
        int myInt = (int) myDouble; // Manual casting: double to int 

        System.out.println(myDouble); // Outputs 9.78 
        System.out.println(myInt); // Outputs 9 
    }
}
</pre>