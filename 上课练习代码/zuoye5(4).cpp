#include <stdio.h>
#include <stdlib.h>

void mul(int n){//定义一个乘法函数 
	int i,k;
	for(i=0;i<=9;i++)
	{
		for(k=1;k<=9;k++)
		{
			printf("%d*%d=%2d  ",i,k,i*k);
		}
		printf("\n");
		
	}
}
int main(){
	int n=0;
	printf("请输入乘法口诀的行:");
	scanf("%d",&n);
	mul(n);
	return 0;
	
} 
