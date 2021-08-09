def solution(money):
    answer = 0

    s = [0 for i in range(len(money)-1)]
    t = [0 for i in range(len(money))]

    s[0] =  money[0]
    s[1] =  money[0]

    for i in range(2,len(money)-1):
      s[i] = max(s[i-2] + money[i], s[i-1])
    
    t[1] = money[1]
    for i in range(2,len(money)):
      t[i] = max(t[i-2] + money[i], t[i-1])

    answer = max(s[-1], t[-1])
    
    
    return answer
