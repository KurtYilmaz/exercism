#!/bin/bash

main () {
  name=$1
  keep="one"
  echo "One for ${name:="you"}, ${keep} for me."
}

# call main with all of the positional arguments
main "$@"
