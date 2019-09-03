#include "leap.h"

namespace leap {

bool is_leap_year(int year) {
    bool answer = false;
    if (year % 4 == 0) {
        if (year % 100 != 0 || year % 400 == 0) {
            answer = true;
        }
    }
    return answer;
}

}  // namespace leap
