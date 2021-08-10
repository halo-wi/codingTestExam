def solution(routes):
    answer = 0
    
    routes.sort(key=lambda x:x[0])

    temp = routes[0][1]

    for i in range(0, len(routes)):
        last = routes[i][1]
        start = routes[i][0]
        
        if temp > last :
            temp = last
        
        if temp < start :
            answer+=1
            temp=last
    
    return answer+1
