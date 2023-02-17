class swapsort:
    def __init__(self, arr: list):
        self.list = arr
        self.final_list = []

    def sort(self):
        arr = self.list
        active = arr[0]
        for x in range(len(arr)):
            try:
                if active > arr[x+1]:
                    arr[x], arr[x+1] = arr[x+1], arr[x]
                else:
                    active = arr[x]
            except IndexError:
                pass
            print(arr)


swap = swapsort([5,4,1,2,3])
swap.sort()
print(swap.list)


