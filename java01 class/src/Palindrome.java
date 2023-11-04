/* 8. Criar uma classe Java que receba uma palavra (String)
retorne uma mensagem caso apalavra fornecida seja uma palavra
que pode ser lida da esquerda pra direita ou da direita pra
esquerda obtendo-se a mesma palavra. Ex.: Ana, arara, osso, etc.
 */

import java.util.Scanner;

public class Palindrome
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.print("Enter the string: ");
        String sentence = input.nextLine().toLowerCase().trim().replaceAll("\\s", " ");
        String inversedSentence = new StringBuilder(sentence).reverse().toString();

        if(sentence.equals(inversedSentence)){
            System.out.print("It's a palindrome");
        }
        else{
            System.out.print("It's not a palindrome");
        }


        input.close();

    }
}
