"""
Checks if strings are anagram of each other
Anagram is a word which has the same letters as another word
"""


def check_anagram(s1, s2):
    if len(s1) != len(s2):
        return False

    dict_letters = {}

    for index in range(0, len(s1)):
        letter_1 = s1[index]
        letter_2 = s2[index]

        if letter_1 not in dict_letters:
            dict_letters[letter_1] = 1
        else:
            if dict_letters[letter_1] + 1 == 0:
                del dict_letters[letter_1]
            else:
                dict_letters[letter_1] = dict_letters[letter_1] + 1

        if letter_2 not in dict_letters:
            dict_letters[letter_2] = -1
        else:
            if dict_letters[letter_2] - 1 == 0:
                del dict_letters[letter_2]
            else:
                dict_letters[letter_2] = dict_letters[letter_2] - 1

    return len(dict_letters) == 0


if __name__ == '__main__':
    print('AABC | CABA = {}'.format(check_anagram('AABC', 'CABA')))
    print('ROMA | AMOR = {}'.format(check_anagram('ROMA', 'AMOR')))
    print('ABCDEF | FEDCBZ = {}'.format(check_anagram('ABCDEF', 'FEDCBZ')))
    print('AAAA | BBBB = {}'.format(check_anagram('AAAA', 'BBBB')))
    print('AABA | ABBB = {}'.format(check_anagram('AABA', 'ABBB')))
