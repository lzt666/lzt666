#include <stdio.h>


int main()
{
	int i=10;
	int MAX=0;
	int arr[11]={0};
	printf("����������ʮ����:");
	for(i=1;i<=10;i++)
	{
		scanf("%d",&arr[i]);
		
	}
	MAX=arr[1];
	for(i=2;i<=10;i++)
	{
		if(arr[i]>MAX)
		{
			MAX=arr[i];
			
		}
	}
	 printf("������Ϊ��%d",MAX);
	 return 0;
	
 } 
