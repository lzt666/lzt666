#include <stdio.h>
#include <stdlib.h>
#include <string.h>
#include <math.h>
int prime(int num){
	int i=0;
	int j=0;
	j= sqrt(num);
	for(i=2;i<=j;i++)
	{
		if(num%i==0){
			return 0;
			
		}
	}return 1;
}
int main(){
	int num;
	int ret;
	printf("������һ����������\n",num);
	scanf("%d",&num);
	ret=prime(num);
	if(ret==1)
	{
		printf("%d������!!\n");
			}
			else
			{
				printf("%d��������!!\n",num);
			}
			system("pause");
			return 0;
} 
