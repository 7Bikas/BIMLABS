#include<stdio.h>
struct student 
{
	int roll_no ;
	char name[50];
	char address[50];
	float marks ;
};
void main()
{
	struct student s1[100];
	int n,i;
	printf("How many student record you want ?\n ");
	scanf("%d",&n);
	for (i=0;i<n;i++)
	{
		printf("\nEnter the record of %d student ",i+1);
		printf("\nEnter the roll no :");
		scanf("%d",&s1[i].roll_no);
		printf("\nEnter the name of student:");
		fflush(stdin);
		gets(s1[i].name);
		printf("\nEnter the address :");
		fflush(stdin);
		gets(s1[i].address);
		printf("\nEnter the obtain marks :");
		scanf("%.2f",&s1[i].marks);
	}
}
