package com.percobaan3;

public class ExceptionFix {
    public static void main(String[] args) {
        int bil=10;
        try {
            System.out.println(bil/0);
        } catch (Exception e) {
            System.out.println("Ini menghandle error yang terjadi");
        }
    }
}
