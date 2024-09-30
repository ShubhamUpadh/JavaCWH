def longestSubsWithUniqueChars(str):
    freqArr = [0]*26
    maxLen = 0
    startPt = 0
    i = 0

    while (i < len(str)):
        ordVal = ord(str[i].lower()) - ord('a')

        if freqArr[ordVal] == 0:
            freqArr[ordVal] += 1
            maxLen += 1
        else:
            maxLen = max(maxLen, i - startPt)
            while startPt < i:
                startPtVal = str[startPt].lower()
                freqArr[ord(startPtVal) - ord('a')] -= 1
                if freqArr[ordVal] == 0:
                    freqArr[ordVal] += 1
                    startPt += 1
                    break
                startPt += 1

        i += 1
    return maxLen

print(longestSubsWithUniqueChars("aaaabcda"))