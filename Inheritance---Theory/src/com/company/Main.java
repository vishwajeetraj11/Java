package com.company;
/*
What Object oriented programming really allows us to do is to create classes to inherit commonly used state and behaviour of classes.

reference, object, instance and class -- in context of Java

Lets use the analogy of building a house to understand Classes.
A class is basically a blueprint for a house, using the blueprint (plans) we can build as many houses as we like based on those plans.

Each house you build (in other words instantiate using the new operator) is an object also known as an instance.

Each house you build has an address (a physical location). In other words if you want to tell someone where you live, you give them your address (perhaps written on a piece of paper). This is known as reference.

You can copy the reference as many times as you like but there is still just one house. In other words we are copying the paper that has address on it not the house itself.

We can pass references as parameters to constructors and methods

super -- keyword  -- It is used to access/call the parent class members (variables and methods).
this -- keyword -- It is used to call the current class members (variables and methods). This is required when we have a parameter with the same name as an instance variable (field).

NOTE: We can use both of them anywhere in a class except static areas (the static block or a static method). Any attempt to do so will lead to compile-time errors.


Method Overloading **********************************
1. Method overloading means providing two or more separate methods in a class with the same name but different parameters.
2. Method return type may or may not be the different and that allows us to reuse the same method name.
3. Overloading is very handy, it reduces duplicated code and we don't have to remember multiple methods names.

Overloading does not have anything to do with polymorphism but Java developers often refer to overloading as Compile Time Polymorphism.
In other words the compiler decided which method is going to be called based on the method name, return type and argument list.

We can overload static and instance methods (more about the difference between static and instance methods later in the course.

Usually overloading happens inside a single class, but a method can also be treated as overloaded in the subclass of that class.

That is because a subclass inherits one version of the method from the parent class and then the subclass can have another overloaded version of method.

Methods will be considered overloaded if both follow the following rules
. Methods must have the same method name.
. Methods must have different parameters.

If methods follow the rule above then they may or may not
. Have different return types.
. Have different access modifiers.
. Throw different checked or unchecked exceptions.

Method Overriding:
.Method overriding means defining a method in a child class that already exists in the parent class with same signature (same name, same arguments).
.By extending the parent class the child class gets all the methods defined in the parent class (those methods are also known as derived methods).
. Method overriding is also known as Runtime Polymorphism and Dynamic Method Dispatch, because the method that is going to be called is decided at runtime by the JVM. (Java Virtual Machine i guess).

When we override a method it's recommended to put @Override immediately above the method definition. This is an annotation that the compiler reads and will then show us an error if we don't follow overriding rules correctly.

We can't override static methods only instance methods.

Method will be considered overridden if we follow these rules
. It must have same name and same arguments.
. Return type can be a subclass of the return type in the parent class.
. It can't have a lower access modifier.
. For example if the parent method is protected then using private in the child is not allowed but using public in the child would be allowed.

There are also some important points about method overriding to keep in mind
. Only inherited methods can be overridden, in other words methods can be overridden only in child classes.
. Constructor and private methods cannot be overridden.
. Methods that are final cannot be overridden.
. A subclass can use super.methodName() to call the superclass version of an overridden method.

Method Overloading
1. Provides functionality to reuse a method name with different parameters.
2. Usually in a single class but may also be used in a child class.
3. Must have different parameters.
4. May have different return types.
5. May have different access modifiers (private, protected, public).
6. May throw different exceptions.

Method Overriding
1. Used to override a behaviour which the class has inherited from the parent class.
2. Always in two classes that have a child-parent or IS-A relationship.
3. Must have the same parameters and name.
4. Must have the same return type or covariant return type (child class).
5. Must NOT have a lower modifier but may have a higher modifier.
6. Must NOT throw a new or broader checked exception.

Static Methods
1. Static methods are declared using a static modifier.
2. Static methods can't access instance methods and instance variables directly.
3.They are usually used for operations that don't require any data from an instance of the class(from 'this').
4. In these methods, we don't have access to the this keyword. (we don't use it).
5. Whenever you see a method that does not use instance variable that method should probably be declared as a static method.
6. For example main is a static method and it is called by the JVM when it starts an application.

Instance Methods:
1. Instance methods belong to a instance of a class.
2. To use an instance method we have to instantiate the class first usually by using the new keyword.
3. These methods can access instance methods and instance variables directly.
4. These methods can also access static methods and static variables directly.

Static Variables:
1. Declared by using keyword static.
2. Static variables are also known as static variables.
3. Every variables are also known as static member variable.
4. If changes are made to that variable, all other instance will see the effect of the change.

Instance Variables
1. They don't use the static keyword.
2. Instance variables are also known as fields or member variables.
3. Instance Variables belong to an instance of a class.
4. Every instance has it's own copy of an instance variable.
5. Every instance can have a different value (state).
6. Instance variable represent the state of an instance.
 */
public class Main {

    public static void main(String[] args) {
	// write your code here
        Animal animal = new Animal("Animal", 1,1,5,5);
        Dog dog = new Dog("Yorkie", 8,20,2,4,1,20,"long silky");
        dog.eat();
        dog.walk();
        dog.run();
    }
}
