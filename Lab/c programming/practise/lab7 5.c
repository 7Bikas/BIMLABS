#include<stdio.h>
void square();
void main()
{
	square();	
}
void square()
{
	int a,s;
	printf("Enter a number :");
	scanf("%d",&a);
	s=a*a;
	printf("The  square of %d is %d",a,s);
}
