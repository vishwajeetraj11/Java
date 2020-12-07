package com.company;

public class Main {

    public static void main(String[] args) {
	 int value = 1;
	 if(value == 1) {
         System.out.println("Value: "+value);
     } else if(value == 3) {
         System.out.println("Value: "+value);
     }

	 int switchValue = 3;
	 switch(switchValue){
         case 1:
             System.out.println("Value: 1 ");
             break;
         case 2:
             System.out.println("Value: 2");
             break;
         case 3: case 4: case 5:
             System.out.println("Was a 3 or 4 or 5");
             break;
         default:
             System.out.println("Was not 1 or 2");
             break;
     }
    }
}
