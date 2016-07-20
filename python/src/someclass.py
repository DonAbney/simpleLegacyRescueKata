import random

class someClass():

    def someMethod(self):

        myRandomFlag = ""
        if ((self.thingOne() or (not self.thingOne() and self.thingTwo())) and self.thingThree()):
            myRandomFlag = "Bacon";
        else:
            myRandomFlag = "Tofu";

        return myRandomFlag

    def thingOne(self):
        return random.choice([True, False])

    def thingTwo(self):
        return random.choice([True, False])

    def thingThree(self):
        return random.choice([True, False])
