package com.company;
/*
A char occupies two byte of memory, or 16 bits and thus has a width of 16. The reason it's not just a single byte is that it allows you to store Unicode Characters.

Unicode - It's an international encoding standard for use with different languages and scripts, by which each letter, digit, or symbol is assigned a unique numeric value that applies across different platform and programs.

In the English alphabet, we have the letters A through Z. Meaning only 26 characters are needed in total to represent the entire English Alphabet. But other languages need more characters, and ofter a lot more.

Unicode allows us to represent these languages and the way it works is that by using a combination of the two bytes that a char takes up in memory it can it can represent and one of 65535 types of characters.


Boolean Primitive Type

A boolean value allows for two choices. True or False, Yes or No, 1 or 0. In Java terms we have a boolean primitive types and it can be set to two values only. true or false.
 */
public class Main {

    public static void main(String[] args) {
	 char myChar = 'D';
	 char myUnicodeChar = '\u0044';
        System.out.println(myChar);
        System.out.println(myUnicodeChar);

    }
}
