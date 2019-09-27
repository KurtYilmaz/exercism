#include "../src/armstrong_numbers.h"
#include "vendor/unity.h"

void setUp(void) {}

void tearDown(void) {}

static void test_zero_is_an_armstrong_number(void) {
    TEST_ASSERT_TRUE(isArmstrongNumber(0));
}

static void test_single_digit_numbers_are_armstrong_numbers(void) {
    // TEST_IGNORE();               // delete this line to run test
    TEST_ASSERT_TRUE(isArmstrongNumber(5));
}

static void test_there_are_no_two_digit_armstrong_numbers(void) {
    // TEST_IGNORE();
    TEST_ASSERT_FALSE(isArmstrongNumber(10));
}

static void test_three_digit_number_that_is_an_armstrong_number(void) {
    // TEST_IGNORE();
    TEST_ASSERT_TRUE(isArmstrongNumber(153));
}

static void test_three_digit_number_that_is_not_an_armstrong_number(void) {
    // TEST_IGNORE();
    TEST_ASSERT_FALSE(isArmstrongNumber(100));
}

static void test_four_digit_number_that_is_an_armstrong_number(void) {
    // TEST_IGNORE();
    TEST_ASSERT_TRUE(isArmstrongNumber(9474));
}

static void test_four_digit_number_that_is_not_an_armstrong_number(void) {
    // TEST_IGNORE();
    TEST_ASSERT_FALSE(isArmstrongNumber(9475));
}

static void test_seven_digit_number_that_is_an_armstrong_number(void) {
    // TEST_IGNORE();
    TEST_ASSERT_TRUE(isArmstrongNumber(9926315));
}

static void test_seven_digit_number_that_is_not_an_armstrong_number(void) {
    // TEST_IGNORE();
    TEST_ASSERT_FALSE(isArmstrongNumber(9926314));
}

static void test_number_of_digits_1(void) {
    TEST_ASSERT_EQUAL_INT(getNumberOfDigits(1), 1);
    TEST_ASSERT_EQUAL_INT(getNumberOfDigits(9), 1);
}

static void test_number_of_digits_3(void) {
    TEST_ASSERT_EQUAL_INT(getNumberOfDigits(100), 3);
    TEST_ASSERT_EQUAL_INT(getNumberOfDigits(999), 3);
}

static void test_number_of_digits_5(void) {
    TEST_ASSERT_EQUAL_INT(getNumberOfDigits(10000), 5);
    TEST_ASSERT_EQUAL_INT(getNumberOfDigits(99999), 5);
}

int main(void) {
    UnityBegin("test/test_armstrong_numbers.c");

    RUN_TEST(test_zero_is_an_armstrong_number);
    RUN_TEST(test_single_digit_numbers_are_armstrong_numbers);
    RUN_TEST(test_there_are_no_two_digit_armstrong_numbers);
    RUN_TEST(test_three_digit_number_that_is_an_armstrong_number);
    RUN_TEST(test_three_digit_number_that_is_not_an_armstrong_number);
    RUN_TEST(test_four_digit_number_that_is_an_armstrong_number);
    RUN_TEST(test_four_digit_number_that_is_not_an_armstrong_number);
    RUN_TEST(test_seven_digit_number_that_is_an_armstrong_number);
    RUN_TEST(test_seven_digit_number_that_is_not_an_armstrong_number);
    RUN_TEST(test_number_of_digits_1);
    RUN_TEST(test_number_of_digits_3);
    RUN_TEST(test_number_of_digits_5);

    return UnityEnd();
}
