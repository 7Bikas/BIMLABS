#include<stdio.h>
void main()
{
	int i,j,k;
	for(i=1;i<=5;i++)
	{
		for(j=1;j<=i;j++)
		{
			printf(" ");
		}
		for(k=6-i;k>=1;k--)
		{
			printf("%d",k);
		}
		printf("\n");
	}
}
