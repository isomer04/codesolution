import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.nio.charset.StandardCharsets;
import java.util.HashMap;

/**
 * The Main class implements an application that reads lines from the standard input
 * and decodes them from Morse code to plain text.
 */
public class Main {
  /**
   * HashMap to store Morse code mappings.
   */
  private static final HashMap<String, String> morseCode = new HashMap<String, String>() {{
    put(".-", "A");
    put("-...", "B");
    put("-.-.", "C");
    put("-..", "D");
    put(".", "E");
    put("..-.", "F");
    put("--.", "G");
    put("....", "H");
    put("..", "I");
    put(".---", "J");
    put("-.-", "K");
    put(".-..", "L");
    put("--", "M");
    put("-.", "N");
    put("---", "O");
    put(".--.", "P");
    put("--.-", "Q");
    put(".-.", "R");
    put("...", "S");
    put("-", "T");
    put("..-", "U");
    put("...-", "V");
    put(".--", "W");
    put("-..-", "X");
    put("-.--", "Y");
    put("--..", "Z");
    put(".----", "1");
    put("..---", "2");
    put("...--", "3");
    put("....-", "4");
    put(".....", "5");
    put("-....", "6");
    put("--...", "7");
    put("---..", "8");
    put("----.", "9");
    put("-----", "0");
    put("--..--", ",");
    put(".-.-.-", ".");
    put("..--..", "?");
    put("-..-.", "/");
    put("-....-", "-");
    put("-.--.", "(");
    put("-.--.-", ")");
  }};

  /**
   * Decode a given Morse code message to plain text.
   *
   * @param morseCodeMessage the Morse code message to be decoded
   * @return the decoded plain text message
   */
  public static String decodeMorse(String morseCodeMessage) {
    String[] words = morseCodeMessage.split("   ");
    String decodedMessage = "";

    for (String word : words) {
      String[] letters = word.split(" ");
      for (String letter : letters) {
        decodedMessage += morseCode.get(letter);
      }
      decodedMessage += " ";
    }

    return decodedMessage.trim();
  }

  /**
   * Iterate through each line of input, decode the Morse code message and print the decoded
   message to the standard output.
*/
  public static void main(String[] args) throws IOException {
    InputStreamReader reader = new InputStreamReader(System.in, StandardCharsets.UTF_8);
    BufferedReader in = new BufferedReader(reader);
    String line;
    while ((line = in.readLine()) != null) {
      System.out.println(decodeMorse(line));
    }
  }
}
