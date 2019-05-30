#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int LeapYear(int year)
{
	if(year%4==0&&year%100!=0||year%400==0)
	{
		return 1;
	}
	return 0;
}

int main()
{
	int i=0;
	for(i=1000;i<=2000;i++)
	{
		if(LeapYear(i)==1){
			printf("ÈòÄêÎª:%d\n",i); 
		}
	}
	
}
