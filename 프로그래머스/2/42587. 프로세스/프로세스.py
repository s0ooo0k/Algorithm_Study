from collections import deque
def solution(priorities, location):
    answer = 0
    queue = deque()
    
    for i in range(len(priorities)):
        queue.append((priorities[i], i))
                     
    while queue:
        peek = queue.popleft()
        if queue and peek[0] < max(q[0] for q in queue):
            queue.append(peek)
        else:
            answer+=1
            if peek[1]==location:
                return answer