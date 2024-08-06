arr = [[1,2],[3,4]]
newArr = list()
for i in range(2*len(arr)-1):
    newArr.append([])
print(newArr)

for i in range(len(arr)):
    for j in range(len(arr[0])):
        #print(arr[i][j])
        newArr[i+j].append(arr[i][j])
        #print(newArr)

print(newArr)