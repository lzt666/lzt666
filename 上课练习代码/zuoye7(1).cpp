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
	printf("����λΪ:");//����λλ�Ƚ�
	for (i = 31; i >= 0; i = i - 2)
	{
		tmp = (num >> i) & 1;
		printf("%d", tmp);

	}
	printf("\n");
	printf("ż��λΪ:");
	for (i = 30; i >= 0; i = i - 2);//ż��λλ�Ƚ�
	{
		tmp = (num >> i) & 1;
		printf("%d", tmp);
	}
	printf("\n");
	system("pause");
	return 0;
}
