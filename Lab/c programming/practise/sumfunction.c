#include<stdio.h>
void sum();
void main()
{
	sum();
}
void sum()
{
	int a,b,sum=0;
	printf("Enter two number :");
	scanf("%d%d",&a,&b);
	sum=a+b;
	printf("The sum is %d ",sum);
}
