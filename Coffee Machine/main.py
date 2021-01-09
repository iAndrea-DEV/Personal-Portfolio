from resources import MENU, resources

menu = MENU
ingredients = resources
money = 0
profit = 0
def display_report():
    for key in resources:
        if key.lower() == 'water' or key.lower() == 'milk':
            print(f"{key.capitalize()}: {resources.get(key)}ml")
        else:
            print(f"{key.capitalize()}: {resources.get(key)}g")
    print(f"Money: ${profit}")

def coin_entry():
    money = 0
    money += 0.25 * int(input("How many quarters? "))
    money += 0.1 * int(input("How many dimes? "))
    money += 0.05 * int(input("How many nickels? "))
    money += 0.01 * int(input("How many pennies? "))
    return money


def transaction_complete(request, coins):
    global ingredients, menu, profit
    if menu.get(request).get('ingredients').get('water') > ingredients.get('water'):
        print(f"Sorry there is not enough water.")
        print(f"Here's your money back. {coins} ejected")
        return False
    elif menu.get(request).get('ingredients').get('coffee') > ingredients['coffee']:
        print(f"Sorry there is not enough coffe.")
        print(f"Here's your money back. {coins} ejected")
        return False
    elif menu.get(request).get('ingredients').get('milk') > ingredients.get('milk'):
        print(f"Sorry there is not enough milk.")
        print(f"Here's your money back. {coins} ejected")
        return False
    elif coins < MENU.get(request).get('cost'):
        print(f"Sorry there is not enough money.")
        print(f"Here's your money back. ${coins} ejected")
        return False

    else:
        change = coins - MENU.get(request).get('cost')
        print(f"Here's ${round(change,2)} in change.")
        print(f"Here's your {request}. Enjoy!")
        ingredients['water'] -= menu.get(request).get('ingredients').get('water')
        ingredients['coffee'] -= menu.get(request).get('ingredients').get('coffee')
        ingredients['milk'] -= menu.get(request).get('ingredients').get('milk')
        profit += menu.get(request).get('cost')

        return True

while True:
    request = input("What would you like? (espresso/latte/cappuccino): ").lower()
    if request == 'report':
        display_report()
    elif request == 'exit':
        exit()
    else:
        money = coin_entry()
        is_complete = transaction_complete(request, money)
        if not is_complete:
            money = 0
