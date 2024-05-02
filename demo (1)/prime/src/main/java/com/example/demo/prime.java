package com.example.demo;

import java.util.Scanner;

public class prime {
    public static void main(String[] args) {
    int a, b, i, j, flag;
    Scanner sc = new Scanner(System.in);
    System.out.println("From the number you want to calculate:");
    a = sc.nextInt();
    System.out.println("To the number you want to calculate:");
    b=sc.nextInt();

    for(i=a; i<=b; i++){
        if (i==0 || i==1){
            continue;
        }
        flag=1;

       // for(j=2;j<i; ++j){
        for(j=2;j<=i/2; ++j){
            if(i%j==0){
                flag=0;
                break;
            }
        }
        if(flag==1){
            System.out.println(i);
        }
    }
}
}

