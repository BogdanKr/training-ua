package com.courses.exceptions;

public class Except7 {
    public static void main(String[] args) throws Exception {
       // throw new Exception();
        try {
            System.out.println("1");
            if (true) throw new RuntimeException();
        } finally {
            //System.out.println("2");
            if (true)throw new Error();
        }
        System.out.println("3");
    }
}
