class RaindropConverter {

    String convert(int number) {
        String answer = "";
        boolean isFactor = false;
        if(number % 3 == 0) {
            answer = answer + "Pling";
            isFactor = true;
        }
        if(number % 5 == 0) {
            answer = answer + "Plang";
            isFactor = true;
        }
        if(number % 7 == 0) {
            answer = answer + "Plong";
            isFactor = true;
        }
        if (isFactor == false) {
            answer = String.valueOf(number);
        }
        return answer;
    }

}
