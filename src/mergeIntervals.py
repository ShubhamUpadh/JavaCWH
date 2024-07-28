'''
Given a set of non-overlapping intervals and a new interval.

Insert the new interval into the set of intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.
Note: Make sure the returned intervals are also sorted.
'''
def mergeIntervals(arr,interval):
    newArr = list()
    if interval[0] < arr[0][0]:
        newArr.append(interval)
        newArrPt = 0
    else:
        newArr.append(arr[0])
        newArrPt = 0
    integrated = False
    for i in range(newArrPt,len(arr)):
        presentElem = newArr[newArrPt]
        if integrated or arr[i][0] <= interval[0]:
            currElem = arr[i]
        else:
            currElem = interval
            integrated = True
        if presentElem[1] < currElem[0]:
            newArr.append(currElem)
            newArrPt += 1
        else:
            if presentElem[1] < currElem[1]:
                newArr[newArrPt][1] = currElem[1]

    return newArr

print(mergeIntervals([[1,2], [5,10], [11,37],[55,111]],[35,112]))

