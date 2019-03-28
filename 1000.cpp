#include<stdio.h>
#include<string.h>
int shu(char a)
{
	return(a-'0');
	
}
int main(){

char a[1000],b[1000];
int num[1001];
int n,i,j=1,a1,b1,k,t;
scanf ("%d",&n);
while(n--)
{
	if(j!=1)
	printf("\n");
	scanf("%s",a);
	a1=strlen(a);
	scanf("%s",b);
	b1=strlen(b);
	k=(a1>b1)?a1:b1;
	for(i=0;i<=k;i++)
	num[i]=0;
	t=k;
	for (k;a1>0&&b1>0;k--)
	{
		num[k]+=shu(a[--a1])+shu(b[--b1]);
		if(num[k]/10)
		{
			num[k-1]++;
			num[k]%=10;
			
		}
	}
	while(a1>0)
	{
		num[k--]+=shu(a[--a1]);
		if(num[k+1]%=10)
		{
			num[k]++;
			num[k+1]%=10;
			
		}
	}
  while(b1>0)
       {
            num[k--]+=shu(b[--b1]);
            if(num[k+1]/10)
           {
               num[k]++;
               num[k+1]%=10;
           }
       }

       printf("Case %d:\n",j++);
       printf("%s + %s = ",a,b);
       for(i=0;i<=t;i++)
       {
           if(i==0&&num[i]==0)
           i++;
           printf("%d",num[i]);
       }
       printf("\n");
   }
   return 0;
	
 } 


 
