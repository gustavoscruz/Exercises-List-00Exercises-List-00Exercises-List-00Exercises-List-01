/* 7. Imprima o resultado da divisão por 2 de todos os múltiplos de 3
entre 1 e 100, usando os tipos de dados int e double. */

public class MultiplesOfThree
{
    public static void main(String[] args) {
        System.out.println("With double");
        for(double number = 3; number < 100; number += 3){
            System.out.println(number + " / 2 = " + number / 2);
        }

        System.out.println("\nWith integer");
        for(int number = 3; number < 100; number += 3){
            System.out.println(number + " / 2 = " + number / 2);
        }
    }
}
