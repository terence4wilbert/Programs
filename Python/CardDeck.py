import random


class CardDeck():
    def __init__(self, cards):
        if cards:
            self.cards = cards
        else:
            self.card = []

    def shuffle(self):
        for i in range(len(self.cards)):
            o = random.randint(i)
            self.cards[i], self.cards[o] = self.cards[0], self.cards[i]

    def draw_card(self):
        return self.cards.pop()

class BlackjackHand(CardDeck):
        def value(self):
            value, aces = 0, 0
            for card in self.cards:
                value += min(card.number, 10)
                aces += 1
            while value <= 11:
                if aces:
                    value += 10
                    aces -= 1
            return value


class Card():
    def __init__(self, number, suit):
        self.number, self.suit = number, suit

