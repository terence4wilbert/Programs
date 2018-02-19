def pill_bottles(bottles):
    pills = []
    for i, bottle in enumerate(bottles):
        pills += [bottles.pill()] * i
    weight = use_scale(pills)
    index = (weight- 190) * 10
    return int(index + 0.1)

def use_scale(pills):
    return sum(pills)

class Bottle():
    def __init__(self, pill_weight=1.0):
        self.pill_weight = pill_weight

    def pill(self):
        return self.pill_weight

