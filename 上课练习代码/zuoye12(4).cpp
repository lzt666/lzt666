#define _CRT_SECURE_NO_WARNINGS

#include "stdio.h"
#include "stdlib.h"
#include "windows.h"
#include "assert.h"
#include "string.h"
void swap(char *left, char *right) 
{
	assert(left != NULL);
	assert(right != NULL);
	while (left < right) 
	{
		char tmp = *left;
		*left = *right;
		*right = tmp;
		left++;
		right--;
	}
}
void reverse(char *arr)
{
	int len = strlen(arr);
	swap(arr, arr + len - 1);
	while (*arr != '\0')
	{
		char*begin = arr;
		char*end = begin;
		while ((*end != ' ') && (*end != '\0'))
		{
			end++;
		}
		swap(begin, end - 1);
		if (*end != '\0') {
			arr = end + 1;

		}
		else
		{
			arr = end;
		}

	}

}
	int main()
	{    
		
		char arr[] = "student a am I";

		reverse(arr);
		printf("%s\n", arr);
		system("pause");
		return 0;
	}

