#include "stdio.h"
#include "stdlib.h"
int main() 
{
	int a = 1, b = 1, c=1, d = 1, e = 1;
	for (a = 1; a <= 5; a++)
	{
		for (b = 1; b <= 5; b++)
		{
			for (c = 1; c <= 5; c++)
			{
				for (d = 1; d <= 5; d++)
				{
					for (e = 1; e <= 5; e++) 
					{
						if ((b == 2) + (a == 3) == 1 && (b == 2) + (e == 4) == 1 && (c == 1) + (d == 2) == 1 && (c == 5) + (d == 3) == 1 && (e == 4) + (a == 1) == 1)
						{
							printf("a=%d\n b=%d\n c=%d\n d=%d\n e=%d\n",a,b,c,d,e);
							system("pause");
							return 0;
						}
					}
				}
			}
		}
	}
}
