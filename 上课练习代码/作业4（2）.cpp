#include <stdio.h>
int main(){
	
int i,j,k,n;
printf("水仙花数为：\n");

for(n=0;n<1000;n++)
{
	i=n/100;
	j=(n-i*100)/10;
	k=n%10;
	if(i*i*i+j*j*j+k*k*k==n)
	{
		printf("%d ",n);
	}
  }
} 

