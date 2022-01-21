package com.company.PatternsInJava;
import java.util.Scanner;

public class Pattern3 {
    public static void main(String[] args) {
        System.out.println("We Are Printing \nA\nBB\nCCC\nDDDD\n");
        Scanner s = new Scanner(System.in);
        char alp ='A';
        System.out.println("Enter Character : ");
        char a = s. next().charAt(0);//Taking Char as Input in java

        for(int i=1;i<=(a - 'A' +1);++i){
            for(int j=1;j<=i;++j){
                System.out.printf("%c ",alp);
            }
            ++alp;
            System.out.print("\n");
        }



    }
}
