#define _CRT_SECURE_NO_WARNINGS

#include "stdio.h"
#include "stdlib.h"
#include "windows.h"
int main()
{
	int m = 0;
	int i = 0;
	int arr[] = {1,2,3,4,5,6,7,8,9,8,7,6,5,4,3,2,1 };
	m = arr[0];
	for (i = 1; i < sizeof(arr) / sizeof(arr[0]); i++) {
		m = m ^ arr[i];//异或数组中的每一个元素，相同的为0，不同的为它本身，遍历数组

	}
	printf("%d", m);
	system("pause");
	return 0;
}

