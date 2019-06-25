#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
#include <string.h>
int main()
{
	int len, i;
	char num[100];
	printf("请输入一个整数:");
    scanf("%s", num);
    len = strlen(num);
	for (i = 0; i <= len; i++)
	{
		printf("%c\n", num[i]);
	}
	if (num[0] != 45) //可以显示负数的符号
	{
		printf("位数为: %d\n",len);

	}
	else
	{
		len = len - 1;
		printf("位数为: %d\n", len);

	}system("pause");
	return 0;
}
