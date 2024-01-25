#include<stdio.h>
struct employee 
{
	int accountno;
	char name [50];
	char post [50];
	float balance ;
	
} e[100];
void main ()
{
	int i,n,index;
	float maxbalance=0;
	printf ("How many student data you want?:  " );
	scanf("%d",&n);
	for (i=0;i<n;i++)
	{
		printf("Enter the detail of %d employee",i+1);
		printf("\n\n");
		printf("Account no :");
		scanf("%d",&e[i].accountno);
		printf("Name :");
		fflush(stdin);
		gets(e[i].name);
		printf("Post  :");
		gets(e[i].post);
		printf("Balance =");
		scanf("%f",&e[i].balance);
		printf("\n");
		
	}
	maxbalance =e[0].balance;
	index=0;
	for(i=0;i<n;i++)
	{
		if (e[i].balance > maxbalance)
		{
			maxbalance =e[i].balance;
			index=i;
		}
		
	}
	printf("\n\nCustomer having higest balance :");
		printf("\n\n");
		printf("Account no : %d\n",e[index].accountno);
		printf("Name: %s\n",e[index].name);
		printf("Post: %s\n",e[index].post);
		printf("Balance: %.2f",e[index].balance);
	
}
