#include<stdio.h>
struct weather 
{
	int month[6];
}city[5];
void main()
{
	char c[5][20]={"Kathmandu" , " New Delhi" , "Bankok " , "Tokyo " , "Colombo " };
	char m[6][20]={"Jan" , "Feb " , "Mar " , "Apr " , "MAy " , "Jun "};
	int i,j;
	for (i=0;i<5;i++)
	{
		printf("Enter rainfall of %s\n",c[i]);
		for (j=0;j<6;j++)
		{
			printf("%s",m[j]);
			scanf("%d",&city[i].month[j]);
		}
	}
	printf("\t Rainfall opf first half year \n\t");
	for (i=0;i<6;i++)
	{
		printf("\t%s",m[i]);
	}
	for(i=0;i<5;i++)
	{
		printf("\n%s",c[i]);
		for(j=0;j<6;j++)
		{
			printf("\t%d",city[i].month[j]);
		}
	}
}
