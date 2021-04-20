import turtle
import pandas

screen = turtle.Screen()
screen.title("U.S States Game")

image = "blank_states_img.gif"

turtle.penup()
screen.addshape(image)
screen.bgpic(image)
turtle.hideturtle()
turtle.speed("fast")

data = pandas.read_csv("50_states.csv")

guessed_states = []
while len(guessed_states) < 50:

    answer_state = screen.textinput(title = f"{len(guessed_states)}/50 states found", prompt= "What's another state's name?")
    answer_state = answer_state.lower()
    if answer_state.lower() == "exit":
        states_to_learn = []
        for i in range(0, len(data)):
            if data.state[i].lower() not in guessed_states:
                states_to_learn.append(data.state[i].title())
        new_data = pandas.DataFrame(states_to_learn)
        new_data.to_csv("states_to_learn.csv")
        break

    for i in range(0,len(data)):
        if data.state[i].lower() == answer_state and data.state[i].lower() not in guessed_states:
            guessed_states.append(data.state[i].lower())
            turtle.goto(data.x[i],data.y[i])
            turtle.write(data.state[i], move = False)




