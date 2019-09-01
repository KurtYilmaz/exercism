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

            // two-letter sounds (diagraphs only, no blends)
            // Diagraphs: st, sh, ch, th, wh  
            mutableMap.put("st", 'c');
            mutableMap.put("St", 'c');
            mutableMap.put("sh", 'c');
            mutableMap.put("Sh", 'c');
            mutableMap.put("ch", 'c');
            mutableMap.put("Ch", 'c');
            mutableMap.put("th", 'c');
            mutableMap.put("Th", 'c');
            mutableMap.put("wh", 'c');
            mutableMap.put("Wh", 'c');        

        sounds = Collections.unmodifiableMap(mutableMap);
    }


    public String translate(String input) {
        return "";
    }

    private boolean 
}