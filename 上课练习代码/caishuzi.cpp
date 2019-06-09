#include <stdio.h>
#include <time.h>
#include <stdlib.h>
int main(){
	srand(time(0));
	int to_guess=rand()%100+1; 
	while(1){

	printf("请输入一个1-100的整数：");
	int num=0;
	scanf("%d",&num);
	if(num>to_guess)
	{
		printf("高了!\n");
		
	 } 
	 else if(num<to_guess)
	 {
	 	printf("低了!\n");
		  
	 }
	 else{
	 	printf("猜对了！\n");
	 	break;
	 } 
	 }	 
    } 
