def solution(my_string, overwrite_string, s):
    answer = my_string[:s] + overwrite_string + my_string[len(overwrite_string)+s:]
    return answer


my_string = input()
overwriting_string = input()
s = int(input())

print(solution(my_string, overwriting_string, s))

