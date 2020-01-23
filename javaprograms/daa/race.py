coordinates=list(map(int,input().split(" ")))
m=int(coordinates[0])
n=int(coordinates[1])
p=int(coordinates[2])
q=int(coordinates[3])
def compute(m,n,p,q):
    if(m>p and  n>q):
        return False
    elif(m==p and n==q):
        return True
    elif(m<p or n<q):
        compute(m,m+n,p,q)
        compute()
valid=compute(m,n,p,q)
if(valid):
    print("YES")
else:
    print("NO")

