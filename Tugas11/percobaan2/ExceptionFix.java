package com.percobaan2;

public class ExceptionFix {
    public static void main(String[] args) {
        int i=0;
        String greetings[]={
            "Hello World!",
            "No, I mean it!",
            "HELLO WORLD!"
        };
        while(i<4)
        {
            try {
                System.out.println(greetings[i]);
            } catch (ArrayIndexOutOfBoundsException e) {
                System.out.println("Resetting index value");
                i=0;
            }
        }
    }
}
