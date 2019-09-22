using System;

public static class Pangram
{
    public static bool IsPangram(string input)
    {
        bool[] hasLetters = new bool[26];
        bool isPangram = true;

        foreach (char character in input)
        {
            if (character >= 'A' && character <= 'Z')
            {
                hasLetters[character - 'A'] = true;
            }
            else if (character >= 'a' && character <= 'z')
            {
                hasLetters[character - 'a'] = true;
            }
        }

        foreach (bool letter in hasLetters)
        {
            if (!letter)
            {
                isPangram = false;
                break;
            }
        }

        return isPangram;
    }
}
