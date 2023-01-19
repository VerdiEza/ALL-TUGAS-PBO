package com.percobaan2;

public class ExceptionError {
    public static void main(String[] args) {
        int i=0;
        String greeting[]={
            "Hello World!",
            "No, I mean it!",
            "Hello World"
        };
        while(i<4)
        {
            System.out.println(greeting[i]);
            i++;
        }
    }
}
