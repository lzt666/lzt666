#include <stdio.h>
#include <stdlib.h>
#include <string.h>
int main(){
	int arr[10]={1,2,3,4,5,6,7,8,9,10};
	int k=5;
	int left=arr[0];
	int right=sizeof(arr)/sizeof(arr[0])-1;
	while(left<=right)
	{
		int mid=left+(right-left)/2;
		if (arr[mid]==k){
			printf("找到了,下标为:%d\n",mid);
			break;
			
			
		}
		else if(arr[mid]<=k){
			left=mid+1;
		
		}
		else{
			right=mid-1;
		}
	}
	if (left>right){
		printf("没有找到！！\n");
	}
	system("pause");
	return 0;
}
