#define _CRT_SECURE_NO_WARNINGS

#include "stdio.h"
#include "stdlib.h"
#include "windows.h"
int main()
{
	int   a=15;
	int   b=5;
	printf("ƽ����Ϊ:");
	printf("%d\n", (a&b) + ((a^b) >> 1));
	system("pause");
	return 0;

}




