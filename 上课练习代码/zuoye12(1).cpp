#define _CRT_SECURE_NO_WARNINGS

#include "stdio.h"
#include "stdlib.h"
unsigned int reverse_bits(unsigned int value) {
	unsigned int answer = 0;
	unsigned int i;
	for (i = 1; i != 0; i <<= 1)
	{
		answer <<= 1;
		if (value & 1) {
			answer |= 1;
		}
		value >>= 1;
	}
	return answer;
}
int main()
{
	
	printf("·´×ªºó:%u", reverse_bits(25));
system("pause");

}



