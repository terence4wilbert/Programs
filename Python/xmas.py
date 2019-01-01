import termcolor
import random
import time
import datetime
from os import system, name
from colorama import init
from termcolor import colored


def clear():
    # check if windows
    if name == 'nt':
        _ = system('cls')
    # if *nix
    else:
        _ = system('clear')

colors = [
    'red',
    'green',
    'yellow',
    'blue',
    'magenta',
    'cyan',
    'white']

yellowlight = termcolor.colored('o', 'yellow')
magentalight = termcolor.colored('o', 'magenta')
cyanlight = termcolor.colored('o', 'cyan')

lightlist = [yellowlight, cyanlight, magentalight]

init()
while True:  #exit with ctrl-c
    random.seed(datetime.datetime.now())
    for i in range(1,30,2):
        tree = ''
        for j in range(i):
            if random.randint(0,500) >= 250:
                tree += lightlist[random.randint(0,2)]
            else:
                tree += termcolor.colored('*', 'green')
        string = '_'*(15-int(i/2))+tree+'_'*(15-int(i/2))
        print(string)
    trunk = colored('mWm', 'yellow')
    for k in range(3):
        print('_'*14+trunk+'_'*14)
        merry_Christmas = termcolor.colored('Merry Christmas', colors[random.randint(0,len(colors)-1)])
    print('_'*8+merry_Christmas+'_'*8)
    time.sleep(0.5)
    clear()
