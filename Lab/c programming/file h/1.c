#include<stdio.h>
void main()
{
	FILE *fp;
	char c;
	printf("Enter a character :");
	scanf("%c",&c);
	fp=fopen("char.dat","w+");
	if (fp==NULL)
	{
		printf ("Error in creating file.");
	}
	else
	{
		fputc(c,fp);
		printf("Content is :");
		fseek(fp,0,SEEK_SET);
		c=fgetc(fp);
		printf("%c",c);
		fclose(fp);
	}	
}
