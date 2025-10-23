def solution(answers):
    a = [1, 2, 3, 4, 5]
    b = [2, 1, 2, 3, 2, 4, 2, 5]
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5]
    
    a_score, b_score, c_score = 0, 0, 0
    
    for i, answer in enumerate(answers):
        if answer == a[i%len(a)]:
            a_score+=1
        if answer == b[i%len(b)]:
            b_score+=1
        if answer == c[i%len(c)]:
            c_score+=1
            
    score = [a_score, b_score, c_score]
    max_score = max(score)
    
    answer = []
    for i in range(3):
        if score[i] == max_score:
            answer.append(i+1)
            
    return answer