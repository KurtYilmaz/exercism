# Game status categories
# Change the values as you see fit
STATUS_WIN = "win"
STATUS_LOSE = "lose"
STATUS_ONGOING = "ongoing"


class Hangman(object):

    def __init__(self, word):
        self.remaining_guesses = 9
        self.status = STATUS_ONGOING
        self.word = word
        self.maskedWord = ["_"] * len(word)

    def guess(self, char):

        if self.status != STATUS_ONGOING:
            raise ValueError("The game is over")

        guessCorrect = False

        for i in range(len(self.word)):
            if char == self.word[i]:
                if self.maskedWord[i] != char:
                    self.maskedWord[i] = char
                    guessCorrect = True

        if "_" not in self.maskedWord:
            self.status = STATUS_WIN
            self.remaining_guesses = 0

        if guessCorrect == False:
            self.remaining_guesses -= 1
            if self.remaining_guesses < 0:
                self.status = STATUS_LOSE

    def get_masked_word(self):
        return "".join(self.maskedWord)

    def get_status(self):
        return self.status
