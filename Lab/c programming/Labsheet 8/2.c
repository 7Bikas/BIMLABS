//accept 2 number and perform add, sub,multi,and div by using pointer ;
#include<stdio.h>
void main()
{
	int a,b;
	int *p1,*p2;
	printf("Enter two  number :\n");
	scanf("%d%d",&a,&b);
	p1=&a;
	p2=&b;
	printf("Addition of %d and %d =%d \n",*p1,*p2,*p1+*p2);
	printf("Subtraction of %d and %d =%d\n ",*p1,*p2,*p1-*p2);
	printf("Multiplication of %d and %d =%d\n ",*p1,*p2,*p1**p2);
	printf("Division of %d and %d =%d \n",*p1,*p2,*p1/ (*p2));
}
