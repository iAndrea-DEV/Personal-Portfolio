import random as r
import art

cards = [11, 2, 3, 4, 5, 6, 7, 8, 9, 10, 10, 10, 10]
player_cards = []
player_sum = 0
computer_cards = []
computer_sum = 0
n_games = 0

print(art.logo)
play_game = input("Do you want to play Blackjack? Type 'y' or 'n':").lower()


def setup():
    global player_cards
    global player_sum
    global computer_cards
    global computer_sum

    for i in range(2):
        card = r.choice(cards)
        player_sum += card
        player_cards.append(card)

    if player_sum == 22:
        player_cards[0] = 1
        player_sum -= 10

    card = r.choice(cards)
    computer_sum += card
    computer_cards.append(card)

def draw_card(player, score):
    card = r.choice(cards)
    if card + score > 21 and card == 11:
        card = 1
        player.append(card)
        score += card

    elif card + score > 21 and 11 in player:
        player.append(card)
        for _ in player:
            if _ == 11:
                _ = 1
                score -= 10
                score += card
    else:
        player.append(card)
        score += card

    return score


def compare():
    if player_sum > 21:
        print(f"You lost. Computer won.")

    elif computer_sum > 21:
        print(f"You won! Computer lost.")

    elif player_sum > computer_sum:
        print(f"You won! Computer lost.")

    elif computer_sum > player_sum:
        print(f"You lost. Computer won.")

    elif player_sum == computer_sum:
        print(f"It's a draw.")


def update_screen():
    print(f"Your cards: {player_cards}, your score is {player_sum}")
    print(f"Computer's cards: {computer_cards}")
    print()


def update_screen_special():
    print(f"Your cards: {player_cards}, current score: {player_sum}")
    print(f"Computer's cards: [{computer_cards[0]},?]")
    print()


def reset():
    global player_cards
    global player_sum
    global computer_cards
    global computer_sum
    player_cards.clear()
    computer_cards.clear()
    player_sum = computer_sum = 0


def play():
    global player_cards
    global player_sum
    global computer_cards
    global computer_sum

    setup()
    print(f"Your cards: {player_cards}, current score: {player_sum}")
    print(f"Computer's cards: [{computer_cards[0]},?]")
    draw = input("Type 'y' to get another card, type 'n' to pass: ").lower()
    while draw == 'y' and player_sum <= 21:
        player_sum = draw_card(player_cards, player_sum)
        update_screen_special()

        if player_sum <= 21:
            draw = input("Type 'y' to get another card, type 'n' to pass: ").lower()

    if player_sum <= 21:
        while computer_sum < 17:
            computer_sum = draw_card(computer_cards, computer_sum)
            update_screen()

    compare()
    print()


while play_game == 'y':
    play()
    play_game = input("Do you want to play Blackjack again? Type 'y' or 'n':").lower()
    if play_game == 'y':
        reset()
