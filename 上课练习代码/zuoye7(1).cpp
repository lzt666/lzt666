#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
#include <string.h>
int main()
{
	int num = 0;
	int i = 0;
	int tmp;
	scanf_s("%d", &num);
	printf("奇数位为:");//奇数位位比较
	for (i = 31; i >= 0; i = i - 2)
	{
		tmp = (num >> i) & 1;
		printf("%d", tmp);

	}
	printf("\n");
	printf("偶数位为:");
	for (i = 30; i >= 0; i = i - 2);//偶数位位比较
	{
		tmp = (num >> i) & 1;
		printf("%d", tmp);
	}
	printf("\n");
	system("pause");
	return 0;
}
