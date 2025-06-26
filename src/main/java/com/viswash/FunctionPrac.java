package com.viswash;

import java.util.function.Function;

public class FunctionPrac {
    public static void main(String[] args) {


    Function<String,Integer> f =name->name.length();
        System.out.println(f.apply("viswash"));
    }
}
