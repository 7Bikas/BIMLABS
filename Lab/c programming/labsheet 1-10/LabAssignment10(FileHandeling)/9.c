#include<stdio.h>
struct information
{
	char name[100];
	float price;
	int id;
}a;
void main()
{
	int i;
	FILE *fp;
	fp=fopen("item.txt","r");
	printf("Showing detail of products:");
	while(!feof(fp))
	{
		fread(&a,sizeof(a),1,fp);
		printf("\nID: %d \nName: %s \nPrice: %.2f\n",a.id,a.name,a.price);	
	}
	fclose(fp);
}
