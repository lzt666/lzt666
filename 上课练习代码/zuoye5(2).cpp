#include <stdio.h>
#include <string.h>

int main()
{
	int i=0;
	char password[20]={0};//定义密码为123456789 
	for(i=0;i<=3;i++){
		printf("请输入密码:\n");
		scanf("%s",&password);
		if(0==strcmp(password,"123456789"))
		{
			break;
		 } else
		 {
		 	printf("密码错误，请重新输入！\n");
		 }
	}
	if(i<=3){
		printf("登陆成功！\n");
		
	}
	else{
		printf("退出登录"); 
		 
	}return 0;
 } 

