def solution(n):
    # 자연수를 문자열로 - 뒤집기 - 분리 - 배열
    return list(map(int, str(n)[::-1]))