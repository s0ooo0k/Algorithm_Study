from collections import Counter

def solution(nums):
    n = len(nums)/2
    cnt = Counter(nums)
    
    if len(cnt) >= n:
        return n
    else:
        return len(cnt)