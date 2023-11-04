/* 9. Escreva uma classe para calcular a área de um círculo,
sabendo que a área é A = PI * r2, onde o raio (r) deve ser
informado pelo usuário e o resultado terá que ser arredondado. */

import java.util.Scanner;

public class CircleArea
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        final double pi = 3.14;

        System.out.print("Enter the circle radius: ");
        float radius = input.nextFloat();


        System.out.printf("The area is = %.2f %n",  (radius * pi));

        input.close();

    }
}
