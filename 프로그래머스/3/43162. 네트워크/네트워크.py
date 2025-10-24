def solution(n, computers):
    answer = 0
    visited = [False]*n
    
    def dfs(idx):
        visited[idx] = True
        for next in range(n):
            if computers[idx][next] == 1 and not visited[next]:
                dfs(next)
    
    for i in range(n):
        if not visited[i]:
            answer+=1
            dfs(i)
            
    return answer