package myproject;

import java.util.Scanner;

public class greatestnum {
  public static void main(String args[]) {
    Scanner sc = new Scanner(System.in);
            int num1 = 25;
            int num2 = 42;
            int num3 = 17;
            int greatest;
            if (num1 >= num2 && num1 >= num3) {
                greatest = num1;
            }
            else if (num2 >= num1 && num2 >= num3) {
                greatest = num2;
            } 
            else {
                greatest = num3;
            }

            System.out.println("greatest number: " + greatest);
        }
    }
