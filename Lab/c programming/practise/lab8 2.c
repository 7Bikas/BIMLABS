//WAP that call a function called getarea().This function is responsible for reading the length 
//and breadth and print the area of rectangle 
#include<stdio.h>
void getarea();
void main()
{
	getarea();
}
void getarea()
{
	int a,b,c;
	printf("Enter length and breadth of rectangle : ");
	scanf("%d%d",&a,&b);
	c=a*b;
	printf("The area of rectange is %d",c);
}
