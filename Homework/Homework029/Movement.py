from abc import ABC, abstractmethod


class Movement(ABC):

    @abstractmethod
    def moveForward():
        pass

    @abstractmethod
    def moveBack():
        pass


class Vehicle(Movement):
    def __init__(self, name) -> str:
        self.name = name

    def moveForward(self):
        return (self.name + " move forward...")

    def moveBack(self):
        return (self.name + " move back...")

class Car(Vehicle):
    def __init__(self, name) -> str:
        self.name = name

    def moveForward(self):
        return super().moveForward()
    
    def moveBack(self):
        return super().moveBack()
    
    def startEngine(self):
        return (self.name + " start engine...")
    



a = Vehicle("Lada")
b = Car("Volvo")

print(a.moveBack())
print(b.startEngine())
print(b.moveForward())
