#include<stdio.h>
struct rainfall
{
	int month[6];
}a[5];
void main()
{
	int i,j,n=5;
	char mon[6][4] = {"Jan" , "Feb" , "Mar" , "Apr" , "May" , "Jun"};
	char city[5][20]= {"Kathmandu" , "New Delhi" , "Bankok  " , "Tokyo   " , "Colombo "};
	for(i=0;i<5;i++)
	{
		printf("\nEnter the rainfall detai of %s:\n",city[i]);
		for (j=0;j<6;j++)
		{
			printf("%s:",mon[j]);
			scanf("\t%d",&a[i].month[j]);
		}
	}
	printf("\t\tRain fall of frist half year '\t\n'");
	printf("---------------------------------------------------\n");
	for (j=0;j<6;j++)
	{
		printf("\t%s",mon[j]);	
	}
	printf("\n---------------------------------------------------\n");
	for(i=0;i<5;i++)
	{
		printf("\n%s",city[i]);
		for(j=0;j<6;j++)
		{
			printf("\t%d",a[i].month[j]);
		}
	}
	printf("\n----------------------------------------------");

}
