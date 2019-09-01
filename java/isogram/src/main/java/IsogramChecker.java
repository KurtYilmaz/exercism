import java.util.HashSet;
//import java.lang.reflect.Array;

class IsogramChecker {

    boolean isIsogram(String phrase) {
        
        // HashSet for phrase letters
        HashSet<Character> hasLetters = new HashSet<Character>();

        // Length of phrase
        int length = phrase.length();

        for(int i = 0; i < length; i++) {

            char currentLetter = phrase.charAt(i);
            
            // Checks if currentLetter is valid
            boolean validLetter = false;

            // Flattens character to lowercase
            if(currentLetter >= 'a' && currentLetter <= 'z') {
                validLetter = true;
            }
            else if(currentLetter >= 'A' && currentLetter <= 'Z') {
                // Kept like this for readability
                currentLetter += 'a' - 'A';
                validLetter = true;
            }
            
            // If letter is not valid, skip check
            if(validLetter) {
                if(hasLetters.contains(currentLetter) == true) {
                    return false;
                }
                else {
                    hasLetters.add(currentLetter);
                }
            }
        }
        return true;
    }

}
