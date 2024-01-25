#include<stdio.h>
void main ()
{
	int height[20],i,large;
	int *p;
	p=height;
	printf("Enter the element of a:");
	for (i=0;i<5;i++)
	{
		scanf("%d",(p+i));
	}
	large=*p;
for(i=0;i<5;i++)
	{
		if (*(p+i)>large)
		{
		large=*(p+i); 
		}
	}
	printf("The largest number is %d ",large);	

}
