class Hamming {

    private int hammingDistance;

    Hamming(String leftStrand, String rightStrand) {

        // Initializing variables for class
        int leftLength = leftStrand.length();
        int rightLength = rightStrand.length();

        // Exceptions for non-matching or empty strands
        if (leftLength == 0 && rightLength > 0) {
            throw new IllegalArgumentException("left strand must not be empty.");
        } else if (rightLength == 0 && leftLength > 0) {
            throw new IllegalArgumentException("right strand must not be empty.");
        } else if (leftLength != rightLength) {
            throw new IllegalArgumentException("leftStrand and rightStrand must be of equal length.");
        }

        this.hammingDistance = 0;
        // Assumes both strands are the same length from exceptions thrown in
        // constructor
        for (int i = 0; i < leftLength; i++) {
            if (leftStrand.charAt(i) != rightStrand.charAt(i)) {
                this.hammingDistance++;
            }
        }
    }

    int getHammingDistance() {
        return this.hammingDistance;
    }

}
