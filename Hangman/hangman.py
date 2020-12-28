import random
import hangman_word_list as hwl
import hangman_artistic_details as had

stages = had.stages
logo = had.logo
word_list = hwl.word_list

chosen_word = random.choice(word_list)
print(chosen_word)
display = []
for i in range(0,len(chosen_word)):
    display.append("_")


end_of_game = False
lives = 6

print(logo)
print(stages[6])
print(f"{' '.join(display)}")

while not end_of_game:
    guess = input("Guess a letter: ").lower()
    while(guess in display):
        print("You have already chosen this letter. ")
        guess = input("Guess another letter: ")

    correct_guess = False
    for i in range(0,len(chosen_word)):
        if chosen_word[i] == guess:
            display[i] = chosen_word[i]
            correct_guess = True
    # or if guess not in chosen_word
    if not correct_guess:
        print(f"{guess} is not in the word. You lose a life.")
        lives -=1

    print(stages[lives])
    print(f"{' '.join(display)}")
    if "_" not in display or lives == 0:
        end_of_game = True

if lives == 0:
    print(f" You lose.")
else:
    print("You win.")