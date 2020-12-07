package com.company;
/*
The keyword super is commonly used method overriding, when we call a method with the sane name from the parent class. In the example below we have a method printMethod that calls super.printMethod.

In other words it's calling the method with the same name from the parent class. Without the keyword super in this case it would be recursive call. Meaning that the method would call it self forever (or until memory is fully used). That is why the super keyword is needed.
*/

/*
this() vs super() call
1. Use this() to call a constructor from another overloaded constructor in the same class.
2. The call to this() can be used only in a constructor, and it must be the first statement in a constructor. It's used with constructor chaining, in other words when one constructor calls another constructor, and helps to reduce duplicated code.
3. The only way to call a parent constructor is by calling super(). This calls the parent constructor.
4. The Java Compiler puts a default call to super() if we don't add it, and it is always the no-args super which is inserted by compiler (constructor without arguments).
4. The call to super() must be the first statement in each constructor.
5. Even Abstract classes have constructors, although you can never instantiate an abstract class using the new keyword.
6. An abstract class is still a super class, so its constructors run when someone makes an instance of a concrete sub class.
NOTE: A constructor can have a call to super() or this but never both.
*/
class SuperClass { // parent class aka super class
    public void printMethod() {
        System.out.println("Printed in Superclass");
    }
}

class SubClass extends SuperClass{ // subclass aka child class
    // overrides method from parent
    @Override
    public void printMethod() {
        super.printMethod(); // calls method in SuperClass (parent)
        System.out.println("Printed in Subclass");
    }
}

public class Main {

    public static void main(String[] args) {
	SubClass s = new SubClass();
	s.printMethod();
    }
}
