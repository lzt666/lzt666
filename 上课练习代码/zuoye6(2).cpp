#include <stdio.h>
#include <stdlib.h>
#include <string.h>
void InitArry(int arr[],int size)
{
	//初始化函数可以使用memset函数
	for(int i=0;i<=size;i++){
		arr[i]=i;
		
	} 
 } 
 void EmptyArry(int arr[],int size)
 {
 	memset(arr,0,sizeof(arr[0])*size);
	  
 } 
 void ReverseArry(int arr[],int size)
 {
 	int left=0;
 	int right=size-1;
 	while(left<right)
 	{
 		int tmp=arr[left];
 		arr[left]=arr[right];
 		arr[right]=tmp;
 		left++;
 		right--;
 		
	 }
 }
 void PrintArry(int arr[],int size){
 for(int i=0;i<size;i++){
 	printf("%d ", arr[i]);
 	
 }	printf("\n");
 }
 int main(){
 	int a[20];
 	int _size=sizeof(a)/sizeof(a[0]);
	 InitArry(a,_size);
	 PrintArry(a,_size);
	 ReverseArry(a,_size);
	 PrintArry(a,_size);
	 system("pause");
	 return 0;
	  
 }
 
