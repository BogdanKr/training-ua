package com.cources.exceptions;

public class Except6 {
    public static void main(String[] args) {
        try{
            System.out.println("1");
            throw new RuntimeException();
        }catch (RuntimeException e){
            System.out.println("2");
            throw new Error();
        }catch (Error e){
            System.out.println("3");
        }
        System.out.println("4");
    }
}
