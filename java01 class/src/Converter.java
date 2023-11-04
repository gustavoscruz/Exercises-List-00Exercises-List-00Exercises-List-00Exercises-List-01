/* 4. Pretende-se escrever um programa que leia do teclado uma distância
expressa em milhas, converte-a para quilômetros e apresenta o resultado
no console. (fórmula de conversão: 1 milha = 1.609 km). */

import java.util.Scanner;

public class Converter
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.print("Enter the miles: ");
        float miles = input.nextFloat();

        System.out.print(miles + " miles are " + miles * 1.609 + " Km");

    }
}
