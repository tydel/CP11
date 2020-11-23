import java.util.Scanner;  // import the Scanner class to get user input

public class StringEncryption {

    public static void main(String[] args)
    {
        // loop until the user exits
        do {
            // setup a new Scanner object to use to get user input
            Scanner userInput = new Scanner(System.in);
            // print out the message requesting the user's input
            System.out.println("Enter text to be encoded or decoded:");
            // save the input from the user to a string variable
            String input = userInput.nextLine();
            // print out the originally inputted text, as well as the ROT-13'd version
            System.out.printf("%s -> %s\n\n", input, encode(input));
        } while (true);
    }

    public static String encode(String args)
    {
        // Create an empty string which we'll concatenate each ROT-13'd character onto and return at the end
        String n = "";

        // Iterate through the string provided to us character by character
        for (int i = 0; i < args.length(); i++) {
            // Save the character we're working on to a char
            char c = args.charAt(i);
            // if the character is from a-m, rotate it forward 13 characters
            if (c >= 'a' && c <= 'm') c += 13;
            // if the character is from A-M, rotate it forward 13 characters
            else if (c >= 'A' && c <= 'M') c += 13;
            // if the character is from n-z, rotate it backwards 13 characters
            else if (c >= 'n' && c <= 'z') c -= 13;
            // if the character is from N-Z, rotate it backwards 13 characters
            else if (c >= 'N' && c <= 'Z') c -= 13;
            // Append the ROT-13'd character to the string we'll be returning at the end of the method
            n = n.concat(String.valueOf(c));
        }

        // After processing through all the data, return the ROT-13'd string
        return n;
    }

}
