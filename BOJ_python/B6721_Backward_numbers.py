# 두 개의 양의 정수(0 포함)를 입력 받았을 때 각 수를 뒤집은 수의 합을 뒤집은 값을 출력하는 문제

n = int(input())  # 테스트케이스

for _ in range(n):
    a, b = input().split()  # 원래 수 a, b
    sum = int(a[::-1]) + int(b[::-1])  # 뒤집은 a와 뒤집은 b의 합
    print(int(str(sum)[::-1]))  # 합을 뒤집은 값을 숫자형으로 바꾼 후 출력(앞의 0 제거)
