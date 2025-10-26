def solution(numbers):
    def is_prime(n):
        if n < 2:
            return False
        if n == 2:
            return True
        if n % 2==0:
            return False
        
        for i in range(3, int(n**0.5)+1, 2):
            if n%i==0:
                return False
        return True
    
    prime = set()
    
    def dfs(used_mask, current_num):
        if current_num > 0 and is_prime(current_num):
            prime.add(current_num)
            
        for i in range(len(numbers)):
            if used_mask & (1 << i):
                continue
            
            new_mask = used_mask | (1 << i)
            new_num = current_num * 10 + int(numbers[i])
            
            dfs(new_mask, new_num)
            
    dfs(0, 0)
    return len(prime)