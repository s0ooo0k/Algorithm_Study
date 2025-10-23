def solution(array):
#     answer = [] 
#     max = 0
#     max_i = 0
    
#     for i in range(len(array)):
#         if array[i] > max:
#             max = array[i]
#             max_i = i
            
#     answer.append(max)
#     answer.append(max_i)

    max_num = max(array)
    max_idx = array.index(max_num)
    
    return [max_num, max_idx]