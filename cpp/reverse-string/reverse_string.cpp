#include "reverse_string.h"

using namespace std;

namespace reverse_string {

string reverse_string(string input) {
    int size = input.size();
    string output;
    for(int i = 0; i < size; i++) {
        output.push_back(input[size - 1 - i]);
    }
    return output;
}

}  // namespace reverse_string
