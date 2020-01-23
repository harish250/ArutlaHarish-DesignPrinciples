import itertools as it
n=int(input())
l=list(map(int,input().split(" ")))
num=int(input())
count=0
for i in range(len(l)-1):
    if((l[i]==0 and l[i+1]==0)):
        if(i>0):
            if(l[i+1]==0 and l[i]==0 and l[i-1]==0):
                l[i]=1
                count+=1

                    

            elif(i==0):
                    if (l[i]==0 and l[i+1]==0):
                        l[i]=1
                        count+=1

            

if(count>=num):
    print("true")
else:
    print("false")

