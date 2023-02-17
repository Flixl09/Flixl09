#random für randomlist
import random2
#time für wie lange er brauchen
import time
#sys für zeilenargument
import sys

#Ein Sortieralorythmus, welcher auf Quantenkopplung basiert

class cocktail_quantum_sort:
    #Variablen
    def __init__(self, arr: list):
        self.list = arr
        self.linklist = {}
        self.final_list = []
        self.biggest_i = None
        self.lowest_i = None
    
    #Nimmt die Elemente und packt sie in eine Liste mit dem Pattern differenz:[größte Zahl,kleinste Zahl]
    def getelements(self):
        arr = self.list
        biggest_i = 0
        biggest_index = 0
        #Nimmt die größte Zahl
        for x in range(len(arr)):
            if arr[x] > biggest_i:
                biggest_index = x
                biggest_i = arr[x]
        
        #setzt die Class Variable zu der größten Zahl
        if self.biggest_i == None:
            self.biggest_i = biggest_i

        #entfernt den Index
        arr.pop(biggest_index)
        lowest_index = biggest_index
        lowest_i =  biggest_i
    
        #kleinster Index
        for x in range(len(arr)):
            if arr[x] < lowest_i:
                lowest_index = x
                lowest_i = arr[x]

        #try weil wenn der ausgangsarray ungerade ist und oben schon die letzte zahl entfernt wurde gibts nen geilen error
        try:
            arr.pop(lowest_index)
        except IndexError:
            lowest_i = None
            self.linklist[0] = [None, biggest_i]
        else:
            if self.lowest_i == None:
                self.lowest_i = lowest_i

            #fügt der linklist das Pattern hinzu
            self.linklist[abs(biggest_i - lowest_i)] = [lowest_i, biggest_i]
    
    #macht die linklist
    def createlists(self):
        for x in range(round((len(self.list)+1)/2)):
            self.getelements()

    #sortiert die linklist nach den differenzen und added zu der finalen list größte nach kleinste
    def finally_sort(self):
        for x in range(abs(self.biggest_i - self.lowest_i)+1):
            try:
                if self.linklist[x][0] == None:
                    self.final_list.append(self.linklist[x][1])
                else:
                    self.final_list.insert(0, self.linklist[x][0])
                    self.final_list.append(self.linklist[x][1])
            except KeyError:
                continue

    #return sorted
    def return_sorted(self):
        return self.final_list


    #statische Methode welche die Liste auf korrektheit überprüft
    @staticmethod
    def check_list(arr: list):
        for x in range(1, len(arr)-1):
            if arr[x-1] > arr[x]:
                return False
        
        return True

    
starttime = time.time()
randomlist = []
try:
    length = int(sys.argv[1])
except IndexError:
    length = 5000
for i in range(length):
    n = random2.randint(1,length*2)
    #if n not in randomlist:
    randomlist.append(n)
print("Integers: " + str(length))
print("Randomlist created: "+ str(round(time.time() - starttime, 2)))
print(randomlist)
print(len(randomlist))
y = cocktail_quantum_sort(randomlist)
y.createlists()
print("List created: " + str(round(time.time() - starttime, 2)))
y.finally_sort()
final_time = time.time() - starttime
print("sorted: " + str(round(final_time, 2)))
print(y.linklist)
if y.check_list(y.final_list):
    print(y.final_list)
    print(final_time)
    print(len(y.final_list))
else:
    print(y.final_list)
    print("Congratulations, you found an unsortable List!!")
        
