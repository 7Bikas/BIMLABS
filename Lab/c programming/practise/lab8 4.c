#include<stdio.h>
int intrest(int,int,int);
void main()
{
	int p,r,t;
	float x;
	printf("Enter the principal :");
	scanf("%d",&p);
	printf("Enter the number of year : ");
	scanf("%d",&t);
	printf("Enter the rate of interst : ");
	scanf("%d",&r);
	x=intrest(p,r,t);
	printf("The intrest id %.2f",x);	
}
int intrest(a,b,c)
{
	int si;
	si=(a*b*c)/100;
	return si;
}
