#include <stdio.h>

int main()
{
	int num=0;
	int count=0;
	for(int n=1;n<=100;n++)
	{
		num=n;
		while(num>0)
		{
			int d=num%10;//ȡ�����һλ
			if(d==0)
			{
				count++;
				
				
			 } 
			num/=10;
			
		}
	}
	printf("9�ĸ���Ϊ:%d\n",count);
	return 0;
 } 
