#include<stdio.h>
void main()
{
	char a;
	char *p1;
	printf("Enter an input:\t");
	scanf("%c",&a);
	p1=&a;
	if (*p1>='0'&& *p1<='9')
	{
		printf("%c is a number.",*p1);
	}
	else
	{
		printf("%c is a character.",*p1);
	}
}
