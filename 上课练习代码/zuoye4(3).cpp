#include <stdio.h>
int main(){
	
int i,j,m,n,sum=0,term=0;
printf("������һ�����֣�\n");
scanf("%d",&m);
printf("��������һ�����֣�\n");
scanf("%d",&n);

for(i=1;i<=n;i++)
{
	term=term*10+m;
	sum=sum+term; 
} 
printf("m+mm+mmm+mmmm+m....m=%d",sum);
return 0;
}

