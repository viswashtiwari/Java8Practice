package com.viswash;

public class MethodRefference2 {
    public static int HiiBhai(){
        System.out.println("hiii bhai ");
        return  2;
    }
    public static void main(String[] args) {
        Runnable r=MethodRefference2::HiiBhai;
        Thread t =new Thread(r);
        t.start();
    }
}
