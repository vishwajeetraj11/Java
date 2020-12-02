package com.company;

public class Main {

    public static void main(String[] args) {
	byte ByteValue = 43;
	short ShortValue = 100;
	int IntValue = 231;
	long LongValue = (long)(5000 + 10 * (ByteValue + ShortValue + IntValue));
        System.out.println(LongValue);
    }
}
