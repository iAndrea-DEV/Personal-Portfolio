import colorgram
from turtle import Turtle, Screen
import random

# color_extraction = colorgram.extract('image.jpg', 50)
# colors = []
# for color in color_extraction:
#     r = color.rgb.r
#     g = color.rgb.g
#     b = color.rgb.b
#     color_tuple = (r,g,b)
#
#     colors.append(color_tuple)
#
# print(colors)


color_list = [
(212, 154, 97),
 (52, 108, 132),
 (178, 78, 33),
 (198, 143, 34),
 (123, 80, 97),
 (116, 155, 171),
 (124, 175, 158),
 (194, 85, 105),
 (54, 38, 20)
              ]

turtle = Turtle()
screen = Screen()
screen.colormode(255)
tp = turtle.pos()
turtle.pensize(10)
turtle.speed("fastest")


def million_dollar_painting(width, height, pensize, spacing):
    turtle.hideturtle()
    for h in range(1, height+1): #Compensate for first layer
        for w in range(width):
            color = random.choice(color_list)
            turtle.pencolor(color)
            turtle.dot(pensize)
            turtle.penup()
            turtle.forward(spacing)
            turtle.pendown()
            print(turtle.pos())
        turtle.penup()
        turtle.setx(0.0)
        turtle.sety(spacing * h)

# Allow for variation in width, height, pen size and spacing between dots


million_dollar_painting(10, 10, 20, 50)

screen.exitonclick()