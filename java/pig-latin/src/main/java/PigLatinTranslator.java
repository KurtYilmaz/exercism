import java.util.Collections;
import java.util.Map;
import java.util.HashMap;

// Not entirely understanding all edge cases of Pig Latin, so am writing
// this program specifically to pass the edge cases given in the tests.
// Assuming: xr + yt are the only vowel sounding consonant leads.
// Asumming: no blends. Blends include bl, sl, cl, pl, bl, gr, tr, br, etcetera

public class PigLatinTranslator {

    private static final Map<String, Character> sounds;
    static {
        Map<String, Character> mutableMap = new HashMap<String, Character>();

        // Vowel sounds
            mutableMap.put("a", 'v');
            mutableMap.put("A", 'v');
            mutableMap.put("e", 'v');
            mutableMap.put("E", 'v');
            mutableMap.put("i", 'v');
            mutableMap.put("I", 'v');
            mutableMap.put("o", 'v');
            mutableMap.put("O", 'v');
            mutableMap.put("u", 'v');
            mutableMap.put("U", 'v');
            mutableMap.put("xr", 'v');
            mutableMap.put("Xr", 'v');
            mutableMap.put("yt", 'v');
            mutableMap.put("Yt", 'v');

        // Consonant sounds
            // every single letter that is not a vowel is placed as consonant
            for (char i = 'b'; i <= 'z'; i++) {
                String iteratorString = String.valueOf(i);
                if(!mutableMap.containsKey(iteratorString)) {
                    mutableMap.put(iteratorString, 'c');
                }
            }
            for (char i = 'B'; i <= 'Z'; i++) {
                String iteratorString = String.valueOf(i);
                if(!mutableMap.containsKey(iteratorString)) {
                    mutableMap.put(iteratorString, 'c');
                }
            }       

        sounds = Collections.unmodifiableMap(mutableMap);
    }


    // Step 1: parse input string, separate into words by spaces
    // Step 1a: for each word, repeat steps 2x-3.
    // Step 2: check first letter.
    // Step 2a: if vowel, skip to step 3
    // Step 2b: if consonant, check index of "qu" or "y".
    // Step 2c: if no qu/y, check index of first vowel.
    // Step 2d: separate into two strings by the index found
    // Step 2e: add first part to end of second string
    // Step 3: add -ay to the end
    public String translate(String input) {
        return "";
    }
}