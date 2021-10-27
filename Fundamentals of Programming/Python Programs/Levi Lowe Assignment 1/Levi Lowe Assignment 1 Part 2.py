from random import randint

response = "yes"
while response == "yes":

    secret = randint(1, 10)

    print("Welcome")

    guess = 0
    while guess !=secret:
        g = input ("Guess the number ")
        guess = int(g)
        if guess == secret:
            print ("You Win!")
        else:
            if guess > secret:
                print ("Too High!")
            else:
                print ("Too Low")
    response = input ("Do you want to play again? ")


print ("Game over!")
