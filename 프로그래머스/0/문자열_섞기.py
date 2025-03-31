def solution(str1, str2):
    a = []
    for i in range(0, len(str1)):
        a.append(str1[i])
        a.append(str2[i])
        
    answer = "".join(a)
    return answer


# 다른 풀이
def solution2(str1, str2):
    answer = ''
    for i in range(0, len(str1)):
        answer = answer + str1[i] +str2[i]
        
    return answer


str1 = input()
str2 = input()
print(solution(str1, str2))
print(solution2(str1, str2))


