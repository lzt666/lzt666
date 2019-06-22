 #include <stdio.h>
#include <stdlib.h>

void swap(int *a,int *b)
{
	int tmp;
	tmp=*a;
	*a=*b;
	*b=tmp;
	
 } 
 int main(){
 	int a=0;
 	int b=0;
 	printf("请输入两个数:\n");
 	printf("a=");
 	scanf("%d",&a);
 	printf("b=");
 	scanf("%d",&b);
 	swap(&a,&b);
 	printf("a=%d b=%d",a,b);
 	system("pause");
 	return 0;
 }

