def solve(self, A):
    pascalT = [[1], [1,1]]
    if A < 3:
        return pascalT[:A]
    for i in range(A):
        if i <= 1:
            continue
        reference = pascalT[i-1]
        newArr = [1]
        for k in range(len(reference)-1):
            newArr.append(reference[k] + reference[k+1])
        newArr.append(1)
        pascalT.append(newArr)
    return pascalT