#include<stdio.h>
void main()
{
	int a[10],b[10],c[10],i,sum;
	int *p,*d;
	p=a;
	d=b;
	printf("Enter the 10 element of array A:\n");
	for(i=0;i<10;i++)
	{
		scanf("%d",(p+i));
	}
	printf("Enter the element of array B:\n");
	for (i=0;i<10;i++)
	{
		scanf("%d",(d+i));
	}
	for (i=0;i<10;i++)
	{
		c[i]=*(p+i)+*(d+i);
	}
	printf("The sum of A and B are :\n");
	for (i=0;i<10;i++)
	{
		printf("c[%d]=%d\n",i,c[i]);
	}
	
}
