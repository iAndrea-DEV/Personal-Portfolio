import random as r

min = 1
max = 100
number = r.randint(1,100)
lives = 5
guess = 0


print("Welcome to the Number Guessing Game!")
print(f"I'm thinking of a number between {min} and {max}.")


while guess != number and lives > 0:
    guess = int(input("Make a guess: "))
    if guess > number:
        print(f"Too high.")
        lives -=1

    elif guess < number:
        print(f"Too low.")
        lives -=1

    if lives > 0 and guess != number:
        print(f"Guess again.")

    if guess != number and lives >0:
        print(f"You have {lives} attempts remaining to guess the number.")

    if guess == number:
        print(f"You found the number! Congratulations")

    if lives == 0 and guess != lives:
        print(f"The number was {number} but you didn't find it. You lost!")
