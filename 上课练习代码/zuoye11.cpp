#include <stdio.h>
#include <stdlib.h>
#include <math.h>
int main()
{
	int count = 0;
	int i = 0;
	for (i = 100; i <= 200; i++)
	{
		int j = 0;
		for (j = 0; j <= sqrt(i); j++)
		{
			if (i%j == 0)
				break;
		}
		if (j > sqrt(i)) {
			count++;
			printf("%d", i);

		}
	}
	printf("\n");
	printf("素数个数为：%d", count);
	return 0;
}
