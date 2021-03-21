import pandas

#TODO 1. Create a dictionary in this format:

{"A": "Alfa", "B": "Bravo"}

data = pandas.read_csv("nato_phonetic_alphabet.csv")
data.to_dict()
nato_alphabet = {row.letter: row.code for (index,row) in data.iterrows()}

#TODO 2. Create a list of the phonetic code words from a word that the user inputs.

user_input = input("What is your word: ").upper()
nato_alphabet_output = [nato_alphabet[letter] for letter in user_input]
print(nato_alphabet_output)


