def solution(numbers):
    num = 0
    
    for i in numbers:
        num += i
        
    answer = num / len(numbers)
    return answer