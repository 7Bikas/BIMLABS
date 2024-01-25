
#include<stdio.h>
int large(int,int,int);
void main()
{
	int a,b,x,c;
	printf("Enter any three number :");
	scanf("%d%d%d",&a,&b,&c);
	x=large(a,b,c);
	printf("The largest number is %d",x);
}
int large(x,y,z)
{
	if (x>y && x>z)
	{
		return x;
	}
	else if(y>x && y>z)
	{
		return y;
	}
	else
	{
		return z;
	}
}
