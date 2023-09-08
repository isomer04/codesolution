// Morse Code
// Programming challenge description:
// You have received a text encoded with Morse code and want to decode it.
// Input:
// Your program should read lines from standard input. Each line contains a Morse code message. Each letter in the code is separated by a space char, each word is separated by 2 space chars. The input will contain encoded letters and numbers only.
// Output:
// Print out the decoded words.
// Test 1
// Test Input
// Download Test 1 Input
// .- ...- ..--- .-- .... .. . -.-. -..-  ....- .....
// Expected Output
// Download Test 1 Output
// AV2WHIECX 45
// Test 2
// Test Input
// Download Test 2 Input
// -... .... ...--
// Expected Output
// Download Test 2 Output
// BH3


import java.util.Scanner;
import java.util.HashMap;

public class Main {
    static HashMap<String, Character> morseCodeMap = new HashMap<>();

    static {
        morseCodeMap.put(".-", 'A');
        morseCodeMap.put("-...", 'B');
        morseCodeMap.put("-.-.", 'C');
        morseCodeMap.put("-..", 'D');
        morseCodeMap.put(".", 'E');
        morseCodeMap.put("..-.", 'F');
        morseCodeMap.put("--.", 'G');
        morseCodeMap.put("....", 'H');
        morseCodeMap.put("..", 'I');
        morseCodeMap.put(".---", 'J');
        morseCodeMap.put("-.-", 'K');
        morseCodeMap.put(".-..", 'L');
        morseCodeMap.put("--", 'M');
        morseCodeMap.put("-.", 'N');
        morseCodeMap.put("---", 'O');
        morseCodeMap.put(".--.", 'P');
        morseCodeMap.put("--.-", 'Q');
        morseCodeMap.put(".-.", 'R');
        morseCodeMap.put("...", 'S');
        morseCodeMap.put("-", 'T');
        morseCodeMap.put("..-", 'U');
        morseCodeMap.put("...-", 'V');
        morseCodeMap.put(".--", 'W');
        morseCodeMap.put("-..-", 'X');
        morseCodeMap.put("-.--", 'Y');
        morseCodeMap.put("--..", 'Z');
        morseCodeMap.put(".----", '1');
        morseCodeMap.put("..---", '2');
        morseCodeMap.put("...--", '3');
        morseCodeMap.put("....-", '4');
        morseCodeMap.put(".....", '5');
        morseCodeMap.put("-....", '6');
        morseCodeMap.put("--...", '7');
        morseCodeMap.put("---..", '8');
        morseCodeMap.put("----.", '9');
        morseCodeMap.put("-----", '0');
        morseCodeMap.put("--..--", ',');
        morseCodeMap.put(".-.-.-", '.');
        morseCodeMap.put("..--..", '?');
        morseCodeMap.put("-..-.", '/');
        morseCodeMap.put("-....-", '-');
        morseCodeMap.put("-.--.", '(');
        morseCodeMap.put("-.--.-", ')');
    }

    public static String decode(String morseCode) {
        String[] words = morseCode.split("   ");
        StringBuilder decodedMessage = new StringBuilder();
        for (String word : words) {
            String[] letters = word.split(" ");
            for (String letter : letters) {
                decodedMessage.append(morseCodeMap.getOrDefault(letter, ' '));
            }
            decodedMessage.append(" ");
        }
        return decodedMessage.toString().trim();
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        while (scanner.hasNextLine()) {
            String morseCode = scanner.nextLine();
            System.out.println(decode(morseCode));
        }
    }
}