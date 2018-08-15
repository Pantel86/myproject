import random

number = random.randint(1, 10)
tries = 4


uname = input("Hello, What's is your username?")

print("Hello", uname + ".", )

question = input("Would you like to play a game? [Y/N]")
if question == "n":
    print("oh....okay")

if question == "y":
    print("I'm thinking of a number between 1 & 10")
    guess = int(input("Have a guess: "))
    if guess > number:
        print("Guess lower...")
    if guess < number:
        print("Guess higher...")
    if guess == number:
        print("OMG YOU GUESSED IT!")
    