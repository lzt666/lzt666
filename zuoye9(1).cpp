#define _CRT_SECURE_NO_WARNINGS//头文件 
#include <stdio.h>
#include <stdlib.h>
#include <math.h>
#include <time.h>
#include <string.h>
#define rows  12
#define cols  12
#define  Count 10


int menu();
void display(char show[rows][cols]);
int Game(char mine[rows][cols], char show[rows][cols]);
int Sweep(char mine[rows][cols], char show[rows][cols]);
void set_mine(char mine[rows][cols]);
int get_num(char mine[rows][cols], int x, int y);



#include "game.h"
 
int menu() {//菜单界面
	printf("*************************************\n");
	printf("*************************************\n");
	printf("*************************************\n");
	printf("******welcome to playing saole*******\n");
	printf("***********1.     play  *************\n");
	printf("***********0.     exit  *************\n");
	printf("*************************************\n");
	printf("*************************************\n");
	printf("*************************************\n");
	return 0;
}

void set_mine(char mine[rows][cols])
{
	int count = Count;
	int x = 0;
	int y = 0;
	srand((unsigned)time(NULL));
	while (count) {
		x = rand() % 9 + 1;
		y = rand() % 9 + 1;
		if (mine[x][y] == '0') {
			mine[x][y] ='1';
			count--;
		}
	}
}

void  display(char show[rows][cols]) {
	int i = 0;
	int j = 0;
	printf(" ");
	for (i = 1; i < cols - 1; i++) {
		printf("%d", i);

	}
	printf("\n");
	for (i = 1; i < cols - 1; i++) {
		printf("%d", i);
		for (j = 1; j< cols - 1; j++) {
			printf("%c", show[i][j]);

		}
		printf("\n");

	}
	
}
int get_num(char mine[rows][cols],int x,int y) 
{
	int count = 0;
	if (mine[x - 1][y - 1] == '1')//左上方
	{

		count++;
	}
	if (mine[x - 1][y] == '1') //左方
	{
		count++;
	}
	if (mine[x][y -1] == '1') //上方
	{
		count++;
	}
	if (mine[x][y +1] == '1') //下方
	{
		count++;
	}
	if (mine[x +1][y - 1] == '1') //右上方
	{
		count++;
	}
	if (mine[x + 1][y] == '1') //右方
	{
		count++;
	}

	if (mine[x + 1][y + 1] == '1') //右下方
	{
		count++;
	}
	return count;
}
int Sweep(char mine[rows][cols], char show[rows][cols])
{
	int count = 0;
	int x = 0;
	int y = 0;
	while (count != ((rows - 2)*(cols - 2) - Count)) {
		printf("请输入坐标:\n");
		scanf("%d%d", &x, &y);
		if (mine[x][y] == '1') {
			printf("你踩到雷了！！\n");
			return 0;
		}
		else {
			int ret = get_num(mine, x, y);
			show[x][y] = ret + '0';
			display(show);
			count++;
		}

	}
	printf("恭喜你，你赢了！！\n");
	display(mine);
	return 0;
	}

int Game(char mine[rows][cols], char show[rows][cols]) {
	set_mine(mine);
	display(show);
	Sweep(mine, show);
	return 0;
}


#include "game.h"
int main() {
	int input = 0;
	char mine[rows][cols];
	char show[rows][cols];
	int i = 0;
	int j = 0;
	for (i = 0; i < rows - 1; i++)
	{
		for (j = 0; j < cols - 1; j++)
		{
			mine[i][j]='0';
			show[i][j]='*';
		}
	}
	menu();
	while (1) {
		printf("请选择:");
		scanf("%d", &input);
		if (input == 1) {
			printf("进入游戏:\n");
			Game(mine, show);
			break;
		}
		else if(input){
			printf("退出游戏！\n");
			exit(0);
			break;
		}
		else {
			printf("输入有误！！\n");
		}
	}
	return  0;
}


