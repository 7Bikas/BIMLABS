#include<stdio.h>
void main()
{
	FILE *fp;
	char a;
	printf("Enter a character :");
	scanf("%c",&a);
	fp=fopen("char.dat","a");
	if(fp==NULL)
	{
		printf("Error file !!!!");
		exit(0);
	}
	fputc(a,fp);
	fclose(fp);
	printf("Content is :");
	fp=fopen("char.dat","r");
	while((a=fgetc(fp))!=EOF)
	{
		printf("%c",a);
	}
	fclose(fp);
}
