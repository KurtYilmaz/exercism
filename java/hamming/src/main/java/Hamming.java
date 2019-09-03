class Hamming {

    private String leftStrand;
    private int leftLength;
    private String rightStrand;
    private int rightLength;

    Hamming(String leftStrand, String rightStrand) {
        
        // Initializing variables for class
        this.leftStrand = leftStrand;
        this.rightStrand = rightStrand;
        leftLength = leftStrand.length();
        rightLength = rightStrand.length();

        // Exceptions for non-matching or empty strands
        if (leftLength == 0 && rightLength > 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        }
        else if(rightLength == 0 && leftLength > 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        }
        else if(leftLength != rightLength) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }
    }

    int getHammingDistance() {
        int distance = 0;
        // Assumes both strands are the same length from exceptions thrown in constructor
        for(int i = 0; i < leftLength; i++) {
            if(leftStrand.charAt(i) != rightStrand.charAt(i)) {
                distance++;
            }    
        }

        return distance;
    }

}
