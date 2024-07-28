def mergeOverlappingIntervals(arr):
    newArr = list()
    newArr.append(arr[0])
    newArrPt = 0
    for i in range(1,len(arr)):
        presentElem = newArr[newArrPt]
        currElem = arr[i]
        if presentElem[1] < currElem[0]:
            newArr.append(currElem)
            newArrPt += 1
        else:
            if presentElem[1] < currElem[1]:
                newArr[newArrPt][1] = currElem[1]

    return newArr

print(mergeOverlappingIntervals([[1,2], [2,10], [4,6],[5,11]]))