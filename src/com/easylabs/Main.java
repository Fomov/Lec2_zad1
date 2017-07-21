package com.easylabs;

import java.util.Scanner;


public class Main {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        double a, b, c;
        System.out.println(" Введите числитель ");
        a = in.nextDouble();
        System.out.println(" Введите делитель ,не равный нулю ");
        b = in.nextDouble();
        if (b > 0 | b < 0) {
            c = a / b;
            System.out.println("Ответ равен" + c);
        } else
            System.out.println("просил же , не равный нулю");


    }
}
