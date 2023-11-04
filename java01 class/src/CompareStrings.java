/* 11. Escreva um programa que tenha duas palavras como entrada,
e a saída imprima as palavras em ordem alfabética
(utilize o método compareTo da classe String).
Informe também, qual das palavras tem o maior número de caracteres. */

import java.util.Scanner;

public class CompareStrings
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the first string: ");
        String sentence1 = input.nextLine();

        System.out.print("Enter the second string: ");
        String sentence2 = input.nextLine();

        if(sentence1.compareTo(sentence2) <= -1){
            System.out.println(sentence1);
            System.out.println(sentence2);
        }
        else{
            System.out.println(sentence2);
            System.out.println(sentence1);
        }

        if(sentence1.length() > sentence2.length()){
            System.out.println(sentence1 + " is longer than " + sentence2);
        }
        else if(sentence1.length() == sentence2.length()){
            System.out.println(sentence2 + " has the same size than " + sentence1);
        }
        else{
            System.out.println(sentence2 + " is longer than " + sentence1);
        }

        input.close();

    }
}
