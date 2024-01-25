//largest num among three number 
#include<stdio.h>
void main()
{
	int a,b,c;
	int *p1,*p2,*p3;
	printf("Enter any three number :\n");
	scanf("%d%d%d",&a,&b,&c);
	p1=&a;
	p2=&b;
	p3=&c;
	if(*p1>*p2 && *p1>*p3)
	{
		printf("Largest =%d",*p1);
	}
	else if (*p2>*p1 && *p2>*p3)
	{
		printf("Largest =%d ",*p2);
	}
	else 
	{
		printf("Largest=%d",*p3);
	}
}
