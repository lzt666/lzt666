#include <stdio.h>
#include <stdlib.h>

void mul(int n){//����һ���˷����� 
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
	printf("������˷��ھ�����:");
	scanf("%d",&n);
	mul(n);
	return 0;
	
} 
