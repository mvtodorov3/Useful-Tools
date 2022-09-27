import java.util.Arrays;
import java.util.Locale;
import java.util.Scanner;

public class EnglishToMorseCode {
    //creating a char array for all the letters, numbers, and the most used symbols in a sentence
    //creating a String array that represents the morse alphabet for every corresponding char in the char array
    public char[] english = { 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l',
            'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x',
            'y', 'z', '1', '2', '3', '4', '5', '6', '7', '8', '9', '0',
            ',', '.', '?', ' ' };

    public String[] morse = { ".-", "-...", "-.-.", "-..", ".", "..-.", "--.", "....", "..",
            ".---", "-.-", ".-..", "--", "-.", "---", ".---.", "--.-", ".-.",
            "...", "-", "..-", "...-", ".--", "-..-", "-.--", "--..", ".----",
            "..---", "...--", "....-", ".....", "-....", "--...", "---..", "----.",
            "-----", "--..--", ".-.-.-", "..--..", " " };

    public void logic(){
        Scanner scanner = new Scanner(System.in);
        String userInput = scanner.nextLine().toLowerCase();
        char[]chars = userInput.toCharArray(); // storing every char from the user input in a char array

        String str = "";
        for (int i = 0; i < chars.length; i++){ //looping through evert char from the user input
            for (int j = 0; j < english.length; j++){ //looping through the english array to match the letters with the letter from the user input

                if (english[j] == chars[i]){//if an english letter is equal to a letter from the char[]
                    str = str + morse[j] + " ";//togava ot morse[] shte bude dobaveno stoinostta na suotvetniq index then in the morse[] will be added the corresponding index
                }
            }
        }
        System.out.println(str);
    }
}
