from collections import Counter

def solution(participant, completion):
    
    p_count = Counter(participant)
    c_count = Counter(completion)
    
    result = p_count - c_count
    
    return list(result.keys())[0]