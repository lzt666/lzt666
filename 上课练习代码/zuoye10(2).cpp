#include "stdio.h"
#include "stdlib.h"
#include "windows.h"
int Murder()//����ıɱ��
{
	char Killer;
	for (Killer = 'A'; Killer <= 'D'; Killer++)
	{
		if (3 == ((Killer != 'A') + (Killer == 'C') + (Killer == 'D') + (Killer != 'D')))//�ж�ֻҪ��������˵�滰��һ����˵�ٻ�����Ϊ 3���Ϳ��ҳ�����
		{
			printf("������:%c\n", Killer);
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
