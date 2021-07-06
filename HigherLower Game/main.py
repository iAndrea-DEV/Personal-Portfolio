import random as r
from data import title, vs, data

title = title
data = data
vs = vs

hasWon = True
score = 0
p1, p2 = dict(),dict()

def choose_players(score):
    global p1,p2
    if score == 0:
        p1 = data[r.randint(0, len(data) - 1)]
        p2 = data[r.randint(0, len(data) - 1)]
    else:
        p1 = p2
        p2 = data[r.randint(0, len(data) - 1)]


def screen_update(p1, p2):
    print(title)
    if score > 0:
        print(f"Your current score is {score}.")

    print(f"Compare A: {p1.get('name')}, a {p1.get('description')}, from {p1.get('country')}.")
    print(vs)
    print(f"Against B: {p2.get('name')}, a {p2.get('description')}, from {p2.get('country')}.")


def compare(p1, p2, guess):
    if (p1.get('follower_count') > p2.get('follower_count') and guess == 'a') or (
            p1.get('follower_count') < p2.get('follower_count') and guess == 'b'):
        return True
    return False


def play():
    global score, hasWon, p1, p2
    choose_players(score)
    screen_update(p1, p2)
    guess = input("Who has more followers? Type 'A' or 'B': ").lower()
    hasWon = compare(p1, p2, guess)

    if hasWon:
        print(f"You are correct!")
        score += 1
    else:
        print(f"That is incorrect. Your final score is {score}")


while hasWon:
    play()
