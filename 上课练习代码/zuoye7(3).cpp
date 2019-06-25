#define _CRT_SECURE_NO_WARNINGS
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
#include <string.h>
int main()
{
	int m = 0;
	int n = 0;
	int i = 0;
	int k = 0;
	int count = 0;
	printf("请输入两个数字:");
	scanf("%d %d", &m, &n);
	i = m ^ n;
	while (i) {
		if (i % 2 == 1) {
			count++;

		}
		i = i / 2;

	}
	printf("count=%d", count);
	system("pause");
	return 0;
}

