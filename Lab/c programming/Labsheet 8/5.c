//WAP to display the sum and average of number 1 to n.
#include<stdio.h>
void main()
{
	int sum=0,*p1,*p,a,i;
	float avg;
	printf("Enter how many number you want from 1:\n");
	scanf("%d",&a);
	p1=&a;
	
	for (i=1;i<=*p1;i++)
	{
		sum+=i;
	}
	avg=(float)sum/(*p1);
    printf("The sum of number from 1 to %d =%d\n",*p1,sum);
	p=&sum;
	printf("Average=%.2f",avg);
		
}
