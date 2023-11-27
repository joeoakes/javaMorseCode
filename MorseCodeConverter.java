import java.util.HashMap;

public class MorseCodeConverter {

    public static void main(String[] args) {
        String sentence = "The quick brown fox jumps over 13 lazy dogs";
        String morseCode = convertToMorseCode(sentence);
        System.out.println(morseCode);
    }

    public static String convertToMorseCode(String text) {
        HashMap<Character, String> morseCodeMap = new HashMap<>();
        morseCodeMap.put('A', ".-"); morseCodeMap.put('B', "-..."); morseCodeMap.put('C', "-.-.");
        morseCodeMap.put('D', "-.."); morseCodeMap.put('E', "."); morseCodeMap.put('F', "..-.");
        morseCodeMap.put('G', "--."); morseCodeMap.put('H', "...."); morseCodeMap.put('I', "..");
        morseCodeMap.put('J', ".---"); morseCodeMap.put('K', "-.-"); morseCodeMap.put('L', ".-..");
        morseCodeMap.put('M', "--"); morseCodeMap.put('N', "-."); morseCodeMap.put('O', "---");
        morseCodeMap.put('P', ".--."); morseCodeMap.put('Q', "--.-"); morseCodeMap.put('R', ".-.");
        morseCodeMap.put('S', "..."); morseCodeMap.put('T', "-"); morseCodeMap.put('U', "..-");
        morseCodeMap.put('V', "...-"); morseCodeMap.put('W', ".--"); morseCodeMap.put('X', "-..-");
        morseCodeMap.put('Y', "-.--"); morseCodeMap.put('Z', "--.."); morseCodeMap.put('1', ".----");
        morseCodeMap.put('2', "..---"); morseCodeMap.put('3', "...--"); morseCodeMap.put('4', "....-");
        morseCodeMap.put('5', "....."); morseCodeMap.put('6', "-...."); morseCodeMap.put('7', "--...");
        morseCodeMap.put('8', "---.."); morseCodeMap.put('9', "----."); morseCodeMap.put('0', "-----");

        StringBuilder morseCodeBuilder = new StringBuilder();
        text = text.toUpperCase();

        for (char c : text.toCharArray()) {
            if (c == ' ') {
                morseCodeBuilder.append(" ");
            } else if (morseCodeMap.containsKey(c)) {
                morseCodeBuilder.append(morseCodeMap.get(c)).append(" ");
            }
        }

        return morseCodeBuilder.toString().trim();
    }
}
