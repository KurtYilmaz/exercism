class ReverseString {

    String reverse(String inputString) {
        int size = inputString.length();
        String answer = "";
        for (int i = 0; i < size; i++) {
            answer = answer + inputString.charAt(size - 1 - i);
        }
        return answer;
    }
  
}