package com.company.PatternsInJava;
import java.util.Scanner;

public class Pattern1 {
    public static void main(String[] args) {
        System.out.println("We Are Printing \n*\n**\n***\n****\n");
        Scanner s = new Scanner(System.in);

        System.out.println("Enter a number for Height of tree : ");
        int  n = s.nextInt();

        for(int i=1; i<=n;i++){
            for(int j=i;j!=0;j--) {
                System.out.print("*");
            }
            System.out.print("\n");
        }
    }
}
