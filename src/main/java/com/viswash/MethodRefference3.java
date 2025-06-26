package com.viswash;

interface action{
    void goodAction();
}
class MyAction{
    void myActions(){
        System.out.println("hiii myActions are very Good");
    }
}
public class MethodRefference3 {
    public static void main(String[] args) {


        MyAction ma = new MyAction();
        action a = ma::myActions;
        a.goodAction();

    }
}