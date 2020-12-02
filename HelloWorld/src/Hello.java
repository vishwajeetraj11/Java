/* The public Java keyword is an Access Modifier.

 An access modifier allows us to define the scope or how other parts of your code or even some else's code can
 access this code.

 The class keyword is used to define a class with the name following the keyword - Hello in this case and left
 and right curly braces to define the class block.

 public class is optional

 Method : Its a collection of statements (one or more) that performs an operation. We'll be using a special method
 called the main method that Java looks for when running a program. It's entry point of any Java Code.

 static is a Java Keyword.
 Advanced but for now: We need to have static for Java to find our method to run the code we are going to add.


  Variables are a way to store information in out computer. Variables that we define in a program can be
  accessed by the name we give them, and the computer does the hard work of figuring out where they get stored
  in computer's RAM.

  A variable, as the name suggests can be changed, in other words, it's contents are variable.

  Tell the computer what type of information we want to store in the variable, and give it a name.

  Expression: It is a construct that evaluates to a single value.

  Primitive Types: 8  - boolean, byte, char, short, int, long, float and double
  */


public class Hello {
    public static void main(String[] args) {
        String name = "Vishwajeet Raj";
        int age = 21;
        System.out.println("Hello " + name + ", Is you age " + age + "?");
        System.out.println("Vishwajeet Raj's Age is "+age);

    }
}
