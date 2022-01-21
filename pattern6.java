package com.company.PatternsInJava;
import java.util.Scanner;

public class pattern6 {
    public static void main(String[] args) {
        System.out.println("Printing Full Pyramid of *");
        Scanner s =new Scanner(System.in);
        System.out.println("Enter Number for Rows : ");
        int n = s.nextInt();
        int k=0;

        for(int i =1;i<=n;++i,k=0){
            for(int j=1;j<=n-i;++j){
                    System.out.print("  ");
            }
            while (k != 2 * i - 1) {
                System.out.print("* ");
                ++k;
            }
            System.out.print("\n");
        }



    }
}
