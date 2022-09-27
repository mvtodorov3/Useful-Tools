import java.util.Random;
import java.util.Scanner;

public class PasswordGenerator {
    static void rndPass() {
        Scanner scanner = new Scanner(System.in);
        //input:
        //1. total generated passwords
        //2. what length will the generated passwords have
        //3. will there be a special symbol in the generated passwords
        //for loops:
        //1. before the for loop there is an if condition to check if the user wants the passwords to contain a special symbol
        //2. outer for loop: loop through the number of passwords required to be generated
        //3. inner for loop: loop through the length of the current password that was required by the user
        //3.1 the first index will be a random upper case letter
        //3.2 every 4th iteration will contain a special symbol
        //3.3 every other iteration will generate a random letter or number
        //3.4 the generated chars will be stored in a variable
        //4. the generated password will be stored in the array
        //5. if the user doesn't want the passwords to contain special symbols the steps from 3.1 - 4 are the same
        //6. looping through the array to print out the passwords

        System.out.print("How many passwords do you want to be generated: ");
        int totalPass = Integer.parseInt(scanner.nextLine());

        System.out.print("Please enter the length of the password you want to generate: ");
        int passLength = Integer.parseInt(scanner.nextLine());

        System.out.print("Do you want the password to contain special symbols? ");
        String symbols = scanner.nextLine();

        String[] allPasswords = new String[totalPass]; // an array of strings to store the passwords( [depending on the user input how many passwords will be stored in the array])
        String setOfCharacters = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ1234567890";
        String symbolsArr = "-/@!$#%&*()_+";
        Random random = new Random();
        char randomChar = '\0';

        if (symbols.equals("Yes")) {
            for (int i = 0; i < totalPass; i++) {// looping trough total number of passwords
                String randomPassword = "";
                for (int j = 1; j <= passLength; j++) { // looping through password length;
                    if (j == 1) {
                        randomChar = (char) (random.nextInt(26) + 'A'); // first char to start with an upper case letter; 0-26; starting at letter A to Z\
                    } else if (j % 4 == 0){ // every 4 char will be a specialSymbol
                        int randomInt = random.nextInt(symbolsArr.length());//storing a random index of the symbol var in the variable
                        randomChar = symbolsArr.charAt(randomInt); // returns a char value from a random index from the symbol array
                    }else {
                        int randomInt = random.nextInt(setOfCharacters.length()); //generating a random integer based on the length of the String
                        randomChar = setOfCharacters.charAt(randomInt); // randomInt is used as an index to be abel to get a random character at random index
                    }
                    randomPassword += randomChar; //the result will be stored in this variable
                }
                allPasswords[i] = randomPassword;
            }
        } else if (symbols.equals("No")) { // if the user doesn't desire the password to contain special character
            for (int i = 0; i < totalPass; i++) {
                String randomPassword = "";
                for (int j = 1; j <= passLength; j++) {
                    if (j == 1) {
                        randomChar = (char) (random.nextInt(26) + 'A');
                    } else if (j % 4 == 0) {
                        int randomInt = random.nextInt(symbolsArr.length());//storing a random index of the symbol  in the variable
                        randomChar = symbolsArr.charAt(randomInt); // returns a char value from a random index from the symbol var
                    } else {
                        int randomInt = random.nextInt(setOfCharacters.length());
                        randomChar = setOfCharacters.charAt(randomInt);
                    }
                    randomPassword += randomChar;
                }
                allPasswords[i] = randomPassword; //adding random password to the array
            }
        }
        for (String allPassword : allPasswords) { // printing all the generated passwords
            System.out.println(allPassword);
        }
    }
}


