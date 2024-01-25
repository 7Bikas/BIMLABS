#include<stdio.h>
int largest(int *);
void main()
{
	int a[5],b;
	int i;
	printf("Enter a numbers:\n");
	for(i=0;i<5;i++)
	{
		scanf("%d\n",&a[i]);
	}
	b=largest (&a);
	printf("The largest value is %d",b);
	
}
int largest(int *p)
{
	int b,i;
	b=*p;
	for(i=0;i<5;i++)
	{
		if (*(p+i)>b)
		{
			b=*(p+i);
		}
	}

	return b;	
}
