import urllib.request

import time

import smtplib

import getpass

sender = 'lowels@grizzlies.adams.edu'

sendto = input ("Where would you like an email to be sent ")

receivers = [sendto]

def mailPrice(msg):
    msg = str(msg)
    message = "\n"+msg
    print(message)
    try:
        print(sender)
        smtpObj = smtplib.SMTP('smtp.gmail.com:587')
        smtpObj.ehlo()
        smtpObj.starttls()
        password = getpass.getpass()
        smtpObj.login(sender,password)
        smtpObj.sendmail(sender, receivers, message)
        smtpObj.quit()
        print ("Successfully sent email")
    except smtplib.SMTPException:
        print( "Error: unable to send email")

def get_price():
    page = urllib.request.urlopen("http://beans-r-us.appspot.com/prices.html")
    text = page.read().decode("utf8")
    where = text.find('>$')
    start_of_price = where + 2
    end_of_price = start_of_price + 4
    return float(text[start_of_price:end_of_price])

price_now = input("Do you want to see the price now (Y/N)? ")

if price_now == "Y":
    price = get_price()
    print(price)

else:
    maxprice = input ("How much do you want to spend on coffee? ")
    maxprice = float(maxprice)
    price = 5.00
    while price > maxprice:
        time.sleep(1)
        get_price()
        maxprice = float(input ("Change your price. "))

mailPrice(price)

print(price)

print(sender)

print ("Buy!")

