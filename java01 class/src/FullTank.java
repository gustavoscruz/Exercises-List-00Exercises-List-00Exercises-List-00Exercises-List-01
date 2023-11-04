/* 12. Os motoristas se preocupam com a quilometragem obtida por seus automóveis.
Um motorista monitorou vários tanques cheios de gasolina registrando a quilometragem
dirigida e a quantidade de combustível em litros utilizados para cada tanque cheio.
Desenvolva um aplicativo Java que receba como entrada os quilômetros dirigidos e os
litros de gasolina consumidos (ambos com inteiros) para cada tanque cheio.
O programa deve calcular e exibir o consumo em quilômetros/litro para cada tanque
cheio e imprimir a quilometragem combinada e a soma total de litros de combustível
consumidos até esse ponto. Todos os cálculos de média devem produzir resultados de
ponto flutuante. */

import java.util.Scanner;

public class FullTank
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        int KilometersDriven, gasolineConsumed, response = 1, totalKilometersDriven = 0, totalGasolineConsumed = 0;

        while(response != 0){

            System.out.print("Enter kilometers driven: ");
            KilometersDriven = input.nextInt();

            System.out.print("Enter gasoline consumed: ");
            gasolineConsumed = input.nextInt();

            System.out.println("The consume is: " + (float)KilometersDriven / gasolineConsumed + " Km/L");

            System.out.print("Enter 0 for leave the program: ");

            totalKilometersDriven += KilometersDriven;
            totalGasolineConsumed += gasolineConsumed;

            response = input.nextInt();
        }

        System.out.println("Total kilometers driven is: " + (float)totalKilometersDriven + " Km");
        System.out.println("Total gasoline consumed is: " + (float)totalGasolineConsumed + " L");

        input.close();
    }
}
