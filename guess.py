import random

num = random.randint(1,10)

guess = None

while guess != num:
    guess = input("guess a number between 1 and 10: ")
    guess = int(guess)

    if guess == num:
        print(f"congratulations! you won! {num} was the winner!")
    elif guess > num:
        print(f"nope, sorry, {guess} is too high!")
    elif guess < num:
        print(f"nope, sorry, {guess} is too low!")