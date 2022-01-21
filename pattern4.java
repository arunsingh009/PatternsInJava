package com.company.PatternsInJava;
import java.util.Scanner;

public class pattern4 {
    public static void main(String[] args) {
        System.out.println("We Are Printing \nxxxx\nxxx\nxx\nx\n");
        Scanner s = new Scanner(System.in);
        System.out.println("Enter No for height of the pattern");
        int input = s.nextInt();

        for (int i =1;i<=input;i++){
            for(int j=input; j>=i;j--){
                System.out.print("X");
            }
            System.out.print("\n");
        }
    }

}
