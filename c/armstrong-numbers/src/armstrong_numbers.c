#include "armstrong_numbers.h"

int isArmstrongNumber(int num) {
    int numDigits = getNumberOfDigits(num);
    int result = 0;
    int numCopy = num;

    while (numCopy > 0) {
        result += pow(numCopy % 10, numDigits);
        numCopy = numCopy / 10;
    }

    if (result == num) {
        return 1;
    } else {
        return 0;
    }
}

int getNumberOfDigits(int num) { return log10(num) + 1; }
