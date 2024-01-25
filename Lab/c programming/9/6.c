#include<stdio.h>
struct date{
	int year;
	int month;
	int day;
};
void main()
{
	struct date d1;
	int day,year,month;
	printf("Enter current date:");
	printf("Enter year :");
	scanf("%d",&d1.year);
	printf("Enter the month:");
	scanf("%d",&d1.month);
	printf("Enter the day:");
	scanf("%d",&d1.day);
	d1.month++;
	d1.day+=15;
	if (d1.day>30)
	{
		d1.month++;
		d1.day-=30;
	}
	if (d1.month>12)
	{
		d1.year++;
		d1.month-=12;
	}
	printf("\nThe current date is %d day %d month %d year",d1.day,d1.month,d1.year);
}
