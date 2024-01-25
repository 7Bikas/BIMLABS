#include<stdio.h>
void sum(int,int);
void main()
{   
	int x=9, y=19;
	sum(x,y);
	
}
void sum(int a,int b)
{
	int sum=0;
	sum=a+b;
	printf("The sum is %d ",sum);
}
