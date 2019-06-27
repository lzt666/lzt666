#include "stdio.h"
#include "stdlib.h"
#include "windows.h"
int Murder()//侦破谋杀案
{
	char Killer;
	for (Killer = 'A'; Killer <= 'D'; Killer++)
	{
		if (3 == ((Killer != 'A') + (Killer == 'C') + (Killer == 'D') + (Killer != 'D')))//判断只要有三个人说真话，一个人说假话，和为 3，就可找出凶手
		{
			printf("凶手是:%c\n", Killer);
		}
	}
	return 0;
}
int main()
{
	Murder();
	system("pause");
	return 0;
}
