#include<stdio.h>
struct student{
	int roll;
	char name[20];
	int marks[5];
	int total;
};
void main()
{
	struct student s[5];
	int i,j,sum=0,n=3;
	char s_name[5][20]={ "C", "English" , "MAth" , "Mgnt" , "Sans" };
	float avg[5];
	for (i=0;i<n;i++)
	{
		printf("Enter the detail of %d student \n",i+1);
		printf("Enter roll no: ");
		scanf("%d",&s[i].roll);
		printf("Enter name : ");
		fflush(stdin);
		scanf("%s",&s[i].name);
		printf("Enter the marks of five subject \n");
		for (j=0;j<5;j++)
		{
			printf("%s :",s_name[j]);
			scanf("%d",&s[i].marks[j]);
			sum+=s[i].marks[j];
		}
		s[i].total=sum;
		avg[i]=(float)s[i].total/5;
		sum=0;	
	}
	//displaying the data
	printf("\t\tDisplaying the data\n");
	for (i=0;i<n;i++)
	{
		printf("roll\tname\t\t");
		for(j=0;j<6;j++)
		{
			printf("%s\t",s_name[i]);
		}
		printf("total\t average");
	}
	for(i=0;i<n;i++)
	{
		printf("%d\t%s\t\t",s[i].roll,s[i].name);
		for(j=0;j<5;j++)
		{
			printf("%d\t",s[i].marks);
		}
			printf("%d\t%.2f",s[i].total,avg[i]);
	}
}
