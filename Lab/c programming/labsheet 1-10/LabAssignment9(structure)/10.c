 #include <stdio.h>
 struct Date
 {
	int day,month,year;
 }d[3];
 void difference(struct Date d[3]);
 void main()
 {
 	int i;
	printf("Enter first date:\n");
	for(i=0;i<2;i++)
	{
		printf("Year:");
		scanf("%d",&d[i].year);
		printf("Month:");
		scanf("%d",&d[i].month);
		printf("Day:");
		scanf("%d",&d[i].day);
		printf("\nEnter another date:\n");
	}
	difference(d);
 }
 void difference(struct Date d[3])
 {
 	
 	if(d[1].day>d[0].day)
 	{
 		d[2].day=d[1].day-d[0].day;
	}
 	else
	{
 		d[1].day+=30;
		d[1].month--;	
		d[2].day=d[1].day-d[0].day;
	}
	if(d[1].month>d[0].month)
 	{
 		d[2].month=d[1].month-d[0].month;
	}
 	else
	{
 		d[1].month+=12;
		d[1].year--;	
		d[2].month=d[1].month-d[0].month;
	}
	d[2].year=d[1].year-d[0].year;
	printf("Sum of given date is: \n");
	printf("%d Year \n%d Month \n%d Days",d[2].year,d[2].month,d[2].day);
 }
