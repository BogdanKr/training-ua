package com.cources.exceptions;

public class Except2 {
    public static void main(String[] args) {
        f(null);
    }

    private static void f(NullPointerException e){
        try {
            throw e;
        }catch (NullPointerException npe){
            //f(npe);
            System.out.println("nullpointer");
        }
    }
}
