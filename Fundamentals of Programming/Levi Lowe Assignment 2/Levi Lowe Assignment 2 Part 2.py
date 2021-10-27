import urllib.request
import time

maxprice = input ("How much do you want to spend on coffee? ")
maxprice = float(maxprice)
price = 5.00

while price > maxprice:
    time.sleep(1)
    page = urllib.request.urlopen("http://beans-r-us.appspot.com/prices.html")
    text = page.read().decode("utf8")

    where = text.find('>$')

    start_of_price = where + 2
    end_of_price = start_of_price + 4

    price = float(text[start_of_price:end_of_price])

    maxprice = float(input ("Change your price. "))

    
print ("Buy!")
