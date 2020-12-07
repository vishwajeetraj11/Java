package com.company;
/*
OPERATOR- Operators in Java are special symbols that perform specific operations on one. two. or three operands, and then return a result.

Operand - An operand is a term used to describe any object that is manipulated by an operator. If we consider this statement.

int myVar = 13 + 34;
Then + here is the operator, abd 13 and 34 are operands. Variables used instead of literals are also operands. (Literals = "the text:message we write inside of :System.out.println():)

Expression - An Expression is formed by combining variables, literals, method return values (which we haven't covered yet) and operator.

In the line below 14+10 is expression which has (or returns) 27 in this case.
int my Value = 14+10;

Conditional Logic :
Conditional Login uses specific statements in Java to allow us to check a condition and execute certain code based on whether that condition(the expression) is true or false.

Logical AND and Logical OR
&& is the Logical AND which operates on boolean operands - Checking if a given condition in true or false.

|| is the Logical OR which operates in boolean operands - Checking if a given condition is true or false


* */
public class Main {

    public static void main(String[] args) {
        int result = 1+2;
        System.out.println("1 + 2 = "+result);
        result = result + 10;
        System.out.println("3 + 10 = "+result);

        boolean isAboveTwenty = false;

        if(isAboveTwenty) {
//            System.out.println("Should Vote");
        } else {
//            System.out.println("Should not Vote");
        }

        int topScore = 900;
        if(topScore != 100) {
            System.out.println("Your obtained a score not equal to 100");
        }
        else if(topScore == 100) {
            System.out.println("You got the high score!");
        }

        if(topScore < 100) {
            System.out.println("Less than 100");
        } else {
            System.out.println("More that 100");
        }

        int secondTopScore = 80;
        // && checks if both side are true
        if((topScore > secondTopScore) && (topScore < 100)) {
            System.out.println("Greater than second top score and less than 100");
        }

        if((topScore > 90) || (secondTopScore <= 90)) {
            System.out.println("Either or both of them true");
        }

        double challengeDoublevar = 20.00d;
        double challenge2ndDoublevar = 80.00d;
        double challenge = ((challenge2ndDoublevar+challengeDoublevar)*100)%40.00d;
        System.out.println(challenge);
        boolean Remainder = (challenge == 0) ? false : true;

        if(Remainder) {
            System.out.println("Got some remainder");
        } else  {
            System.out.println("Didn't get any remainder");
        }

    }
}
