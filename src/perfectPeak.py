def perfectPeak(arr):

    leftGreater = [0 for x in arr]
    rightSmaller = [0 for x in arr]

    leftGreater[0],rightSmaller[-1] = 0, len(arr) - 1

    for i in range(1,len(arr)):
        if arr[i] > arr[leftGreater[i-1]]:
            leftGreater[i] = i
        else:
            leftGreater[i] = leftGreater[i-1]

    for i in range(len(arr)-2, -1, -1):
        if arr[i] < arr[rightSmaller[i+1]]:
            rightSmaller[i] = i
        else:
            rightSmaller[i] = rightSmaller[i+1]

    for i in range(1, len(arr)-1):
        if leftGreater[i] == rightSmaller[i]:
            #print(i)
            #print(arr[i])
            return 1

    return 0


arr = [1, 2, 3, 4, 5, 4, 3, 2, 3, 10]
print(perfectPeak(arr))