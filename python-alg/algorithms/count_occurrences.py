"""
Returns a pair with letters and totals accordingly to a
list of strings and letters
"""


def count_occurrences(string, letter, count):
    if len(string) == 0:
        return count
    else:
        if string[0] == letter:
            count += 1
    return count_occurrences(string[1:], letter, count)


def get_letters_by_total(list_string, list_letters):
    letters_by_total = {}

    for letter in list_letters:
        total = 0
        for string in list_string:
            total = count_occurrences(string, letter, total)

        letters_by_total[letter] = total

    return letters_by_total


if __name__ == '__main__':
    lstring = ['house', 'door', 'can', 'bottle', 'book', 'bird']
    lletters = ['a', 'h', 'o', 'u', 'y']
    print(get_letters_by_total(lstring, lletters))
