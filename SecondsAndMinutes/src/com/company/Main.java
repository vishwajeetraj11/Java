package com.company;
/*
Question:
Create a method called getDurationString with two parameters, first parameter minutes and 2nd parameter seconds.
You should validate that the first parameter minutes is >= 0.
You should validate that the 2nd parameter seconds is >= 0 and <=59.
The true method should return "Invalid value" in the method if either of the above are not true.
If the parameters are valid then calculate how many hours minutes and seconds equal the minutes and seconds passed to this method and return that value as string in format  "XXh YYm ZZs" where XX represents a number of hours, YY the minutes and ZZ the seconds z.
*/
public class Main {

    public static void main(String[] args) {
//        System.out.println(getDurationString(500,40));
        System.out.println(getDurationString(36050));
        System.out.println(getDurationString(360550));
    }

    private static String getDurationString(long minutes, long seconds) {
        if(minutes >= 0 && (seconds >= 0 && seconds <=59) ) {
            long hours = (int) minutes / 60;
            long remainingMinutes = (int) minutes % 60;
           
            return (hours+"h "+remainingMinutes+"m "+seconds+"s. ");
        }
        return "Invalid Value";
    }

    private static String getDurationString(long seconds) {
        if(seconds > 0) {
            long minutes = seconds / 60;
            long remainingSeconds = seconds % 60;
            return getDurationString(minutes, remainingSeconds);
        }
        return "Invalid Value";
    }
}
