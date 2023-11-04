/* 10. Escreva uma classe que conte a quantidade de vogais,
espaços em brancos e consoantes de uma cadeia de caracteres. */

import java.util.Scanner;

public class CharactersCounter
{
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        int spaces = 0, vowels = 0, consonants = 0;
        char letter;

        System.out.print("Enter the string: ");
        String sentence = input.nextLine().toLowerCase();

        for (int i = 0; i < sentence.length(); i++){

            letter = sentence.charAt(i);

            if(letter == ' '){
                spaces++;
            }
            else if(letter == 'a' || letter == 'e' || letter == 'i' || letter == 'o' || letter == 'u'){
                vowels++;
            }
            else{
                consonants++;
            }
        }

        System.out.println("Spaces: " + spaces);
        System.out.println("Vowels: " + vowels);
        System.out.println("consonants: " + consonants);

        input.close();

    }
}
