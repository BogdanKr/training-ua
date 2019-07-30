package com.courses.exceptions;

public class Except5 {
    public static void main(String[] args) {
        System.err.println("#1");
        try {
        f();} catch (Error e){
            System.err.println("catch error");
        }
        System.err.println("#1 out");
    }
    private static void f(){
        System.err.println("#2 in");
        g();
        System.err.println("#2 out");
    }
    private static void g(){
        System.err.println("#3 in");
        h();
        System.err.println("#3 out");
    }
    private static void h(){
        System.err.println("#4 in");
        if (true){
            System.err.println("#4 throw");
        //return;
            throw new Error();
        }
        System.err.println("#4 out");
    }
}
