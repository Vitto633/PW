from Cliente import *

class Aparelho:
    def __init__(self, tipo, problema, nome, email):
        self.tipo = tipo
        self.problema = problema
        self.dono = Cliente(nome, email)