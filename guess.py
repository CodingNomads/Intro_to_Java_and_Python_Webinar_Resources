# import required dependencies
import random

# generate a random number between 1 and 10
# this is the number the user must guess
num = random.randint(1,10)

# declare an empty variable called "guess"
guess = None

# while the user's guess is not the random number from above, loop
while guess != num:

	# get a guess from the user
    guess = input("guess a number between 1 and 10: ")
    # make sure that guess is an integer
    guess = int(guess)

    # the two lines above could be a single line:
    # guess = int(input("guess a number between 1 and 10: "))

    # if the user guessed correctly
    if guess == num:
        print(f"congratulations! you won! {num} was the winner!")
	# if the user guessed too high
    elif guess > num:
        print(f"nope, sorry, {guess} is too high!")
    # if the user guessed too low
    elif guess < num:
        print(f"nope, sorry, {guess} is too low!")