#include<stdio.h>
void main()
{
	int a[10],i;
	int *p;
	p=a;
	printf("Enter 10 element :");
	for (i=0;i<10;i++)
	{
		scanf("%d",(p+i));
	}
	printf("The element arre :");
	for(i=0;i<10;i++)
	{
		printf("a[%d]=%d\n",i,*(p+i));
	}
}
