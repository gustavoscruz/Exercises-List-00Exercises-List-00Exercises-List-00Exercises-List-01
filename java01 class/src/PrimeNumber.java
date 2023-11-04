/* 3. Crie uma classe e na função main() implemente um programa
que lê um número inteiro do teclado e imprime todos os números
rimos menores que ele (divisíveis por 1 ou por ele mesmo). */

import java.util.Scanner;

public class PrimeNumber
{
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        int dividers = 0;

        System.out.print("Enter the natural number: ");
        int number = input.nextInt();

        if(number < 1){
            System.out.print("Enter the natural number: ");
            number = input.nextInt();
        }

        for(int numbers = 1; numbers < number; numbers++){
            for(int i = 1; i <= numbers; i++){
                if(numbers % i == 0){
                    dividers++;
                }
            }
            if(dividers <= 2){
                System.out.println(numbers);
            }
            dividers = 0;
        }

    }
}
