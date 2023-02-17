import random2

class bogosort:
    def __init__(self, arr: list):
        self.list = arr
        self.final_list = []
    
    def checkcorrect(self):
        before = self.list[0]
        for x in range(1,len(self.final_list)):
            if before > self.list[x]:
                return False
        
        return True

    def bogo(self):
        self.final_list = self.list
        print(self.checkcorrect())
        while self.checkcorrect:
            print(self.final_list)
            zahl = random2.randint(0,len(self.final_list)-1)
            self.final_list.insert(zahl,self.final_list[zahl])
            del self.final_list[zahl]
        
    def printfinal(self):
        print(self.final_list)
    
bog = bogosort([2,1,5])
bog.bogo()
bog.printfinal()