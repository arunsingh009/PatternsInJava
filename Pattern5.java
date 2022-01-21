package com.company.PatternsInJava;
import java.util.Scanner;

public class Pattern5 {
    public static void main(String[] args) {
        System.out.println("We Are Printing \n1234\n123\n12\n1\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No for height of the pattern");
        int input = s.nextInt();

        for(int i=input;i>=1;i--){
            for(int j=1;j<=i;j++){
                System.out.print(j);
            }
            System.out.print("\n");
        }

    }
}
