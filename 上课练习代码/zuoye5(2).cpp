#include <stdio.h>
#include <string.h>

int main()
{
	int i=0;
	char password[20]={0};//��������Ϊ123456789 
	for(i=0;i<=3;i++){
		printf("����������:\n");
		scanf("%s",&password);
		if(0==strcmp(password,"123456789"))
		{
			break;
		 } else
		 {
		 	printf("����������������룡\n");
		 }
	}
	if(i<=3){
		printf("��½�ɹ���\n");
		
	}
	else{
		printf("�˳���¼"); 
		 
	}return 0;
 } 

