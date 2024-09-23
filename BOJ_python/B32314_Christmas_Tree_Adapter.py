a = int(input()) # 크리스마스 트리 암페어
w, v = map(int, input().split( )) # 어댑터 와트, 볼트
if (w/v >= a): # 어댑터 암페어 >= 트리 암페어 
    print(1)
else:
    print(0)
