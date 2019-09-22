#include "armstrong_numbers.h"

int isArmstrongNumber(int num) {
    unsigned int numDigits = 0;
    int numCopy = num;
    int result = 0;

    while (numCopy > 0) {
        numCopy = numCopy / 10;
        numDigits++;
    }

    numCopy = num;

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
