def solution(answers):
    a = [1, 2, 3, 4, 5] 
    b = [2, 1, 2, 3, 2, 4, 2, 5] 
    c = [3, 3, 1, 1, 2, 2, 4, 4, 5, 5] 
    
    scores = [0, 0, 0]
    
    for i, answer in enumerate(answers):
        if a[i % len(a)] == answer:
            scores[0] += 1
        if b[i % len(b)] == answer:
            scores[1] += 1
        if c[i % len(c)] == answer:
            scores[2] += 1
    
    max_score = max(scores)
    
    result = []
    for i, score in enumerate(scores):
        if score == max_score:
            result.append(i + 1)
    
    return result