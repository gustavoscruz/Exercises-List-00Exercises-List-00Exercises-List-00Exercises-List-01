/* 1. Qual a saída do seguinte programa: 15 */

/* 2. Faça um programa que receba 2 valores e retorne o maior entre eles. */

import java.util.Scanner;

public class LargestNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first number: ");
        int number1 = input.nextInt();

        System.out.print("Enter the second number: ");
        int number2 = input.nextInt();

        if(number1 > number2){
            System.out.println("The largest number is " + number1);
        }
        else{
            System.out.println("The largest number is " + number2);
        }
    }
}
