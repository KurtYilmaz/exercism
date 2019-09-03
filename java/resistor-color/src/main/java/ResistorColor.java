// Doing it this way because the assignment steers the solution in this direction.
/* A better practice would be to use a Map of <String, Integer> instead of the function that outputs colors.
    The map would be a class variable and be initialized in the constructor. This would give our algorithm
    O(1) lookup instead of O(N). Would still take O(N) to populate the map though, so this solution is 
    the same time complexity if colorCode() is only ever called once. */

class ResistorColor {

    int colorCode(String color) {
        String resistorColors[] = colors();
        int colorCount = resistorColors.length;
        int outputNumber = -1;
        for(int i = 0; i < colorCount; i++) {
            if(color.equals(resistorColors[i])) {
                outputNumber = i;
                break;
            }
        }
        return outputNumber;

    }

    String[] colors() {
        return new String[] {"black", "brown", "red", "orange", "yellow", "green", "blue", "violet", "grey", "white"};
    }
}
