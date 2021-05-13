"""
Checks if strings are anagram of each other
Anagram is a word which has the same letters as another word
"""


def update_total_letters(letter, dict_letters, amount_to_update):
    if letter not in dict_letters:
        dict_letters[letter] = amount_to_update
    else:
        if dict_letters[letter] + amount_to_update == 0:
            del dict_letters[letter]
        else:
            dict_letters[letter] = dict_letters[letter] + amount_to_update

    return dict_letters


def check_anagram(s1, s2):
    if len(s1) != len(s2):
        return False

    dict_letters = {}

    for index in range(0, len(s1)):
        letter_1 = s1[index]
        letter_2 = s2[index]

        dict_letters = update_total_letters(letter_1, dict_letters, 1)
        dict_letters = update_total_letters(letter_2, dict_letters, -1)

    return len(dict_letters) == 0


if __name__ == '__main__':
    print('AABC | CABA = {}'.format(check_anagram('AABC', 'CABA')))
    print('ROMA | AMOR = {}'.format(check_anagram('ROMA', 'AMOR')))
    print('ABCDEF | FEDCBZ = {}'.format(check_anagram('ABCDEF', 'FEDCBZ')))
    print('AAAA | BBBB = {}'.format(check_anagram('AAAA', 'BBBB')))
    print('AABA | ABBB = {}'.format(check_anagram('AABA', 'ABBB')))
