def solution(numbers, hand):
    answer=''
    pos = {
        1: (0, 0), 2: (0, 1), 3: (0, 2),
        4: (1, 0), 5: (1, 1), 6: (1, 2),
        7: (2, 0), 8: (2, 1), 9: (2, 2),
        '*': (3, 0), 0: (3, 1), '#': (3, 2)
    }
    
    lh = pos['*']
    rh = pos['#']
           
    for i in numbers:
        if i in [1, 4, 7]:
            answer+='L'
            lh = pos[i]
            
        elif i in [3, 6, 9]:
            answer+='R'
            rh = pos[i]
        
        else :
            pad = pos[i]
            lh_d = abs(lh[0]-pad[0])+abs(lh[1]-pad[1])
            rh_d = abs(rh[0]-pad[0])+abs(rh[1]-pad[1])
            
            if lh_d < rh_d:
                answer+='L'
                lh = pad
            elif lh_d > rh_d:
                answer+='R'
                rh = pad
            else :
                if hand == "left":
                    answer+='L'
                    lh = pad
                else:
                    answer +='R'
                    rh = pad
    return answer
            
           
    return answer