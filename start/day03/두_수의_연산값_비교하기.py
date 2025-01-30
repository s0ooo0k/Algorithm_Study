def solution(a, b):
    xnd = int(str(a)+str(b))
    mul = 2*a*b
    return max(xnd, mul)

a = int(input())
b = int(input())
print(solution(a, b))
