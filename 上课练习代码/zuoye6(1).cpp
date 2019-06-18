#include <stdio.h>
#include <stdlib.h>
#include <windows.h>
int leap_year(int i)
  {
	if((i%4==0)&&(i%100==0)||(i%400==0))
	{
     	return 1;
	}else 
		{
		return 0;
        }
	
	}
	int main(){
		int i=0;
		int m=0;
	    printf("请输入年份:\n");
	         scanf("%d",&i);
	         m=leap_year(i);
		     if(m==1)
		{
			   printf("%d 是闰年\n",m);
			
		}
		      else 
		{
		     	printf("%d 不是闰年\n",m);
			
		}          system("pause");
		           return 0;
		
	}


	



 
