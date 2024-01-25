#include<stdio.h>
struct college
{
	char name[30];
	char location[30];
	int faculty_no;
};
void main()
{
	struct college col;
	FILE *fp;
	char c;
	fp=fopen("university.dat","wb+");
	do
	{
		printf("\nEnter the namr of college: ");
		fflush(stdin);
		gets(col.name);
		printf("\nEnter the locatiion of college");
		gets(col.location);
		printf("\nEnter the no of faculty");
		scanf("%d",&col.faculty_no);
		fwrite(&col,sizeof(col),1,fp);
		printf("Do you want another record ?(y/n)");
		fflush(stdin);
		scanf("%c",&c);
		
	}
	while(c=='y');
	rewind(fp);
	fread(&col,sizeof(col),1,fp);
	printf("Name of college in Kathmandu");
	while(!feof(fp))
	{
		if (strcmp(col.location,"kathmandu")==0)
		{
			printf("Name of colege is %s"",col.name");
			printf("\n*********************");
		}
		fread(&col,sizeof(col),1,fp);
	}
	fclose(fp);	
}
