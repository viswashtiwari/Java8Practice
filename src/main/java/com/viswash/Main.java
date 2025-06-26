package com.viswash;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

import java.util.function.Predicate;


public class Main {

    public static void main(String[] args) {

     Student s =new Student(15,"viswash");
        Student s2 =new Student(7,"vis");
        Student s3 =new Student(19,"wash");
        Student[] stu=new Student[3];
        stu[0]=s;
        stu[1]=s2;
        stu[2]=s3;
        for (int i = 0; i < stu.length; i++) {
            System.out.println( perOper(stu[i].sid) +" "+stu[i].sname);
        }

    }

    private static boolean perOper(Integer id) {
        Predicate<Integer>p =sid->sid>10;
        return p.test(id);
    }

}