#!/usr/bin/env python
# -*- coding: utf-8 -*-


import file
from heuristic import Heuristic
from neighbor import Neighbor
import sys
import time


# Algoritmo HillClimbing adaptado de : https://en.wikipedia.org/wiki/Hill_climbing

class HillClimbing(object):

    def __init__(self, iterate, **kwargs):
        self.iterate = iterate
        self.startState = file.read()
        self.neighbor = Neighbor(self.startState)
        self.update_states = None
        if "update_states" in kwargs:
            self.update_states = True

    def hill(self):
        currentState = self.startState

        nextEval = Heuristic(currentState).attacks()

        i = 0
        while i < self.iterate and nextEval != 0:
            newState = self.neighbor.generateState()
            currentEval = Heuristic(newState).attacks()
            if self.update_states:
                print Heuristic(currentState).queensPosition(), " -> ", Heuristic(newState).queensPosition()
            if currentEval <= nextEval:
                currentState = newState
                nextEval = Heuristic(currentState).attacks()

            i += 1
            self.neighbor = Neighbor(currentState)

        file.write(Heuristic(currentState).queensPosition(), self.neighbor.createBoard(), url="./resource/newBoard.txt")

        print "Hill Comum > Iteracao  : ", i
        print "Posicao Inicial das ", len(self.startState), " rainhas : ", Heuristic(self.startState).queensPosition()
        print "Posicao Final das ", len(self.startState), " rainhas : ", Heuristic(currentState).queensPosition()
        print "\tNumero de rainhas atacando : ", Heuristic(currentState).attacks()
        self.startState = currentState
        return Heuristic(currentState).attacks()

    def hill_random(self):
        colision = sys.maxsize
        count = 0
        stagnate = sys.maxsize
        old_col = -1
        while colision != 0 and not stagnate == 100:
            print "Hill Random > Iteracao: ", count + 1
            print "------------------------------------------\n"
            start = time.time()
            colision = self.hill()
            end = time.time() - start
            print "\tTempo de execucao : ", end, " segundos"
            self.neighbor = Neighbor(self.startState)
            count += 1
            print "\n------------------------------------------\n"
            if not old_col == colision:
                old_col = colision
                stagnate = 0
            else:
                stagnate += 1