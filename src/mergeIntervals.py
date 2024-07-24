'''
Given a set of non-overlapping intervals and a new interval.

Insert the new interval into the set of intervals (merge if necessary).

You may assume that the intervals were initially sorted according to their start times.
Note: Make sure the returned intervals are also sorted.
'''

def addInterval(arr, interval):

    newArr = list()
    a, b = interval
    i = 0
    integrated = False

    while i < len(arr):

        currElem = arr[i]
        if integrated:
            newArr.append(currElem)
            i += 1
            continue

        if a <= currElem[0]:
            if b <= currElem[1]:
                newArr.append([a,currElem[0]])
                i += 1
                integrated = True
            else:
                j = i + 1
                while j < len(arr) and not integrated:
                    if b < arr[j][0]:
                        newArr.append([a,b])
                        integrated = True
                        j += 1
                    elif arr[j][0] <= b < arr[j][1]:
                        newArr.append([a,arr[j][1]])
                        integrated = True
                        j += 1
                    j = j + 1 if not integrated else j

                if j == len(arr) and not integrated:
                    newArr.append([a,b])
                    integrated = True
                i = j
        elif currElem[0] < a <=currElem[1]:
            if b <= currElem[1]:
                newArr.append(currElem)
                integrated = True
                i += 1
            else:
                j = i + 1
                while j < len(arr) and not integrated:
                    if b < arr[j][0]:
                        newArr.append([currElem[0], b])
                        integrated = True
                        j += 1
                    elif arr[j] <= b < arr[j][1]:
                        newArr.append([currElem[0], b])
                        integrated = True
                        j += 1
                    j = j + 1 if not integrated else j
                if j == len(arr) and not integrated:
                    newArr.append([currElem[0], b])
                    integrated = True
                i = j
        i += 1
    return newArr






    