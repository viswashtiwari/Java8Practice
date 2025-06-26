package com.viswash;

interface  interf{
    void greet();
}
public class MethodRefference {
    public  static void hii(){
        for (int i = 0; i < 5; i++) {
            System.out.println(i);
        }
    }


    public static void main(String[] args) {

        interf in=MethodRefference::hii;
        hii();
    }
}
