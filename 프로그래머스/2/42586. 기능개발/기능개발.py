def solution(progresses, speeds):
    answer = []
    
    while progresses:
        # 1일 작업
        for i in range(len(progresses)):
            progresses[i]+=speeds[i]
        
        # 첫번재 완료 확인
        if progresses[0] >=100:
            cnt = 0
            
            while progresses and progresses[0] >=100:
                progresses.pop(0)
                speeds.pop(0)
                cnt +=1
            answer.append(cnt)

    return answer