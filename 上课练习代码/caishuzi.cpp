#include <stdio.h>
#include <time.h>
#include <stdlib.h>
int main(){
	srand(time(0));
	int to_guess=rand()%100+1; 
	while(1){

	printf("������һ��1-100��������");
	int num=0;
	scanf("%d",&num);
	if(num>to_guess)
	{
		printf("����!\n");
		
	 } 
	 else if(num<to_guess)
	 {
	 	printf("����!\n");
		  
	 }
	 else{
	 	printf("�¶��ˣ�\n");
	 	break;
	 } 
	 }	 
    } 
