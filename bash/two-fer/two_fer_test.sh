#!/bin/bash

@test "no name given" {


  run bash two_fer.sh
  [[ $status -eq 0 ]]
  [[ $output == "One for you, one for me." ]]
}

@test "a name given" {
  #[[ $BATS_RUN_SKIPPED == true  ]] || skip
  run bash two_fer.sh Alice
  [[ $status -eq 0 ]]
  [[ $output == "One for Alice, one for me." ]]
}

@test "another name given" {
  #[[ $BATS_RUN_SKIPPED == true  ]] || skip
  run bash two_fer.sh Bob
  [[ $status -eq 0 ]]
  [[ $output == "One for Bob, one for me." ]]
}

@test "handle arg1 properly" {
  #[[ $BATS_RUN_SKIPPED == true  ]] || skip
  run bash two_fer.sh "John Smith" "Mary Ann"
  [[ $status -eq 0 ]]
  [[ $output == "One for John Smith, one for me." ]]
}

