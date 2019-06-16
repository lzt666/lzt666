#include <stdio.h>
#include <stdlib.h>

void Swap(int *px,int *py)
{
	int tmp=0;
	tmp=*px;
	*px=*py;
	*py=tmp;
}
int main()
{
	int a,b,c;
	printf("请输入三个整数：\n");//将三个数从大到小输出 
	scanf("%d%d%d",&a,&b,&c);
	if(a<b)
	{
		Swap(&a,&b);
	 } 
	 if(a<c)
	{
		Swap(&a,&c);
	 } 
	 if(b<b)
	{
		Swap(&b,&c);
	 } 
	 printf("%d %d %d\n",a,b,c);
	 system("pause");
	 return 0;
	 
}
