/* 6. Imprima produto dos números de ímpares de 15 a 30,
usando os tipos de dados int e float. */

public class OddProduct
{
    public static void main(String[] args) {

        System.out.println("With Integer");
        for (int number = 15; number <= 30; number++){
            System.out.println(number + " X " + number + " = " + number * number);
        }

        System.out.println("\nWith Float");
        for (float number = 15; number <= 30; number++){
            System.out.println(number + " X " + number + " = " + number * number);
        }
    }
}
