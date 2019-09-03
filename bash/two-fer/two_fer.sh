#!/bin/bash

  main () {
    # If # arguments is less than 1, name="you"
    if [ $# -lt 1 ]
    then
        name="you"
    else
        name=$1
    fi
    
    echo "One for ${name}, one for me."
  }

  # call main with all of the positional arguments
  main "$@"
