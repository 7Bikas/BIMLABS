//WAP to calculate cube using funnction.
//argument and return type
#include<stdio.h>
int cube(int);
void main()
{
	int a,b;
	printf("Enter a number :");
	scanf("%d",&a);
	b=cube(a);
	printf("The cube is %d",b);
}
int cube(b)
{
	int c;
	c=b*b*b;
	return c;	
}
