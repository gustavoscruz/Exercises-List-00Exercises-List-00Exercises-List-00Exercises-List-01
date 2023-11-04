/* 5. Faça um programa que solicite ao usuário um número de 1 a 7,
 e imprima na tela o dia da semana correspondente. Suponha que Segunda
 corresponde a 1 , Terça corresponde a 2, e assim por diante. Utilizando Array. */

import java.util.Scanner;

public class DayOfWeek
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        String[] daysOfWeek = {"Sunday", "Monday", "Tuesday", "Wednesday", "Thursday", "Friday", "Saturday"};

        System.out.print("Enter a number from 1 to 7: ");
        int day = input.nextInt();

        if(day >= 1 && day <= 7){
            System.out.println(daysOfWeek[day - 1]);
        }
        else{
            System.out.println("Day not found");
        }

    }
}
